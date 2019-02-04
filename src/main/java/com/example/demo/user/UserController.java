package com.example.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Response;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/users")
	public Response<User> selectAll() {
		return new Response<User>(service.selectAll());
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/users/{id}")
	public Response<User> select(@PathVariable Integer id) {
		return new Response<User>(Arrays.asList(service.select(id)));
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public User create(@RequestBody User user) {
		return service.create(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public User update(@PathVariable Integer id, @RequestBody User user) {
		return service.update(id, user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public Boolean delete(@PathVariable Integer id) {
		return service.delete(id);
	}
}
