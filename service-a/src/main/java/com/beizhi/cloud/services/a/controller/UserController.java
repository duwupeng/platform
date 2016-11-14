package com.beizhi.cloud.services.a.controller;

import java.util.List;

import com.beizhi.cloud.services.a.service.UserService;
import com.beizhi.cloud.services.a.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(value="/users")
	public List<User> readUserInfo(){
		List<User> ls=userService.searchAll();		
		return ls;
	}

	@GetMapping(value = "/user/{userId}")
	public User getUser(@PathVariable("userId") Integer userId){
		System.out.println("userId："+ userId);
		return userService.getUserById(userId);
	}

	@PostMapping(value = "/user/create")
	public User createUser(@RequestBody User user){
		System.out.println("user："+ user);
		return userService.createUser(user);
	}
	@PostMapping(value = "/user/delete/{userId}")
	public String deleteUser(@PathVariable("userId") Integer userId){
		try{
			System.out.println("userId："+ userId);
			userService.deleteUser(userId);
			return "Success";
		}catch (Exception e){
			return "Fail";
		}
	}
	@PostMapping(value = "/user/update")
	public User updateUser(@RequestBody User user){
		System.out.println("userId："+ user);
		return userService.updateUser(user);
	}

}
