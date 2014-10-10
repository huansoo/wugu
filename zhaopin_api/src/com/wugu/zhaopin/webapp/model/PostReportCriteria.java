package com.wugu.zhaopin.webapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostReportCriteria extends BaseModel{

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    protected String orderByClause;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    public PostReportCriteria()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    protected PostReportCriteria(PostReportCriteria example)
    {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    public String getOrderByClause()
    {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
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
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
     */
    public void clear()
    {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator. This class corresponds to the database table post_report
     * @ibatorgenerated  Fri Apr 11 14:05:40 CST 2014
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

        public Criteria andPostIdIsNull()
        {
            addCriterion("post_id is null");
            return this;
        }

        public Criteria andPostIdIsNotNull()
        {
            addCriterion("post_id is not null");
            return this;
        }

        public Criteria andPostIdEqualTo(Long value)
        {
            addCriterion("post_id =", value, "postId");
            return this;
        }

        public Criteria andPostIdNotEqualTo(Long value)
        {
            addCriterion("post_id <>", value, "postId");
            return this;
        }

        public Criteria andPostIdGreaterThan(Long value)
        {
            addCriterion("post_id >", value, "postId");
            return this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Long value)
        {
            addCriterion("post_id >=", value, "postId");
            return this;
        }

        public Criteria andPostIdLessThan(Long value)
        {
            addCriterion("post_id <", value, "postId");
            return this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Long value)
        {
            addCriterion("post_id <=", value, "postId");
            return this;
        }

        public Criteria andPostIdIn(List<Long> values)
        {
            addCriterion("post_id in", values, "postId");
            return this;
        }

        public Criteria andPostIdNotIn(List<Long> values)
        {
            addCriterion("post_id not in", values, "postId");
            return this;
        }

        public Criteria andPostIdBetween(Long value1, Long value2)
        {
            addCriterion("post_id between", value1, value2, "postId");
            return this;
        }

        public Criteria andPostIdNotBetween(Long value1, Long value2)
        {
            addCriterion("post_id not between", value1, value2, "postId");
            return this;
        }

        public Criteria andCompanyIdIsNull()
        {
            addCriterion("company_id is null");
            return this;
        }

        public Criteria andCompanyIdIsNotNull()
        {
            addCriterion("company_id is not null");
            return this;
        }

        public Criteria andCompanyIdEqualTo(Integer value)
        {
            addCriterion("company_id =", value, "companyId");
            return this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value)
        {
            addCriterion("company_id <>", value, "companyId");
            return this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value)
        {
            addCriterion("company_id >", value, "companyId");
            return this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("company_id >=", value, "companyId");
            return this;
        }

        public Criteria andCompanyIdLessThan(Integer value)
        {
            addCriterion("company_id <", value, "companyId");
            return this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value)
        {
            addCriterion("company_id <=", value, "companyId");
            return this;
        }

        public Criteria andCompanyIdIn(List<Integer> values)
        {
            addCriterion("company_id in", values, "companyId");
            return this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values)
        {
            addCriterion("company_id not in", values, "companyId");
            return this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2)
        {
            addCriterion("company_id between", value1, value2, "companyId");
            return this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2)
        {
            addCriterion("company_id not between", value1, value2, "companyId");
            return this;
        }

        public Criteria andCompanyNameIsNull()
        {
            addCriterion("company_Name is null");
            return this;
        }

        public Criteria andCompanyNameIsNotNull()
        {
            addCriterion("company_Name is not null");
            return this;
        }

        public Criteria andCompanyNameEqualTo(String value)
        {
            addCriterion("company_Name =", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotEqualTo(String value)
        {
            addCriterion("company_Name <>", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameGreaterThan(String value)
        {
            addCriterion("company_Name >", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("company_Name >=", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameLessThan(String value)
        {
            addCriterion("company_Name <", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value)
        {
            addCriterion("company_Name <=", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameLike(String value)
        {
            addCriterion("company_Name like", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotLike(String value)
        {
            addCriterion("company_Name not like", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameIn(List<String> values)
        {
            addCriterion("company_Name in", values, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotIn(List<String> values)
        {
            addCriterion("company_Name not in", values, "companyName");
            return this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2)
        {
            addCriterion("company_Name between", value1, value2, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2)
        {
            addCriterion("company_Name not between", value1, value2,
                    "companyName");
            return this;
        }

        public Criteria andPostNameIsNull()
        {
            addCriterion("post_name is null");
            return this;
        }

        public Criteria andPostNameIsNotNull()
        {
            addCriterion("post_name is not null");
            return this;
        }

        public Criteria andPostNameEqualTo(String value)
        {
            addCriterion("post_name =", value, "postName");
            return this;
        }

        public Criteria andPostNameNotEqualTo(String value)
        {
            addCriterion("post_name <>", value, "postName");
            return this;
        }

        public Criteria andPostNameGreaterThan(String value)
        {
            addCriterion("post_name >", value, "postName");
            return this;
        }

        public Criteria andPostNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("post_name >=", value, "postName");
            return this;
        }

        public Criteria andPostNameLessThan(String value)
        {
            addCriterion("post_name <", value, "postName");
            return this;
        }

        public Criteria andPostNameLessThanOrEqualTo(String value)
        {
            addCriterion("post_name <=", value, "postName");
            return this;
        }

        public Criteria andPostNameLike(String value)
        {
            addCriterion("post_name like", value, "postName");
            return this;
        }

        public Criteria andPostNameNotLike(String value)
        {
            addCriterion("post_name not like", value, "postName");
            return this;
        }

        public Criteria andPostNameIn(List<String> values)
        {
            addCriterion("post_name in", values, "postName");
            return this;
        }

        public Criteria andPostNameNotIn(List<String> values)
        {
            addCriterion("post_name not in", values, "postName");
            return this;
        }

        public Criteria andPostNameBetween(String value1, String value2)
        {
            addCriterion("post_name between", value1, value2, "postName");
            return this;
        }

        public Criteria andPostNameNotBetween(String value1, String value2)
        {
            addCriterion("post_name not between", value1, value2, "postName");
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

        public Criteria andPostStatusIsNull()
        {
            addCriterion("post_status is null");
            return this;
        }

        public Criteria andPostStatusIsNotNull()
        {
            addCriterion("post_status is not null");
            return this;
        }

        public Criteria andPostStatusEqualTo(Integer value)
        {
            addCriterion("post_status =", value, "postStatus");
            return this;
        }

        public Criteria andPostStatusNotEqualTo(Integer value)
        {
            addCriterion("post_status <>", value, "postStatus");
            return this;
        }

        public Criteria andPostStatusGreaterThan(Integer value)
        {
            addCriterion("post_status >", value, "postStatus");
            return this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("post_status >=", value, "postStatus");
            return this;
        }

        public Criteria andPostStatusLessThan(Integer value)
        {
            addCriterion("post_status <", value, "postStatus");
            return this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(Integer value)
        {
            addCriterion("post_status <=", value, "postStatus");
            return this;
        }

        public Criteria andPostStatusIn(List<Integer> values)
        {
            addCriterion("post_status in", values, "postStatus");
            return this;
        }

        public Criteria andPostStatusNotIn(List<Integer> values)
        {
            addCriterion("post_status not in", values, "postStatus");
            return this;
        }

        public Criteria andPostStatusBetween(Integer value1, Integer value2)
        {
            addCriterion("post_status between", value1, value2, "postStatus");
            return this;
        }

        public Criteria andPostStatusNotBetween(Integer value1, Integer value2)
        {
            addCriterion("post_status not between", value1, value2,
                    "postStatus");
            return this;
        }

        public Criteria andCompanyTimeIsNull()
        {
            addCriterion("company_time is null");
            return this;
        }

        public Criteria andCompanyTimeIsNotNull()
        {
            addCriterion("company_time is not null");
            return this;
        }

        public Criteria andCompanyTimeEqualTo(Integer value)
        {
            addCriterion("company_time =", value, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeNotEqualTo(Integer value)
        {
            addCriterion("company_time <>", value, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeGreaterThan(Integer value)
        {
            addCriterion("company_time >", value, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("company_time >=", value, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeLessThan(Integer value)
        {
            addCriterion("company_time <", value, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeLessThanOrEqualTo(Integer value)
        {
            addCriterion("company_time <=", value, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeIn(List<Integer> values)
        {
            addCriterion("company_time in", values, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeNotIn(List<Integer> values)
        {
            addCriterion("company_time not in", values, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeBetween(Integer value1, Integer value2)
        {
            addCriterion("company_time between", value1, value2, "companyTime");
            return this;
        }

        public Criteria andCompanyTimeNotBetween(Integer value1, Integer value2)
        {
            addCriterion("company_time not between", value1, value2,
                    "companyTime");
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

        public Criteria andCompanyStatusIsNull()
        {
            addCriterion("company_status is null");
            return this;
        }

        public Criteria andCompanyStatusIsNotNull()
        {
            addCriterion("company_status is not null");
            return this;
        }

        public Criteria andCompanyStatusEqualTo(Integer value)
        {
            addCriterion("company_status =", value, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusNotEqualTo(Integer value)
        {
            addCriterion("company_status <>", value, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusGreaterThan(Integer value)
        {
            addCriterion("company_status >", value, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("company_status >=", value, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusLessThan(Integer value)
        {
            addCriterion("company_status <", value, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusLessThanOrEqualTo(Integer value)
        {
            addCriterion("company_status <=", value, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusIn(List<Integer> values)
        {
            addCriterion("company_status in", values, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusNotIn(List<Integer> values)
        {
            addCriterion("company_status not in", values, "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusBetween(Integer value1, Integer value2)
        {
            addCriterion("company_status between", value1, value2,
                    "companyStatus");
            return this;
        }

        public Criteria andCompanyStatusNotBetween(Integer value1,
                Integer value2)
        {
            addCriterion("company_status not between", value1, value2,
                    "companyStatus");
            return this;
        }

        public Criteria andWorkAddressIsNull()
        {
            addCriterion("work_address is null");
            return this;
        }

        public Criteria andWorkAddressIsNotNull()
        {
            addCriterion("work_address is not null");
            return this;
        }

        public Criteria andWorkAddressEqualTo(String value)
        {
            addCriterion("work_address =", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressNotEqualTo(String value)
        {
            addCriterion("work_address <>", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressGreaterThan(String value)
        {
            addCriterion("work_address >", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressGreaterThanOrEqualTo(String value)
        {
            addCriterion("work_address >=", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressLessThan(String value)
        {
            addCriterion("work_address <", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressLessThanOrEqualTo(String value)
        {
            addCriterion("work_address <=", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressLike(String value)
        {
            addCriterion("work_address like", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressNotLike(String value)
        {
            addCriterion("work_address not like", value, "workAddress");
            return this;
        }

        public Criteria andWorkAddressIn(List<String> values)
        {
            addCriterion("work_address in", values, "workAddress");
            return this;
        }

        public Criteria andWorkAddressNotIn(List<String> values)
        {
            addCriterion("work_address not in", values, "workAddress");
            return this;
        }

        public Criteria andWorkAddressBetween(String value1, String value2)
        {
            addCriterion("work_address between", value1, value2, "workAddress");
            return this;
        }

        public Criteria andWorkAddressNotBetween(String value1, String value2)
        {
            addCriterion("work_address not between", value1, value2,
                    "workAddress");
            return this;
        }
    }
}