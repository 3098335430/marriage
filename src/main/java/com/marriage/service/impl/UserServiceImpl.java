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


	public User getById(long userId) {
		return userDao.queryById(userId);
	}

	public List<User> getList(Integer begin,Integer end) {
		return userDao.queryAll(begin, end);
	}
	public User login(User user) {
		return userDao.getUserByUsernameAndPassword(user);
	}

	public boolean regist(User user) {
	    int count = userDao.saveUser(user);
		return count > 0;
	}
   
	public boolean checkUsername(String username) {
		User user = userDao.getUserByUsername(username);
		return user == null;
	}
	public int saveUser(User user) {
		int saveUser=userDao.saveUser(user);
		return saveUser;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	public void delUser(Integer userId) {
		// TODO Auto-generated method stub
		userDao.delUser(userId);
	}

	public Integer countUser() {
		// TODO Auto-generated method stub
		return userDao.countUser();
	}

	
}
