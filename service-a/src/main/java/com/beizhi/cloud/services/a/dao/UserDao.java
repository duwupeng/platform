package com.beizhi.cloud.services.a.dao;

import com.beizhi.cloud.services.a.model.User;

import java.util.List;



public interface UserDao {

	List<User> findAll();

	User add();
	void delete();
	void update();
	User get();


}
