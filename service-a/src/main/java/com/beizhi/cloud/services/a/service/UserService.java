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

	@Transactional(readOnly = false)
	public User createUser(User user) {
		userMapper.insert(user);
		return getUserById(user.getId());
	}

	public User getUserById(Integer id) {
		return userMapper.getById(id);
	}

	@Transactional(readOnly = false)
	public User updateUser(User user) {
		userMapper.update(user);
		return getUserById(user.getId());
	}

	@Transactional(readOnly = false)
	public void deleteUser(Integer userId) {
		userMapper.delete(userId);
	}
}
