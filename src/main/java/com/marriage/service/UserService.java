package com.marriage.service;

import java.util.List;

import com.marriage.entity.User;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface UserService {

	/**
	 * 查询用户
	 * 
	 * @param userId
	 * @return
	 */
	User getById(long userId);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	 List<User> getList(Integer begin,Integer end) ;

	 /**
     * 用户登录的方法
     * @param user
     * @return
     */
	User login(User user);
	/**
	 * 用户注册的方法
	 * @param user
	 * @return
	 */
	boolean regist(User user);
	/**
	 * 检查用户名是否可用，如果可用返回true， 否则返回false
	 * @param username
	 * @return
	 */
	boolean checkUsername(String username);
	/**
	 * 新增用户
	 */
	int saveUser(User user);
	
	public void updateUser(User user);
	public void delUser(Integer userId);
	public Integer countUser();
}
