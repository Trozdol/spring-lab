package com.example.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class Model<T> {

    /**
	 * Update the model instance values with an object. Too lazy to check if json body has 
	 * all fields then calling individual setters.
	 *   
	 * @param changes
	 * @return this
	 * @throws Exception
	 */
	public T update(T changes) throws Exception {
		
		/**
		 * For each field, in changes object update 
		 * matching field in model.
		 */
		for (Field field : changes.getClass().getDeclaredFields()) {
			Boolean wasPrivate = !field.isAccessible(); 
			if (wasPrivate) field.setAccessible(true); // private field fix: I feel like this isn't the real solution but just wanted this working for now. 
			
			/**
			 * Check if field value is null or is the same as 
			 * current and skip if true. 
			 */		
			if (field.get(changes) == null || field.get(changes) == field.get(this)) continue;

			String fieldName = field.getName();
			String setterName = String.format("set%1$s", capitalize(fieldName));
			Method setter = this.getClass().getDeclaredMethod(setterName, field.get(changes).getClass());
			
			System.out.println(fieldName + ": " + field.get(this) + " => " + field.get(changes));
			
			setter.invoke(this, field.get(changes));
			
			if (wasPrivate) field.setAccessible(false); // Return the field to it's private state.
		}
		return (T) this;
		
	}
	
	/**
	 * Capitalizes first character of a string.
	 * 
	 * TODO: Move to a util class at some point.
	 * 
	 * @param input
	 * @return
	 */
    private String capitalize(String input) {
		if (input == null || input.length() < 1) return input;
		char[] chars = input.toCharArray();
		chars[0] = Character.toUpperCase(chars[0]);
		return new String(chars);
	}
}