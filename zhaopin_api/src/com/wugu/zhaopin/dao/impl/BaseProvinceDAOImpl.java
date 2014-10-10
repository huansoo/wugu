package com.wugu.zhaopin.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wugu.zhaopin.dao.BaseProvinceDAO;
import com.wugu.zhaopin.vo.BaseProvince;
import com.wugu.zhaopin.vo.BaseProvinceCriteria;
import java.sql.SQLException;
import java.util.List;

public class BaseProvinceDAOImpl implements BaseProvinceDAO {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public BaseProvinceDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int countByExample(BaseProvinceCriteria example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("base_Province.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int deleteByExample(BaseProvinceCriteria example) throws SQLException {
        int rows = sqlMapClient.delete("base_Province.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int deleteByPrimaryKey(Integer provinceid) throws SQLException {
        BaseProvince key = new BaseProvince();
        key.setProvinceid(provinceid);
        int rows = sqlMapClient.delete("base_Province.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public void insert(BaseProvince record) throws SQLException {
        sqlMapClient.insert("base_Province.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public void insertSelective(BaseProvince record) throws SQLException {
        sqlMapClient.insert("base_Province.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    @SuppressWarnings("unchecked")
    public List<BaseProvince> selectByExample(BaseProvinceCriteria example) throws SQLException {
        List<BaseProvince> list = sqlMapClient.queryForList("base_Province.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public BaseProvince selectByPrimaryKey(Integer provinceid) throws SQLException {
        BaseProvince key = new BaseProvince();
        key.setProvinceid(provinceid);
        BaseProvince record = (BaseProvince) sqlMapClient.queryForObject("base_Province.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByExampleSelective(BaseProvince record, BaseProvinceCriteria example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("base_Province.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByExample(BaseProvince record, BaseProvinceCriteria example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("base_Province.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByPrimaryKeySelective(BaseProvince record) throws SQLException {
        int rows = sqlMapClient.update("base_Province.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByPrimaryKey(BaseProvince record) throws SQLException {
        int rows = sqlMapClient.update("base_Province.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table base_Province
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    private static class UpdateByExampleParms extends BaseProvinceCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, BaseProvinceCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}