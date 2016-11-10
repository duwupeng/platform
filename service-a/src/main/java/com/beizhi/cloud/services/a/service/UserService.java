package com.beizhi.cloud.services.a.service;


import java.util.List;

import com.beizhi.cloud.services.a.dao.UserDao;
import com.beizhi.cloud.services.a.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {

	
	@Autowired
	private UserDao userMapper;
	
	public List<User> searchAll(){
		List<User> list = userMapper.findAll();
		System.out.println("list: " + list.size());
		return list;
	}

	public User get(){
		User user = userMapper.get();
		return user;
	}
	public User save(){
		User user = userMapper.add();
		return user;
	}

	public void delete(){
		userMapper.delete();
	}
	public void update(){
		userMapper.update();
	}
}
