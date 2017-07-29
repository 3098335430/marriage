package com.marriage.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.marriage.entity.Law;



public interface LawDao {
	/**
	 * 通过ID查询法律
	 * 
	 * @param id
	 * @return
	 */
	Law queryById(long id);

	/**
	 *查询所有法律
	 */
	List<Law> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	/**
	 * 向数据库中插入一个法律对象
	 * @return
	 */
	int saveLaw(Law law);
	
	
	/**
	 * update 法律
	 */
	public void updateLaw(Law law);
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 */
	public void delLaw(Integer cid);
	
	/**
	 * 统计类型条数
	 */
	public Integer countLaw();
}
