package com.wugu.zhaopin.dao;

import com.wugu.zhaopin.vo.ZpTag;
import com.wugu.zhaopin.vo.ZpTagCriteria;
import java.util.List;
import java.sql.SQLException;

public interface ZpTagDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	int countByExample(ZpTagCriteria example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	int deleteByExample(ZpTagCriteria example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	int deleteByPrimaryKey(Integer tagId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	Integer insert(ZpTag record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	Integer insertSelective(ZpTag record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	List<ZpTag> selectByExample(ZpTagCriteria example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	ZpTag selectByPrimaryKey(Integer tagId) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	int updateByExampleSelective(ZpTag record, ZpTagCriteria example)
			throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	int updateByExample(ZpTag record, ZpTagCriteria example)
			throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	int updateByPrimaryKeySelective(ZpTag record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_tag
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	int updateByPrimaryKey(ZpTag record) throws SQLException;
}