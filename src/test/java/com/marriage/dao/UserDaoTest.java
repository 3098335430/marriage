package com.marriage.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

import com.marriage.entity.User;

public class UserDaoTest{

	@Autowired
	private UserDao userDao;

	@Test
	public void testQueryById() throws Exception {
		long userId = 1;
		User user = userDao.queryById(userId);
		System.out.println(user);
	}

	@Test
	public void testQueryAll() throws Exception {
		List<User> users = userDao.queryAll(0, 4);
		for (User user: users) {
			System.out.println(user);
		}
	}
	@Test
	public void testGetUserByUsernameAndPassword() throws Exception
	{
		User user=new User(1,"admin","00000000");
		User LoginUser=userDao.getUserByUsernameAndPassword(user);
		System.out.println(LoginUser);
	}
	@Test
	public void testSaveUser() throws Exception{
		User user=new User(10,"guqun","8888888");
		System.out.println(user);
		int count=userDao.saveUser(user);
		System.out.println(count);
	}
	@Test
	public void testGetUserByUsername() throws Exception{

		User user=new User(1,"admin","000000");
		User LoginUser=userDao.getUserByUsername("admin");
		System.out.println(LoginUser);
	}

}
