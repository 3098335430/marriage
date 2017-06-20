package com.marriage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.marriage.entity.User;

public interface UserDao {

	/**
	 * 通过ID查询用户
	 * 
	 * @param id
	 * @return
	 */
	User queryById(long id);

	/**
	 * 查询所有图书
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	 /**
     * 根据用户名和密码查询用户
     * @param user
     * @return
     */
    
    User  getUserByUsernameAndPassword(User  user);
	/**
	 * 向数据库中插入一个用户对象
	 * @param user
	 * @return
	 */
	int saveUser(User user);
	
	/**
	 * 根据用户名查找用户对象
	 * @param username
	 * @return
	 */
	User getUserByUsername(String username);
	


}
