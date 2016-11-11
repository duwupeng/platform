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
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> readUserInfo(){
		List<User> ls=userService.searchAll();		
		return ls;
	}

	@PostMapping(value = "/user")
	public User createUser(@RequestBody User userinfo){
		return userService.createUser(userinfo);
	}

	@GetMapping(value = "/user/{userId}")
	public User getUser(@PathVariable("userId") Integer userId){
		return userService.getUserById(userId);
	}

	@DeleteMapping(value = "/user/{userId}")
	public String deleteUser(@PathVariable("userId") Integer userId){
		try{
			userService.deleteUser(userId);
			return "Success";
		}catch (Exception e){
			return "Fail";
		}
	}

	@PutMapping(value = "/user/update")
	public User updateUser(@RequestBody User user){
		return userService.updateUser(user);
	}
}
