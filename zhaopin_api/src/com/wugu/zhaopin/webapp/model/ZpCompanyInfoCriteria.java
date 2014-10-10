package com.wugu.zhaopin.webapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZpCompanyInfoCriteria extends BaseModel{

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    protected String orderByClause;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    public ZpCompanyInfoCriteria()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    protected ZpCompanyInfoCriteria(ZpCompanyInfoCriteria example)
    {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    public String getOrderByClause()
    {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
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
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
     */
    public void clear()
    {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator. This class corresponds to the database table zp_company_info
     * @ibatorgenerated  Thu Jan 16 10:19:33 CST 2014
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

        public Criteria andUserIdIsNull()
        {
            addCriterion("user_id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull()
        {
            addCriterion("user_id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Long value)
        {
            addCriterion("user_id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Long value)
        {
            addCriterion("user_id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Long value)
        {
            addCriterion("user_id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value)
        {
            addCriterion("user_id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Long value)
        {
            addCriterion("user_id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value)
        {
            addCriterion("user_id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<Long> values)
        {
            addCriterion("user_id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<Long> values)
        {
            addCriterion("user_id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2)
        {
            addCriterion("user_id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2)
        {
            addCriterion("user_id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andNameIsNull()
        {
            addCriterion("name is null");
            return this;
        }

        public Criteria andNameIsNotNull()
        {
            addCriterion("name is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value)
        {
            addCriterion("name =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value)
        {
            addCriterion("name <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value)
        {
            addCriterion("name >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("name >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value)
        {
            addCriterion("name <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value)
        {
            addCriterion("name <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value)
        {
            addCriterion("name like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value)
        {
            addCriterion("name not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values)
        {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values)
        {
            addCriterion("name not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2)
        {
            addCriterion("name between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2)
        {
            addCriterion("name not between", value1, value2, "name");
            return this;
        }

        public Criteria andIntroduceIsNull()
        {
            addCriterion("introduce is null");
            return this;
        }

        public Criteria andIntroduceIsNotNull()
        {
            addCriterion("introduce is not null");
            return this;
        }

        public Criteria andIntroduceEqualTo(String value)
        {
            addCriterion("introduce =", value, "introduce");
            return this;
        }

        public Criteria andIntroduceNotEqualTo(String value)
        {
            addCriterion("introduce <>", value, "introduce");
            return this;
        }

        public Criteria andIntroduceGreaterThan(String value)
        {
            addCriterion("introduce >", value, "introduce");
            return this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value)
        {
            addCriterion("introduce >=", value, "introduce");
            return this;
        }

        public Criteria andIntroduceLessThan(String value)
        {
            addCriterion("introduce <", value, "introduce");
            return this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value)
        {
            addCriterion("introduce <=", value, "introduce");
            return this;
        }

        public Criteria andIntroduceLike(String value)
        {
            addCriterion("introduce like", value, "introduce");
            return this;
        }

        public Criteria andIntroduceNotLike(String value)
        {
            addCriterion("introduce not like", value, "introduce");
            return this;
        }

        public Criteria andIntroduceIn(List<String> values)
        {
            addCriterion("introduce in", values, "introduce");
            return this;
        }

        public Criteria andIntroduceNotIn(List<String> values)
        {
            addCriterion("introduce not in", values, "introduce");
            return this;
        }

        public Criteria andIntroduceBetween(String value1, String value2)
        {
            addCriterion("introduce between", value1, value2, "introduce");
            return this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2)
        {
            addCriterion("introduce not between", value1, value2, "introduce");
            return this;
        }

        public Criteria andIndustryIdIsNull()
        {
            addCriterion("industry_id is null");
            return this;
        }

        public Criteria andIndustryIdIsNotNull()
        {
            addCriterion("industry_id is not null");
            return this;
        }

        public Criteria andIndustryIdEqualTo(String value)
        {
            addCriterion("industry_id =", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdNotEqualTo(String value)
        {
            addCriterion("industry_id <>", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdGreaterThan(String value)
        {
            addCriterion("industry_id >", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(String value)
        {
            addCriterion("industry_id >=", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdLessThan(String value)
        {
            addCriterion("industry_id <", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(String value)
        {
            addCriterion("industry_id <=", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdLike(String value)
        {
            addCriterion("industry_id like", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdNotLike(String value)
        {
            addCriterion("industry_id not like", value, "industryId");
            return this;
        }

        public Criteria andIndustryIdIn(List<String> values)
        {
            addCriterion("industry_id in", values, "industryId");
            return this;
        }

        public Criteria andIndustryIdNotIn(List<String> values)
        {
            addCriterion("industry_id not in", values, "industryId");
            return this;
        }

        public Criteria andIndustryIdBetween(String value1, String value2)
        {
            addCriterion("industry_id between", value1, value2, "industryId");
            return this;
        }

        public Criteria andIndustryIdNotBetween(String value1, String value2)
        {
            addCriterion("industry_id not between", value1, value2,
                    "industryId");
            return this;
        }

        public Criteria andCompanyTypeIsNull()
        {
            addCriterion("company_type is null");
            return this;
        }

        public Criteria andCompanyTypeIsNotNull()
        {
            addCriterion("company_type is not null");
            return this;
        }

        public Criteria andCompanyTypeEqualTo(Integer value)
        {
            addCriterion("company_type =", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeNotEqualTo(Integer value)
        {
            addCriterion("company_type <>", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeGreaterThan(Integer value)
        {
            addCriterion("company_type >", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("company_type >=", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeLessThan(Integer value)
        {
            addCriterion("company_type <", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Integer value)
        {
            addCriterion("company_type <=", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeIn(List<Integer> values)
        {
            addCriterion("company_type in", values, "companyType");
            return this;
        }

        public Criteria andCompanyTypeNotIn(List<Integer> values)
        {
            addCriterion("company_type not in", values, "companyType");
            return this;
        }

        public Criteria andCompanyTypeBetween(Integer value1, Integer value2)
        {
            addCriterion("company_type between", value1, value2, "companyType");
            return this;
        }

        public Criteria andCompanyTypeNotBetween(Integer value1, Integer value2)
        {
            addCriterion("company_type not between", value1, value2,
                    "companyType");
            return this;
        }

        public Criteria andScaleIdIsNull()
        {
            addCriterion("scale_id is null");
            return this;
        }

        public Criteria andScaleIdIsNotNull()
        {
            addCriterion("scale_id is not null");
            return this;
        }

        public Criteria andScaleIdEqualTo(Integer value)
        {
            addCriterion("scale_id =", value, "scaleId");
            return this;
        }

        public Criteria andScaleIdNotEqualTo(Integer value)
        {
            addCriterion("scale_id <>", value, "scaleId");
            return this;
        }

        public Criteria andScaleIdGreaterThan(Integer value)
        {
            addCriterion("scale_id >", value, "scaleId");
            return this;
        }

        public Criteria andScaleIdGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("scale_id >=", value, "scaleId");
            return this;
        }

        public Criteria andScaleIdLessThan(Integer value)
        {
            addCriterion("scale_id <", value, "scaleId");
            return this;
        }

        public Criteria andScaleIdLessThanOrEqualTo(Integer value)
        {
            addCriterion("scale_id <=", value, "scaleId");
            return this;
        }

        public Criteria andScaleIdIn(List<Integer> values)
        {
            addCriterion("scale_id in", values, "scaleId");
            return this;
        }

        public Criteria andScaleIdNotIn(List<Integer> values)
        {
            addCriterion("scale_id not in", values, "scaleId");
            return this;
        }

        public Criteria andScaleIdBetween(Integer value1, Integer value2)
        {
            addCriterion("scale_id between", value1, value2, "scaleId");
            return this;
        }

        public Criteria andScaleIdNotBetween(Integer value1, Integer value2)
        {
            addCriterion("scale_id not between", value1, value2, "scaleId");
            return this;
        }

        public Criteria andLicenseIsNull()
        {
            addCriterion("license is null");
            return this;
        }

        public Criteria andLicenseIsNotNull()
        {
            addCriterion("license is not null");
            return this;
        }

        public Criteria andLicenseEqualTo(String value)
        {
            addCriterion("license =", value, "license");
            return this;
        }

        public Criteria andLicenseNotEqualTo(String value)
        {
            addCriterion("license <>", value, "license");
            return this;
        }

        public Criteria andLicenseGreaterThan(String value)
        {
            addCriterion("license >", value, "license");
            return this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value)
        {
            addCriterion("license >=", value, "license");
            return this;
        }

        public Criteria andLicenseLessThan(String value)
        {
            addCriterion("license <", value, "license");
            return this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value)
        {
            addCriterion("license <=", value, "license");
            return this;
        }

        public Criteria andLicenseLike(String value)
        {
            addCriterion("license like", value, "license");
            return this;
        }

        public Criteria andLicenseNotLike(String value)
        {
            addCriterion("license not like", value, "license");
            return this;
        }

        public Criteria andLicenseIn(List<String> values)
        {
            addCriterion("license in", values, "license");
            return this;
        }

        public Criteria andLicenseNotIn(List<String> values)
        {
            addCriterion("license not in", values, "license");
            return this;
        }

        public Criteria andLicenseBetween(String value1, String value2)
        {
            addCriterion("license between", value1, value2, "license");
            return this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2)
        {
            addCriterion("license not between", value1, value2, "license");
            return this;
        }

        public Criteria andSiteUrlIsNull()
        {
            addCriterion("site_url is null");
            return this;
        }

        public Criteria andSiteUrlIsNotNull()
        {
            addCriterion("site_url is not null");
            return this;
        }

        public Criteria andSiteUrlEqualTo(String value)
        {
            addCriterion("site_url =", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlNotEqualTo(String value)
        {
            addCriterion("site_url <>", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlGreaterThan(String value)
        {
            addCriterion("site_url >", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlGreaterThanOrEqualTo(String value)
        {
            addCriterion("site_url >=", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlLessThan(String value)
        {
            addCriterion("site_url <", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlLessThanOrEqualTo(String value)
        {
            addCriterion("site_url <=", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlLike(String value)
        {
            addCriterion("site_url like", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlNotLike(String value)
        {
            addCriterion("site_url not like", value, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlIn(List<String> values)
        {
            addCriterion("site_url in", values, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlNotIn(List<String> values)
        {
            addCriterion("site_url not in", values, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlBetween(String value1, String value2)
        {
            addCriterion("site_url between", value1, value2, "siteUrl");
            return this;
        }

        public Criteria andSiteUrlNotBetween(String value1, String value2)
        {
            addCriterion("site_url not between", value1, value2, "siteUrl");
            return this;
        }

        public Criteria andTypeIsNull()
        {
            addCriterion("type is null");
            return this;
        }

        public Criteria andTypeIsNotNull()
        {
            addCriterion("type is not null");
            return this;
        }

        public Criteria andTypeEqualTo(Integer value)
        {
            addCriterion("type =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(Integer value)
        {
            addCriterion("type <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(Integer value)
        {
            addCriterion("type >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("type >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(Integer value)
        {
            addCriterion("type <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value)
        {
            addCriterion("type <=", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<Integer> values)
        {
            addCriterion("type in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<Integer> values)
        {
            addCriterion("type not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2)
        {
            addCriterion("type between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2)
        {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andOpIdIsNull()
        {
            addCriterion("op_id is null");
            return this;
        }

        public Criteria andOpIdIsNotNull()
        {
            addCriterion("op_id is not null");
            return this;
        }

        public Criteria andOpIdEqualTo(Long value)
        {
            addCriterion("op_id =", value, "opId");
            return this;
        }

        public Criteria andOpIdNotEqualTo(Long value)
        {
            addCriterion("op_id <>", value, "opId");
            return this;
        }

        public Criteria andOpIdGreaterThan(Long value)
        {
            addCriterion("op_id >", value, "opId");
            return this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(Long value)
        {
            addCriterion("op_id >=", value, "opId");
            return this;
        }

        public Criteria andOpIdLessThan(Long value)
        {
            addCriterion("op_id <", value, "opId");
            return this;
        }

        public Criteria andOpIdLessThanOrEqualTo(Long value)
        {
            addCriterion("op_id <=", value, "opId");
            return this;
        }

        public Criteria andOpIdIn(List<Long> values)
        {
            addCriterion("op_id in", values, "opId");
            return this;
        }

        public Criteria andOpIdNotIn(List<Long> values)
        {
            addCriterion("op_id not in", values, "opId");
            return this;
        }

        public Criteria andOpIdBetween(Long value1, Long value2)
        {
            addCriterion("op_id between", value1, value2, "opId");
            return this;
        }

        public Criteria andOpIdNotBetween(Long value1, Long value2)
        {
            addCriterion("op_id not between", value1, value2, "opId");
            return this;
        }
    }
}