package com.example.demo.user;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;


public class User {
	
	public User() {
		
	}
	
	public User(Integer id) {
		this.bwUserID = id;
	}
	
	public User update(Object changes) throws Exception {
		System.out.println("update()");
		for (Field field : changes.getClass().getDeclaredFields()) {
			
			if (field.get(changes) == null || field.get(changes) == field.get(this)) continue;

            String fieldName = field.getName();
            String setterName = String.format("set%1$s", capitalize(fieldName));
			Method setter = this.getClass().getDeclaredMethod(setterName, field.get(changes).getClass());
			
			System.out.println(fieldName + ": " + field.get(this) + " => " + field.get(changes));
			
			setter.invoke(this, field.get(changes));
		}
		return this;
	}

    private String capitalize(String input) {
		if (input == null || input.length() < 1) return input;
		char[] chars = input.toCharArray();
		chars[0] = Character.toUpperCase(chars[0]);
		return new String(chars);
	}
    
	private Integer bwUserID;
    
    private String bwUserFirstName;
    
    private String bwUserLastName;
    
    private String bwUserEmail;
    
    private String bwUserMobilePhone;
    
    private String bwUserPwd;
    
    private Boolean bwUserActive;
    
    private Date bwUserCreateDate;
    
    private Date bwUserModifiedDate;
    
    private Integer bwBarnID;
    
    private Integer bwUserTypeID;

    
	public Integer getBwUserID() {
		return bwUserID;
	}

	public void setBwUserID(Integer bwUserID) {
		this.bwUserID = bwUserID;
	}

	public String getBwUserFirstName() {
		return bwUserFirstName;
	}

	public void setBwUserFirstName(String bwUserFirstName) {
		this.bwUserFirstName = bwUserFirstName;
	}

	public String getBwUserLastName() {
		return bwUserLastName;
	}

	public void setBwUserLastName(String bwUserLastName) {
		this.bwUserLastName = bwUserLastName;
	}

	public String getBwUserEmail() {
		return bwUserEmail;
	}

	public void setBwUserEmail(String bwUserEmail) {
		this.bwUserEmail = bwUserEmail;
	}

	public String getBwUserMobilePhone() {
		return bwUserMobilePhone;
	}

	public void setBwUserMobilePhone(String bwUserMobilePhone) {
		this.bwUserMobilePhone = bwUserMobilePhone;
	}

	public String getBwUserPwd() {
		return bwUserPwd;
	}

	public void setBwUserPwd(String bwUserPwd) {
		this.bwUserPwd = bwUserPwd;
	}

	public Boolean getBwUserActive() {
		return bwUserActive;
	}

	public void setBwUserActive(Boolean bwUserActive) {
		this.bwUserActive = bwUserActive;
	}

	public Date getBwUserCreateDate() {
		return bwUserCreateDate;
	}

	public void setBwUserCreateDate(Date bwUserCreateDate) {
		this.bwUserCreateDate = bwUserCreateDate;
	}

	public Date getBwUserModifiedDate() {
		return bwUserModifiedDate;
	}

	public void setBwUserModifiedDate(Date bwUserModifiedDate) {
		this.bwUserModifiedDate = bwUserModifiedDate;
	}

	public Integer getBwBarnID() {
		return bwBarnID;
	}

	public void setBwBarnID(Integer bwBarnID) {
		this.bwBarnID = bwBarnID;
	}

	public Integer getBwUserTypeID() {
		return bwUserTypeID;
	}

	public void setBwUserTypeID(Integer bwUserTypeID) {
		this.bwUserTypeID = bwUserTypeID;
	}
}
