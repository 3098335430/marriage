package com.marriage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marriage.entity.User;
@Repository
public interface UserDao {

	/**
	 * 通过ID查询用户
	 * 
	 * @param id
	 * @return
	 */
	User queryById(long id);

	/**
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
	
	/**
	 * update User
	 */
	public void updateUser(User user);
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 */
	public void delUser(Integer userId);
	
	/**
	 * 统计用户条数
	 */
	public Integer countUser();
	
}
