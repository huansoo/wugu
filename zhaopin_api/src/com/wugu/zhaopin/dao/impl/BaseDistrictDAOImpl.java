package com.wugu.zhaopin.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wugu.zhaopin.dao.BaseDistrictDAO;
import com.wugu.zhaopin.vo.BaseDistrict;
import com.wugu.zhaopin.vo.BaseDistrictCriteria;
import java.sql.SQLException;
import java.util.List;

public class BaseDistrictDAOImpl implements BaseDistrictDAO {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public BaseDistrictDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int countByExample(BaseDistrictCriteria example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("base_District.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int deleteByExample(BaseDistrictCriteria example) throws SQLException {
        int rows = sqlMapClient.delete("base_District.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int deleteByPrimaryKey(Integer districtid) throws SQLException {
        BaseDistrict key = new BaseDistrict();
        key.setDistrictid(districtid);
        int rows = sqlMapClient.delete("base_District.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public void insert(BaseDistrict record) throws SQLException {
        sqlMapClient.insert("base_District.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public void insertSelective(BaseDistrict record) throws SQLException {
        sqlMapClient.insert("base_District.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    @SuppressWarnings("unchecked")
    public List<BaseDistrict> selectByExample(BaseDistrictCriteria example) throws SQLException {
        List<BaseDistrict> list = sqlMapClient.queryForList("base_District.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public BaseDistrict selectByPrimaryKey(Integer districtid) throws SQLException {
        BaseDistrict key = new BaseDistrict();
        key.setDistrictid(districtid);
        BaseDistrict record = (BaseDistrict) sqlMapClient.queryForObject("base_District.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByExampleSelective(BaseDistrict record, BaseDistrictCriteria example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("base_District.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByExample(BaseDistrict record, BaseDistrictCriteria example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("base_District.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByPrimaryKeySelective(BaseDistrict record) throws SQLException {
        int rows = sqlMapClient.update("base_District.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public int updateByPrimaryKey(BaseDistrict record) throws SQLException {
        int rows = sqlMapClient.update("base_District.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table base_District
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    private static class UpdateByExampleParms extends BaseDistrictCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, BaseDistrictCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}