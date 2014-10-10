package com.wugu.zhaopin.dao.impl;

import com.wugu.zhaopin.dao.PostReportDAO;
import com.wugu.zhaopin.webapp.model.PostReport;
import com.wugu.zhaopin.webapp.model.PostReportCriteria;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class PostReportDAOImpl extends SqlMapClientDaoSupport implements PostReportDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public PostReportDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public int countByExample(PostReportCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("post_report.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public int deleteByExample(PostReportCriteria example) {
        int rows = getSqlMapClientTemplate().delete("post_report.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public int deleteByPrimaryKey(Long postId) {
        PostReport key = new PostReport();
        key.setPostId(postId);
        int rows = getSqlMapClientTemplate().delete("post_report.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public void insert(PostReport record) {
        getSqlMapClientTemplate().insert("post_report.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public void insertSelective(PostReport record) {
        getSqlMapClientTemplate().insert("post_report.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    @SuppressWarnings("unchecked")
    public List<PostReport> selectByExample(PostReportCriteria example) {
        List<PostReport> list = getSqlMapClientTemplate().queryForList("post_report.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public PostReport selectByPrimaryKey(Long postId) {
        PostReport key = new PostReport();
        key.setPostId(postId);
        PostReport record = (PostReport) getSqlMapClientTemplate().queryForObject("post_report.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public int updateByExampleSelective(PostReport record, PostReportCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("post_report.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public int updateByExample(PostReport record, PostReportCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("post_report.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public int updateByPrimaryKeySelective(PostReport record) {
        int rows = getSqlMapClientTemplate().update("post_report.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    public int updateByPrimaryKey(PostReport record) {
        int rows = getSqlMapClientTemplate().update("post_report.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table post_report
     *
     * @ibatorgenerated Fri Apr 11 14:05:40 CST 2014
     */
    private static class UpdateByExampleParms extends PostReportCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, PostReportCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}