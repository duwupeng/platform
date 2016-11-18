package com.beizhi.cloud.ms.service;


import java.util.List;

import com.beizhi.cloud.common.aop.BzService;
import com.beizhi.cloud.ms.dao.UserMapper;
import com.beizhi.cloud.ms.servicea.domain.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
@BzService
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<TUser> searchAll(){
		List<TUser> list = userMapper.findAll();
		System.out.println("list: " + list.size());
		return list;
	}

	public TUser getUserById(Integer id) {
		return userMapper.getById(id);
	}

	@Transactional(readOnly = false)
	public Integer createUser(TUser user) {
		return userMapper.insert(user);
	}

	@Transactional(readOnly = false)
	public Integer updateUser(TUser user) {
		return userMapper.update(user);
	}

	@Transactional(readOnly = false)
	public Integer deleteUser(Integer userId) {
		return userMapper.delete(userId);
	}
}
