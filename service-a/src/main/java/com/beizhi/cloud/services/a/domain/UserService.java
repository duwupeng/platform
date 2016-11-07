package com.beizhi.cloud.services.a.domain;


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
		return list;
	}
}
