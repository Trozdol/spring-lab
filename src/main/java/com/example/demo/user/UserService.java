package com.example.demo.user;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users = Arrays.asList(new User(1), new User(2), new User(3));
	
	public List<User> selectAll() {
		return users;
	}

	public User select(Integer id) {
		return users.stream().filter(user -> user.getBwUserID().equals(id)).findFirst().get();
	}

	public User create(User user) {
		user.setBwUserID(users.size());
		users.add(user);
		return user;
	}

	public User update(Integer id, User editedUser) {
		
		User user = select(id);
		
		try {
			return (User) user.update(editedUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public Boolean delete(Integer id) {
		return users.remove(select(id));
	}
}
