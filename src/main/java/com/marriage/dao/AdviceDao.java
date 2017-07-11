package com.marriage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.marriage.entity.Advice;


public interface AdviceDao {
	/**
	 * 通过ID查询建议
	 * 
	 * @param id
	 * @return
	 */
	Advice queryById(long id);

	/**
	 *查询所有建议
	 */
	List<Advice> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	/**
	 * 向数据库中插入一个建议对象
	 * @param user
	 * @return
	 */
	int saveAdvice(Advice advice);
	
	
	/**
	 * update User
	 */
	public void updateAdvice(Advice advice);
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 */
	public void delAdvice(Integer aid);
	
	/**
	 * 统计建议条数
	 */
	public Integer countAdvice();
}
