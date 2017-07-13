package com.marriage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.marriage.entity.Case;



public interface CaseDao {
	/**
	 * 通过ID查询类型
	 * 
	 * @param id
	 * @return
	 */
	Case queryById(long id);

	/**
	 *查询所有类型
	 */
	List<Case> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	/**
	 * 向数据库中插入一个类型对象
	 * @return
	 */
	int saveCase(Case case1);
	
	
	/**
	 * update 类型
	 */
	public void updateCase(Case case1);
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 */
	public void delCase(Integer cid);
	
	/**
	 * 统计类型条数
	 */
	public Integer countCase();

}
