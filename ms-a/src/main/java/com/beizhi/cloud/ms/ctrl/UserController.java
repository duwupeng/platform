package com.beizhi.cloud.ms.ctrl;

import java.util.List;

import com.beizhi.cloud.ms.service.UserService;
import com.beizhi.cloud.ms.servicea.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(value="/users")
	public List<TUser> readUserInfo(){
		List<TUser> ls=userService.searchAll();
		return ls;
	}

	@GetMapping(value = "/user/{userId}")
	public TUser getUser(@PathVariable("userId") Integer userId){
		System.out.println("userId："+ userId);
		return userService.getUserById(userId);
	}

	@PostMapping(value = "/user/create")
	public Integer createUser(@RequestBody TUser user){
		try{
			System.out.println("userId："+ user);
			return userService.createUser(user);
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@PostMapping(value = "/user/delete/{userId}")
	public Integer deleteUser(@PathVariable("userId") Integer userId){
		try{
			System.out.println("userId："+ userId);
			return userService.deleteUser(userId);
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@PostMapping(value = "/user/update")
	public Integer updateUser(@RequestBody TUser user){
		System.out.println("userId："+ user);
		try{
			return userService.updateUser(user);
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}

	}

}
