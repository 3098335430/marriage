package com.marriage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marriage.dao.UserDao;
import com.marriage.entity.User;
import com.marriage.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// 注入Service依赖
	@Autowired
	private UserDao userDao;


	@Override
	public User getById(long userId) {
		return userDao.queryById(userId);
	}

	@Override
	public List<User> getList() {
		return userDao.queryAll(0, 2);
	}
	@Override
	public User login(User user) {
		return userDao.getUserByUsernameAndPassword(user);
	}

	@Override
	public boolean regist(User user) {
	    int count = userDao.saveUser(user);
		return count > 0;
	}
   
	@Override
	public boolean checkUsername(String username) {
		User user = userDao.getUserByUsername(username);
		return user == null;
	}

	
}
