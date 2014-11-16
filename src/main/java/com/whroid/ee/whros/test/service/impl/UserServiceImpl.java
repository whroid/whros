package com.whroid.ee.whros.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.whroid.ee.whros.test.dao.UserDao;
import com.whroid.ee.whros.test.entity.User;
import com.whroid.ee.whros.test.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	
	@Resource
	public UserDao userDao;
	
	
	public User getUser(String id)
	{
		User user = userDao.getUser(id);
		return user;
	}
	
	public List<User> getUser()
	{
		List<User> users = userDao.getUser();
		return users;
	}
	
	public User save(User user)
	{
		return userDao.save(user);
	}
}
