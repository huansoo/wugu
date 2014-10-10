package com.wugu.zhaopin.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseAreaCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public BaseAreaCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    protected BaseAreaCriteria(BaseAreaCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table base_Area
     *
     * @ibatorgenerated Tue Jan 07 09:58:02 CST 2014
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andAreaidIsNull() {
            addCriterion("AreaID is null");
            return this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AreaID is not null");
            return this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("AreaID =", value, "areaid");
            return this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("AreaID <>", value, "areaid");
            return this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("AreaID >", value, "areaid");
            return this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreaID >=", value, "areaid");
            return this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("AreaID <", value, "areaid");
            return this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("AreaID <=", value, "areaid");
            return this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("AreaID in", values, "areaid");
            return this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("AreaID not in", values, "areaid");
            return this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("AreaID between", value1, value2, "areaid");
            return this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("AreaID not between", value1, value2, "areaid");
            return this;
        }

        public Criteria andDistrictidIsNull() {
            addCriterion("DistrictID is null");
            return this;
        }

        public Criteria andDistrictidIsNotNull() {
            addCriterion("DistrictID is not null");
            return this;
        }

        public Criteria andDistrictidEqualTo(Integer value) {
            addCriterion("DistrictID =", value, "districtid");
            return this;
        }

        public Criteria andDistrictidNotEqualTo(Integer value) {
            addCriterion("DistrictID <>", value, "districtid");
            return this;
        }

        public Criteria andDistrictidGreaterThan(Integer value) {
            addCriterion("DistrictID >", value, "districtid");
            return this;
        }

        public Criteria andDistrictidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DistrictID >=", value, "districtid");
            return this;
        }

        public Criteria andDistrictidLessThan(Integer value) {
            addCriterion("DistrictID <", value, "districtid");
            return this;
        }

        public Criteria andDistrictidLessThanOrEqualTo(Integer value) {
            addCriterion("DistrictID <=", value, "districtid");
            return this;
        }

        public Criteria andDistrictidIn(List<Integer> values) {
            addCriterion("DistrictID in", values, "districtid");
            return this;
        }

        public Criteria andDistrictidNotIn(List<Integer> values) {
            addCriterion("DistrictID not in", values, "districtid");
            return this;
        }

        public Criteria andDistrictidBetween(Integer value1, Integer value2) {
            addCriterion("DistrictID between", value1, value2, "districtid");
            return this;
        }

        public Criteria andDistrictidNotBetween(Integer value1, Integer value2) {
            addCriterion("DistrictID not between", value1, value2, "districtid");
            return this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentid");
            return this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentid");
            return this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentid");
            return this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentid");
            return this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentid");
            return this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentid");
            return this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentid");
            return this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentid");
            return this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
            return this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AreaName is null");
            return this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AreaName is not null");
            return this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AreaName =", value, "areaname");
            return this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AreaName <>", value, "areaname");
            return this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AreaName >", value, "areaname");
            return this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AreaName >=", value, "areaname");
            return this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AreaName <", value, "areaname");
            return this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AreaName <=", value, "areaname");
            return this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AreaName like", value, "areaname");
            return this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AreaName not like", value, "areaname");
            return this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AreaName in", values, "areaname");
            return this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AreaName not in", values, "areaname");
            return this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AreaName between", value1, value2, "areaname");
            return this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AreaName not between", value1, value2, "areaname");
            return this;
        }

        public Criteria andArealevelIsNull() {
            addCriterion("AreaLevel is null");
            return this;
        }

        public Criteria andArealevelIsNotNull() {
            addCriterion("AreaLevel is not null");
            return this;
        }

        public Criteria andArealevelEqualTo(Integer value) {
            addCriterion("AreaLevel =", value, "arealevel");
            return this;
        }

        public Criteria andArealevelNotEqualTo(Integer value) {
            addCriterion("AreaLevel <>", value, "arealevel");
            return this;
        }

        public Criteria andArealevelGreaterThan(Integer value) {
            addCriterion("AreaLevel >", value, "arealevel");
            return this;
        }

        public Criteria andArealevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreaLevel >=", value, "arealevel");
            return this;
        }

        public Criteria andArealevelLessThan(Integer value) {
            addCriterion("AreaLevel <", value, "arealevel");
            return this;
        }

        public Criteria andArealevelLessThanOrEqualTo(Integer value) {
            addCriterion("AreaLevel <=", value, "arealevel");
            return this;
        }

        public Criteria andArealevelIn(List<Integer> values) {
            addCriterion("AreaLevel in", values, "arealevel");
            return this;
        }

        public Criteria andArealevelNotIn(List<Integer> values) {
            addCriterion("AreaLevel not in", values, "arealevel");
            return this;
        }

        public Criteria andArealevelBetween(Integer value1, Integer value2) {
            addCriterion("AreaLevel between", value1, value2, "arealevel");
            return this;
        }

        public Criteria andArealevelNotBetween(Integer value1, Integer value2) {
            addCriterion("AreaLevel not between", value1, value2, "arealevel");
            return this;
        }

        public Criteria andDistrictdescIsNull() {
            addCriterion("DistrictDesc is null");
            return this;
        }

        public Criteria andDistrictdescIsNotNull() {
            addCriterion("DistrictDesc is not null");
            return this;
        }

        public Criteria andDistrictdescEqualTo(String value) {
            addCriterion("DistrictDesc =", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescNotEqualTo(String value) {
            addCriterion("DistrictDesc <>", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescGreaterThan(String value) {
            addCriterion("DistrictDesc >", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescGreaterThanOrEqualTo(String value) {
            addCriterion("DistrictDesc >=", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescLessThan(String value) {
            addCriterion("DistrictDesc <", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescLessThanOrEqualTo(String value) {
            addCriterion("DistrictDesc <=", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescLike(String value) {
            addCriterion("DistrictDesc like", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescNotLike(String value) {
            addCriterion("DistrictDesc not like", value, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescIn(List<String> values) {
            addCriterion("DistrictDesc in", values, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescNotIn(List<String> values) {
            addCriterion("DistrictDesc not in", values, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescBetween(String value1, String value2) {
            addCriterion("DistrictDesc between", value1, value2, "districtdesc");
            return this;
        }

        public Criteria andDistrictdescNotBetween(String value1, String value2) {
            addCriterion("DistrictDesc not between", value1, value2, "districtdesc");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("Type =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("Type <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("Type >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("Type <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Type <=", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("Type in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("Type not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("Type between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Type not between", value1, value2, "type");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return this;
        }

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("CreateTime =", value, "createtime");
            return this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("CreateTime <>", value, "createtime");
            return this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("CreateTime >", value, "createtime");
            return this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreateTime >=", value, "createtime");
            return this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("CreateTime <", value, "createtime");
            return this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("CreateTime <=", value, "createtime");
            return this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("CreateTime in", values, "createtime");
            return this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return this;
        }

        public Criteria andOpidIsNull() {
            addCriterion("OpID is null");
            return this;
        }

        public Criteria andOpidIsNotNull() {
            addCriterion("OpID is not null");
            return this;
        }

        public Criteria andOpidEqualTo(Long value) {
            addCriterion("OpID =", value, "opid");
            return this;
        }

        public Criteria andOpidNotEqualTo(Long value) {
            addCriterion("OpID <>", value, "opid");
            return this;
        }

        public Criteria andOpidGreaterThan(Long value) {
            addCriterion("OpID >", value, "opid");
            return this;
        }

        public Criteria andOpidGreaterThanOrEqualTo(Long value) {
            addCriterion("OpID >=", value, "opid");
            return this;
        }

        public Criteria andOpidLessThan(Long value) {
            addCriterion("OpID <", value, "opid");
            return this;
        }

        public Criteria andOpidLessThanOrEqualTo(Long value) {
            addCriterion("OpID <=", value, "opid");
            return this;
        }

        public Criteria andOpidIn(List<Long> values) {
            addCriterion("OpID in", values, "opid");
            return this;
        }

        public Criteria andOpidNotIn(List<Long> values) {
            addCriterion("OpID not in", values, "opid");
            return this;
        }

        public Criteria andOpidBetween(Long value1, Long value2) {
            addCriterion("OpID between", value1, value2, "opid");
            return this;
        }

        public Criteria andOpidNotBetween(Long value1, Long value2) {
            addCriterion("OpID not between", value1, value2, "opid");
            return this;
        }
    }
}