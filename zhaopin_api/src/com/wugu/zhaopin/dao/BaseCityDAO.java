package com.wugu.zhaopin.dao;

import com.wugu.zhaopin.vo.BaseCity;
import com.wugu.zhaopin.vo.BaseCityCriteria;
import java.sql.SQLException;
import java.util.List;

public interface BaseCityDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    int countByExample(BaseCityCriteria example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    int deleteByExample(BaseCityCriteria example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    int deleteByPrimaryKey(Integer cityid) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    void insert(BaseCity record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    void insertSelective(BaseCity record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    List<BaseCity> selectByExample(BaseCityCriteria example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    BaseCity selectByPrimaryKey(Integer cityid) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    int updateByExampleSelective(BaseCity record, BaseCityCriteria example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    int updateByExample(BaseCity record, BaseCityCriteria example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    int updateByPrimaryKeySelective(BaseCity record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_City
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    int updateByPrimaryKey(BaseCity record) throws SQLException;
}