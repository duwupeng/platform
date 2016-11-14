package com.beizhi.cloud.services.a.service;


import java.util.List;

import com.beizhi.cloud.services.a.dao.UserMapper;
import com.beizhi.cloud.services.a.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> searchAll(){
		List<User> list = userMapper.findAll();
		System.out.println("list: " + list.size());
		return list;
	}

	public User getUserById(Integer id) {
		return userMapper.getById(id);
	}

	@Transactional(readOnly = false)
	public Integer createUser(User user) {
		return userMapper.insert(user);
	}

	@Transactional(readOnly = false)
	public Integer updateUser(User user) {
		return userMapper.update(user);
	}

	@Transactional(readOnly = false)
	public Integer deleteUser(Integer userId) {
		return userMapper.delete(userId);
	}
}
