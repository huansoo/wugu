package com.wugu.zhaopin.webapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZpResumeEducationCriteria {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	public ZpResumeEducationCriteria() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	protected ZpResumeEducationCriteria(ZpResumeEducationCriteria example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table zp_resume_education
	 * @ibatorgenerated  Wed Dec 18 15:16:23 CST 2013
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
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

		public Criteria andResumeEducationIdIsNull() {
			addCriterion("resume_education_id is null");
			return this;
		}

		public Criteria andResumeEducationIdIsNotNull() {
			addCriterion("resume_education_id is not null");
			return this;
		}

		public Criteria andResumeEducationIdEqualTo(Long value) {
			addCriterion("resume_education_id =", value, "resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdNotEqualTo(Long value) {
			addCriterion("resume_education_id <>", value, "resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdGreaterThan(Long value) {
			addCriterion("resume_education_id >", value, "resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdGreaterThanOrEqualTo(Long value) {
			addCriterion("resume_education_id >=", value, "resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdLessThan(Long value) {
			addCriterion("resume_education_id <", value, "resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdLessThanOrEqualTo(Long value) {
			addCriterion("resume_education_id <=", value, "resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdIn(List<Long> values) {
			addCriterion("resume_education_id in", values, "resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdNotIn(List<Long> values) {
			addCriterion("resume_education_id not in", values,
					"resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdBetween(Long value1, Long value2) {
			addCriterion("resume_education_id between", value1, value2,
					"resumeEducationId");
			return this;
		}

		public Criteria andResumeEducationIdNotBetween(Long value1, Long value2) {
			addCriterion("resume_education_id not between", value1, value2,
					"resumeEducationId");
			return this;
		}

		public Criteria andResumeIdIsNull() {
			addCriterion("resume_id is null");
			return this;
		}

		public Criteria andResumeIdIsNotNull() {
			addCriterion("resume_id is not null");
			return this;
		}

		public Criteria andResumeIdEqualTo(Long value) {
			addCriterion("resume_id =", value, "resumeId");
			return this;
		}

		public Criteria andResumeIdNotEqualTo(Long value) {
			addCriterion("resume_id <>", value, "resumeId");
			return this;
		}

		public Criteria andResumeIdGreaterThan(Long value) {
			addCriterion("resume_id >", value, "resumeId");
			return this;
		}

		public Criteria andResumeIdGreaterThanOrEqualTo(Long value) {
			addCriterion("resume_id >=", value, "resumeId");
			return this;
		}

		public Criteria andResumeIdLessThan(Long value) {
			addCriterion("resume_id <", value, "resumeId");
			return this;
		}

		public Criteria andResumeIdLessThanOrEqualTo(Long value) {
			addCriterion("resume_id <=", value, "resumeId");
			return this;
		}

		public Criteria andResumeIdIn(List<Long> values) {
			addCriterion("resume_id in", values, "resumeId");
			return this;
		}

		public Criteria andResumeIdNotIn(List<Long> values) {
			addCriterion("resume_id not in", values, "resumeId");
			return this;
		}

		public Criteria andResumeIdBetween(Long value1, Long value2) {
			addCriterion("resume_id between", value1, value2, "resumeId");
			return this;
		}

		public Criteria andResumeIdNotBetween(Long value1, Long value2) {
			addCriterion("resume_id not between", value1, value2, "resumeId");
			return this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return this;
		}

		public Criteria andStartTimeEqualTo(Integer value) {
			addCriterion("start_time =", value, "startTime");
			return this;
		}

		public Criteria andStartTimeNotEqualTo(Integer value) {
			addCriterion("start_time <>", value, "startTime");
			return this;
		}

		public Criteria andStartTimeGreaterThan(Integer value) {
			addCriterion("start_time >", value, "startTime");
			return this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("start_time >=", value, "startTime");
			return this;
		}

		public Criteria andStartTimeLessThan(Integer value) {
			addCriterion("start_time <", value, "startTime");
			return this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Integer value) {
			addCriterion("start_time <=", value, "startTime");
			return this;
		}

		public Criteria andStartTimeIn(List<Integer> values) {
			addCriterion("start_time in", values, "startTime");
			return this;
		}

		public Criteria andStartTimeNotIn(List<Integer> values) {
			addCriterion("start_time not in", values, "startTime");
			return this;
		}

		public Criteria andStartTimeBetween(Integer value1, Integer value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return this;
		}

		public Criteria andStartTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return this;
		}

		public Criteria andEndTimeIsNull() {
			addCriterion("end_time is null");
			return this;
		}

		public Criteria andEndTimeIsNotNull() {
			addCriterion("end_time is not null");
			return this;
		}

		public Criteria andEndTimeEqualTo(Integer value) {
			addCriterion("end_time =", value, "endTime");
			return this;
		}

		public Criteria andEndTimeNotEqualTo(Integer value) {
			addCriterion("end_time <>", value, "endTime");
			return this;
		}

		public Criteria andEndTimeGreaterThan(Integer value) {
			addCriterion("end_time >", value, "endTime");
			return this;
		}

		public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("end_time >=", value, "endTime");
			return this;
		}

		public Criteria andEndTimeLessThan(Integer value) {
			addCriterion("end_time <", value, "endTime");
			return this;
		}

		public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
			addCriterion("end_time <=", value, "endTime");
			return this;
		}

		public Criteria andEndTimeIn(List<Integer> values) {
			addCriterion("end_time in", values, "endTime");
			return this;
		}

		public Criteria andEndTimeNotIn(List<Integer> values) {
			addCriterion("end_time not in", values, "endTime");
			return this;
		}

		public Criteria andEndTimeBetween(Integer value1, Integer value2) {
			addCriterion("end_time between", value1, value2, "endTime");
			return this;
		}

		public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("end_time not between", value1, value2, "endTime");
			return this;
		}

		public Criteria andSchoolNameIsNull() {
			addCriterion("school_name is null");
			return this;
		}

		public Criteria andSchoolNameIsNotNull() {
			addCriterion("school_name is not null");
			return this;
		}

		public Criteria andSchoolNameEqualTo(String value) {
			addCriterion("school_name =", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameNotEqualTo(String value) {
			addCriterion("school_name <>", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameGreaterThan(String value) {
			addCriterion("school_name >", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
			addCriterion("school_name >=", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameLessThan(String value) {
			addCriterion("school_name <", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameLessThanOrEqualTo(String value) {
			addCriterion("school_name <=", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameLike(String value) {
			addCriterion("school_name like", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameNotLike(String value) {
			addCriterion("school_name not like", value, "schoolName");
			return this;
		}

		public Criteria andSchoolNameIn(List<String> values) {
			addCriterion("school_name in", values, "schoolName");
			return this;
		}

		public Criteria andSchoolNameNotIn(List<String> values) {
			addCriterion("school_name not in", values, "schoolName");
			return this;
		}

		public Criteria andSchoolNameBetween(String value1, String value2) {
			addCriterion("school_name between", value1, value2, "schoolName");
			return this;
		}

		public Criteria andSchoolNameNotBetween(String value1, String value2) {
			addCriterion("school_name not between", value1, value2,
					"schoolName");
			return this;
		}

		public Criteria andSubjectNameIsNull() {
			addCriterion("subject_name is null");
			return this;
		}

		public Criteria andSubjectNameIsNotNull() {
			addCriterion("subject_name is not null");
			return this;
		}

		public Criteria andSubjectNameEqualTo(String value) {
			addCriterion("subject_name =", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameNotEqualTo(String value) {
			addCriterion("subject_name <>", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameGreaterThan(String value) {
			addCriterion("subject_name >", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
			addCriterion("subject_name >=", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameLessThan(String value) {
			addCriterion("subject_name <", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameLessThanOrEqualTo(String value) {
			addCriterion("subject_name <=", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameLike(String value) {
			addCriterion("subject_name like", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameNotLike(String value) {
			addCriterion("subject_name not like", value, "subjectName");
			return this;
		}

		public Criteria andSubjectNameIn(List<String> values) {
			addCriterion("subject_name in", values, "subjectName");
			return this;
		}

		public Criteria andSubjectNameNotIn(List<String> values) {
			addCriterion("subject_name not in", values, "subjectName");
			return this;
		}

		public Criteria andSubjectNameBetween(String value1, String value2) {
			addCriterion("subject_name between", value1, value2, "subjectName");
			return this;
		}

		public Criteria andSubjectNameNotBetween(String value1, String value2) {
			addCriterion("subject_name not between", value1, value2,
					"subjectName");
			return this;
		}

		public Criteria andDegreeIsNull() {
			addCriterion("degree is null");
			return this;
		}

		public Criteria andDegreeIsNotNull() {
			addCriterion("degree is not null");
			return this;
		}

		public Criteria andDegreeEqualTo(String value) {
			addCriterion("degree =", value, "degree");
			return this;
		}

		public Criteria andDegreeNotEqualTo(String value) {
			addCriterion("degree <>", value, "degree");
			return this;
		}

		public Criteria andDegreeGreaterThan(String value) {
			addCriterion("degree >", value, "degree");
			return this;
		}

		public Criteria andDegreeGreaterThanOrEqualTo(String value) {
			addCriterion("degree >=", value, "degree");
			return this;
		}

		public Criteria andDegreeLessThan(String value) {
			addCriterion("degree <", value, "degree");
			return this;
		}

		public Criteria andDegreeLessThanOrEqualTo(String value) {
			addCriterion("degree <=", value, "degree");
			return this;
		}

		public Criteria andDegreeLike(String value) {
			addCriterion("degree like", value, "degree");
			return this;
		}

		public Criteria andDegreeNotLike(String value) {
			addCriterion("degree not like", value, "degree");
			return this;
		}

		public Criteria andDegreeIn(List<String> values) {
			addCriterion("degree in", values, "degree");
			return this;
		}

		public Criteria andDegreeNotIn(List<String> values) {
			addCriterion("degree not in", values, "degree");
			return this;
		}

		public Criteria andDegreeBetween(String value1, String value2) {
			addCriterion("degree between", value1, value2, "degree");
			return this;
		}

		public Criteria andDegreeNotBetween(String value1, String value2) {
			addCriterion("degree not between", value1, value2, "degree");
			return this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2,
					"description");
			return this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return this;
		}

		public Criteria andCreateTimeEqualTo(Integer value) {
			addCriterion("create_time =", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeNotEqualTo(Integer value) {
			addCriterion("create_time <>", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeGreaterThan(Integer value) {
			addCriterion("create_time >", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("create_time >=", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeLessThan(Integer value) {
			addCriterion("create_time <", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
			addCriterion("create_time <=", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeIn(List<Integer> values) {
			addCriterion("create_time in", values, "createTime");
			return this;
		}

		public Criteria andCreateTimeNotIn(List<Integer> values) {
			addCriterion("create_time not in", values, "createTime");
			return this;
		}

		public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return this;
		}

		public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return this;
		}

		public Criteria andUpdateTimeEqualTo(Integer value) {
			addCriterion("update_time =", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotEqualTo(Integer value) {
			addCriterion("update_time <>", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeGreaterThan(Integer value) {
			addCriterion("update_time >", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("update_time >=", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeLessThan(Integer value) {
			addCriterion("update_time <", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
			addCriterion("update_time <=", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeIn(List<Integer> values) {
			addCriterion("update_time in", values, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotIn(List<Integer> values) {
			addCriterion("update_time not in", values, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("update_time not between", value1, value2,
					"updateTime");
			return this;
		}

		public Criteria andOpIdIsNull() {
			addCriterion("op_id is null");
			return this;
		}

		public Criteria andOpIdIsNotNull() {
			addCriterion("op_id is not null");
			return this;
		}

		public Criteria andOpIdEqualTo(Long value) {
			addCriterion("op_id =", value, "opId");
			return this;
		}

		public Criteria andOpIdNotEqualTo(Long value) {
			addCriterion("op_id <>", value, "opId");
			return this;
		}

		public Criteria andOpIdGreaterThan(Long value) {
			addCriterion("op_id >", value, "opId");
			return this;
		}

		public Criteria andOpIdGreaterThanOrEqualTo(Long value) {
			addCriterion("op_id >=", value, "opId");
			return this;
		}

		public Criteria andOpIdLessThan(Long value) {
			addCriterion("op_id <", value, "opId");
			return this;
		}

		public Criteria andOpIdLessThanOrEqualTo(Long value) {
			addCriterion("op_id <=", value, "opId");
			return this;
		}

		public Criteria andOpIdIn(List<Long> values) {
			addCriterion("op_id in", values, "opId");
			return this;
		}

		public Criteria andOpIdNotIn(List<Long> values) {
			addCriterion("op_id not in", values, "opId");
			return this;
		}

		public Criteria andOpIdBetween(Long value1, Long value2) {
			addCriterion("op_id between", value1, value2, "opId");
			return this;
		}

		public Criteria andOpIdNotBetween(Long value1, Long value2) {
			addCriterion("op_id not between", value1, value2, "opId");
			return this;
		}
	}
}