package com.wugu.zhaopin.webapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResumeReportCriteria extends BaseModel{

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    protected String orderByClause;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public ResumeReportCriteria()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    protected ResumeReportCriteria(ResumeReportCriteria example)
    {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public String getOrderByClause()
    {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public void clear()
    {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator. This class corresponds to the database table resume_report
     * @ibatorgenerated  Mon Apr 14 17:23:21 CST 2014
     */
    public static class Criteria
    {
        protected List<String> criteriaWithoutValue;
        protected List<Map<String, Object>> criteriaWithSingleValue;
        protected List<Map<String, Object>> criteriaWithListValue;
        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria()
        {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid()
        {
            return criteriaWithoutValue.size() > 0
                    || criteriaWithSingleValue.size() > 0
                    || criteriaWithListValue.size() > 0
                    || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue()
        {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue()
        {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue()
        {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue()
        {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition)
        {
            if (condition == null)
            {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value,
                String property)
        {
            if (value == null)
            {
                throw new RuntimeException("Value for " + property
                        + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition,
                List<? extends Object> values, String property)
        {
            if (values == null || values.size() == 0)
            {
                throw new RuntimeException("Value list for " + property
                        + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1,
                Object value2, String property)
        {
            if (value1 == null || value2 == null)
            {
                throw new RuntimeException("Between values for " + property
                        + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andResumeIdIsNull()
        {
            addCriterion("resume_id is null");
            return this;
        }

        public Criteria andResumeIdIsNotNull()
        {
            addCriterion("resume_id is not null");
            return this;
        }

        public Criteria andResumeIdEqualTo(Long value)
        {
            addCriterion("resume_id =", value, "resumeId");
            return this;
        }

        public Criteria andResumeIdNotEqualTo(Long value)
        {
            addCriterion("resume_id <>", value, "resumeId");
            return this;
        }

        public Criteria andResumeIdGreaterThan(Long value)
        {
            addCriterion("resume_id >", value, "resumeId");
            return this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Long value)
        {
            addCriterion("resume_id >=", value, "resumeId");
            return this;
        }

        public Criteria andResumeIdLessThan(Long value)
        {
            addCriterion("resume_id <", value, "resumeId");
            return this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Long value)
        {
            addCriterion("resume_id <=", value, "resumeId");
            return this;
        }

        public Criteria andResumeIdIn(List<Long> values)
        {
            addCriterion("resume_id in", values, "resumeId");
            return this;
        }

        public Criteria andResumeIdNotIn(List<Long> values)
        {
            addCriterion("resume_id not in", values, "resumeId");
            return this;
        }

        public Criteria andResumeIdBetween(Long value1, Long value2)
        {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return this;
        }

        public Criteria andResumeIdNotBetween(Long value1, Long value2)
        {
            addCriterion("resume_id not between", value1, value2, "resumeId");
            return this;
        }

        public Criteria andHopePostIsNull()
        {
            addCriterion("hope_post is null");
            return this;
        }

        public Criteria andHopePostIsNotNull()
        {
            addCriterion("hope_post is not null");
            return this;
        }

        public Criteria andHopePostEqualTo(String value)
        {
            addCriterion("hope_post =", value, "hopePost");
            return this;
        }

        public Criteria andHopePostNotEqualTo(String value)
        {
            addCriterion("hope_post <>", value, "hopePost");
            return this;
        }

        public Criteria andHopePostGreaterThan(String value)
        {
            addCriterion("hope_post >", value, "hopePost");
            return this;
        }

        public Criteria andHopePostGreaterThanOrEqualTo(String value)
        {
            addCriterion("hope_post >=", value, "hopePost");
            return this;
        }

        public Criteria andHopePostLessThan(String value)
        {
            addCriterion("hope_post <", value, "hopePost");
            return this;
        }

        public Criteria andHopePostLessThanOrEqualTo(String value)
        {
            addCriterion("hope_post <=", value, "hopePost");
            return this;
        }

        public Criteria andHopePostLike(String value)
        {
            addCriterion("hope_post like", value, "hopePost");
            return this;
        }

        public Criteria andHopePostNotLike(String value)
        {
            addCriterion("hope_post not like", value, "hopePost");
            return this;
        }

        public Criteria andHopePostIn(List<String> values)
        {
            addCriterion("hope_post in", values, "hopePost");
            return this;
        }

        public Criteria andHopePostNotIn(List<String> values)
        {
            addCriterion("hope_post not in", values, "hopePost");
            return this;
        }

        public Criteria andHopePostBetween(String value1, String value2)
        {
            addCriterion("hope_post between", value1, value2, "hopePost");
            return this;
        }

        public Criteria andHopePostNotBetween(String value1, String value2)
        {
            addCriterion("hope_post not between", value1, value2, "hopePost");
            return this;
        }

        public Criteria andOpenLevelIsNull()
        {
            addCriterion("open_level is null");
            return this;
        }

        public Criteria andOpenLevelIsNotNull()
        {
            addCriterion("open_level is not null");
            return this;
        }

        public Criteria andOpenLevelEqualTo(Integer value)
        {
            addCriterion("open_level =", value, "openLevel");
            return this;
        }

        public Criteria andOpenLevelNotEqualTo(Integer value)
        {
            addCriterion("open_level <>", value, "openLevel");
            return this;
        }

        public Criteria andOpenLevelGreaterThan(Integer value)
        {
            addCriterion("open_level >", value, "openLevel");
            return this;
        }

        public Criteria andOpenLevelGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("open_level >=", value, "openLevel");
            return this;
        }

        public Criteria andOpenLevelLessThan(Integer value)
        {
            addCriterion("open_level <", value, "openLevel");
            return this;
        }

        public Criteria andOpenLevelLessThanOrEqualTo(Integer value)
        {
            addCriterion("open_level <=", value, "openLevel");
            return this;
        }

        public Criteria andOpenLevelIn(List<Integer> values)
        {
            addCriterion("open_level in", values, "openLevel");
            return this;
        }

        public Criteria andOpenLevelNotIn(List<Integer> values)
        {
            addCriterion("open_level not in", values, "openLevel");
            return this;
        }

        public Criteria andOpenLevelBetween(Integer value1, Integer value2)
        {
            addCriterion("open_level between", value1, value2, "openLevel");
            return this;
        }

        public Criteria andOpenLevelNotBetween(Integer value1, Integer value2)
        {
            addCriterion("open_level not between", value1, value2, "openLevel");
            return this;
        }

        public Criteria andCreateTimeIsNull()
        {
            addCriterion("create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull()
        {
            addCriterion("create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Integer value)
        {
            addCriterion("create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value)
        {
            addCriterion("create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value)
        {
            addCriterion("create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Integer value)
        {
            addCriterion("create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value)
        {
            addCriterion("create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List<Integer> values)
        {
            addCriterion("create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values)
        {
            addCriterion("create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2)
        {
            addCriterion("create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2)
        {
            addCriterion("create_time not between", value1, value2,
                    "createTime");
            return this;
        }

        public Criteria andUpdateTimeIsNull()
        {
            addCriterion("update_time is null");
            return this;
        }

        public Criteria andUpdateTimeIsNotNull()
        {
            addCriterion("update_time is not null");
            return this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value)
        {
            addCriterion("update_time =", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value)
        {
            addCriterion("update_time <>", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value)
        {
            addCriterion("update_time >", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("update_time >=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThan(Integer value)
        {
            addCriterion("update_time <", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value)
        {
            addCriterion("update_time <=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values)
        {
            addCriterion("update_time in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values)
        {
            addCriterion("update_time not in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2)
        {
            addCriterion("update_time between", value1, value2, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2)
        {
            addCriterion("update_time not between", value1, value2,
                    "updateTime");
            return this;
        }

        public Criteria andResumeTagsIsNull()
        {
            addCriterion("resume_tags is null");
            return this;
        }

        public Criteria andResumeTagsIsNotNull()
        {
            addCriterion("resume_tags is not null");
            return this;
        }

        public Criteria andResumeTagsEqualTo(String value)
        {
            addCriterion("resume_tags =", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsNotEqualTo(String value)
        {
            addCriterion("resume_tags <>", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsGreaterThan(String value)
        {
            addCriterion("resume_tags >", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsGreaterThanOrEqualTo(String value)
        {
            addCriterion("resume_tags >=", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsLessThan(String value)
        {
            addCriterion("resume_tags <", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsLessThanOrEqualTo(String value)
        {
            addCriterion("resume_tags <=", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsLike(String value)
        {
            addCriterion("resume_tags like", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsNotLike(String value)
        {
            addCriterion("resume_tags not like", value, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsIn(List<String> values)
        {
            addCriterion("resume_tags in", values, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsNotIn(List<String> values)
        {
            addCriterion("resume_tags not in", values, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsBetween(String value1, String value2)
        {
            addCriterion("resume_tags between", value1, value2, "resumeTags");
            return this;
        }

        public Criteria andResumeTagsNotBetween(String value1, String value2)
        {
            addCriterion("resume_tags not between", value1, value2,
                    "resumeTags");
            return this;
        }

        public Criteria andRealNameIsNull()
        {
            addCriterion("real_name is null");
            return this;
        }

        public Criteria andRealNameIsNotNull()
        {
            addCriterion("real_name is not null");
            return this;
        }

        public Criteria andRealNameEqualTo(String value)
        {
            addCriterion("real_name =", value, "realName");
            return this;
        }

        public Criteria andRealNameNotEqualTo(String value)
        {
            addCriterion("real_name <>", value, "realName");
            return this;
        }

        public Criteria andRealNameGreaterThan(String value)
        {
            addCriterion("real_name >", value, "realName");
            return this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("real_name >=", value, "realName");
            return this;
        }

        public Criteria andRealNameLessThan(String value)
        {
            addCriterion("real_name <", value, "realName");
            return this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value)
        {
            addCriterion("real_name <=", value, "realName");
            return this;
        }

        public Criteria andRealNameLike(String value)
        {
            addCriterion("real_name like", value, "realName");
            return this;
        }

        public Criteria andRealNameNotLike(String value)
        {
            addCriterion("real_name not like", value, "realName");
            return this;
        }

        public Criteria andRealNameIn(List<String> values)
        {
            addCriterion("real_name in", values, "realName");
            return this;
        }

        public Criteria andRealNameNotIn(List<String> values)
        {
            addCriterion("real_name not in", values, "realName");
            return this;
        }

        public Criteria andRealNameBetween(String value1, String value2)
        {
            addCriterion("real_name between", value1, value2, "realName");
            return this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2)
        {
            addCriterion("real_name not between", value1, value2, "realName");
            return this;
        }

        public Criteria andStatusIsNull()
        {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull()
        {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value)
        {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value)
        {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value)
        {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value)
        {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value)
        {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List<Integer> values)
        {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List<Integer> values)
        {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2)
        {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2)
        {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }

        public Criteria andAuditionUpadteIsNull()
        {
            addCriterion("audition_upadte is null");
            return this;
        }

        public Criteria andAuditionUpadteIsNotNull()
        {
            addCriterion("audition_upadte is not null");
            return this;
        }

        public Criteria andAuditionUpadteEqualTo(Integer value)
        {
            addCriterion("audition_upadte =", value, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteNotEqualTo(Integer value)
        {
            addCriterion("audition_upadte <>", value, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteGreaterThan(Integer value)
        {
            addCriterion("audition_upadte >", value, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("audition_upadte >=", value, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteLessThan(Integer value)
        {
            addCriterion("audition_upadte <", value, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteLessThanOrEqualTo(Integer value)
        {
            addCriterion("audition_upadte <=", value, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteIn(List<Integer> values)
        {
            addCriterion("audition_upadte in", values, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteNotIn(List<Integer> values)
        {
            addCriterion("audition_upadte not in", values, "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteBetween(Integer value1, Integer value2)
        {
            addCriterion("audition_upadte between", value1, value2,
                    "auditionUpadte");
            return this;
        }

        public Criteria andAuditionUpadteNotBetween(Integer value1,
                Integer value2)
        {
            addCriterion("audition_upadte not between", value1, value2,
                    "auditionUpadte");
            return this;
        }

        public Criteria andAuditionCountIsNull()
        {
            addCriterion("audition_count is null");
            return this;
        }

        public Criteria andAuditionCountIsNotNull()
        {
            addCriterion("audition_count is not null");
            return this;
        }

        public Criteria andAuditionCountEqualTo(Long value)
        {
            addCriterion("audition_count =", value, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountNotEqualTo(Long value)
        {
            addCriterion("audition_count <>", value, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountGreaterThan(Long value)
        {
            addCriterion("audition_count >", value, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountGreaterThanOrEqualTo(Long value)
        {
            addCriterion("audition_count >=", value, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountLessThan(Long value)
        {
            addCriterion("audition_count <", value, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountLessThanOrEqualTo(Long value)
        {
            addCriterion("audition_count <=", value, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountIn(List<Long> values)
        {
            addCriterion("audition_count in", values, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountNotIn(List<Long> values)
        {
            addCriterion("audition_count not in", values, "auditionCount");
            return this;
        }

        public Criteria andAuditionCountBetween(Long value1, Long value2)
        {
            addCriterion("audition_count between", value1, value2,
                    "auditionCount");
            return this;
        }

        public Criteria andAuditionCountNotBetween(Long value1, Long value2)
        {
            addCriterion("audition_count not between", value1, value2,
                    "auditionCount");
            return this;
        }

        public Criteria andHopeAddressIsNull()
        {
            addCriterion("hope_address is null");
            return this;
        }

        public Criteria andHopeAddressIsNotNull()
        {
            addCriterion("hope_address is not null");
            return this;
        }

        public Criteria andHopeAddressEqualTo(String value)
        {
            addCriterion("hope_address =", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressNotEqualTo(String value)
        {
            addCriterion("hope_address <>", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressGreaterThan(String value)
        {
            addCriterion("hope_address >", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressGreaterThanOrEqualTo(String value)
        {
            addCriterion("hope_address >=", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressLessThan(String value)
        {
            addCriterion("hope_address <", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressLessThanOrEqualTo(String value)
        {
            addCriterion("hope_address <=", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressLike(String value)
        {
            addCriterion("hope_address like", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressNotLike(String value)
        {
            addCriterion("hope_address not like", value, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressIn(List<String> values)
        {
            addCriterion("hope_address in", values, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressNotIn(List<String> values)
        {
            addCriterion("hope_address not in", values, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressBetween(String value1, String value2)
        {
            addCriterion("hope_address between", value1, value2, "hopeAddress");
            return this;
        }

        public Criteria andHopeAddressNotBetween(String value1, String value2)
        {
            addCriterion("hope_address not between", value1, value2,
                    "hopeAddress");
            return this;
        }

        public Criteria andResumeNameIsNull()
        {
            addCriterion("resume_name is null");
            return this;
        }

        public Criteria andResumeNameIsNotNull()
        {
            addCriterion("resume_name is not null");
            return this;
        }

        public Criteria andResumeNameEqualTo(String value)
        {
            addCriterion("resume_name =", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameNotEqualTo(String value)
        {
            addCriterion("resume_name <>", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameGreaterThan(String value)
        {
            addCriterion("resume_name >", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("resume_name >=", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameLessThan(String value)
        {
            addCriterion("resume_name <", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameLessThanOrEqualTo(String value)
        {
            addCriterion("resume_name <=", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameLike(String value)
        {
            addCriterion("resume_name like", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameNotLike(String value)
        {
            addCriterion("resume_name not like", value, "resumeName");
            return this;
        }

        public Criteria andResumeNameIn(List<String> values)
        {
            addCriterion("resume_name in", values, "resumeName");
            return this;
        }

        public Criteria andResumeNameNotIn(List<String> values)
        {
            addCriterion("resume_name not in", values, "resumeName");
            return this;
        }

        public Criteria andResumeNameBetween(String value1, String value2)
        {
            addCriterion("resume_name between", value1, value2, "resumeName");
            return this;
        }

        public Criteria andResumeNameNotBetween(String value1, String value2)
        {
            addCriterion("resume_name not between", value1, value2,
                    "resumeName");
            return this;
        }

        public Criteria andUserNameIsNull()
        {
            addCriterion("user_name is null");
            return this;
        }

        public Criteria andUserNameIsNotNull()
        {
            addCriterion("user_name is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value)
        {
            addCriterion("user_name =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value)
        {
            addCriterion("user_name <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value)
        {
            addCriterion("user_name >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("user_name >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value)
        {
            addCriterion("user_name <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value)
        {
            addCriterion("user_name <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value)
        {
            addCriterion("user_name like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value)
        {
            addCriterion("user_name not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values)
        {
            addCriterion("user_name in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values)
        {
            addCriterion("user_name not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2)
        {
            addCriterion("user_name between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2)
        {
            addCriterion("user_name not between", value1, value2, "userName");
            return this;
        }
    }
}