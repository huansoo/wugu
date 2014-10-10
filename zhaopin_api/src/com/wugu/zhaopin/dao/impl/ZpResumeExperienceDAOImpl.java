package com.wugu.zhaopin.dao.impl;

import com.wugu.zhaopin.dao.ZpResumeExperienceDAO;
import com.wugu.zhaopin.vo.ZpResumeExperience;
import com.wugu.zhaopin.vo.ZpResumeExperienceCriteria;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;

public class ZpResumeExperienceDAOImpl implements ZpResumeExperienceDAO {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	private SqlMapClient sqlMapClient;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public ZpResumeExperienceDAOImpl(SqlMapClient sqlMapClient) {
		super();
		this.sqlMapClient = sqlMapClient;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public int countByExample(ZpResumeExperienceCriteria example)
			throws SQLException {
		Integer count = (Integer) sqlMapClient.queryForObject(
				"zp_resume_experience.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public int deleteByExample(ZpResumeExperienceCriteria example)
			throws SQLException {
		int rows = sqlMapClient
				.delete("zp_resume_experience.ibatorgenerated_deleteByExample",
						example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public int deleteByPrimaryKey(Long resumeExperienceId) throws SQLException {
		ZpResumeExperience key = new ZpResumeExperience();
		key.setResumeExperienceId(resumeExperienceId);
		int rows = sqlMapClient.delete(
				"zp_resume_experience.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public Long insert(ZpResumeExperience record) throws SQLException {
		Object newKey = sqlMapClient.insert(
				"zp_resume_experience.ibatorgenerated_insert", record);
		return (Long) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public Long insertSelective(ZpResumeExperience record) throws SQLException {
		Object newKey = sqlMapClient.insert(
				"zp_resume_experience.ibatorgenerated_insertSelective", record);
		return (Long) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	@SuppressWarnings("unchecked")
	public List<ZpResumeExperience> selectByExample(
			ZpResumeExperienceCriteria example) throws SQLException {
		List<ZpResumeExperience> list = sqlMapClient
				.queryForList(
						"zp_resume_experience.ibatorgenerated_selectByExample",
						example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public ZpResumeExperience selectByPrimaryKey(Long resumeExperienceId)
			throws SQLException {
		ZpResumeExperience key = new ZpResumeExperience();
		key.setResumeExperienceId(resumeExperienceId);
		ZpResumeExperience record = (ZpResumeExperience) sqlMapClient
				.queryForObject(
						"zp_resume_experience.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public int updateByExampleSelective(ZpResumeExperience record,
			ZpResumeExperienceCriteria example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = sqlMapClient
				.update("zp_resume_experience.ibatorgenerated_updateByExampleSelective",
						parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public int updateByExample(ZpResumeExperience record,
			ZpResumeExperienceCriteria example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = sqlMapClient.update(
				"zp_resume_experience.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public int updateByPrimaryKeySelective(ZpResumeExperience record)
			throws SQLException {
		int rows = sqlMapClient
				.update("zp_resume_experience.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	public int updateByPrimaryKey(ZpResumeExperience record)
			throws SQLException {
		int rows = sqlMapClient.update(
				"zp_resume_experience.ibatorgenerated_updateByPrimaryKey",
				record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table zp_resume_experience
	 * @ibatorgenerated  Wed Dec 18 15:16:05 CST 2013
	 */
	private static class UpdateByExampleParms extends
			ZpResumeExperienceCriteria {
		private Object record;

		public UpdateByExampleParms(Object record,
				ZpResumeExperienceCriteria example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}