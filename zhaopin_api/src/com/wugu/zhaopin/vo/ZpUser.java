package com.wugu.zhaopin.vo;

import java.io.Serializable;

public class ZpUser implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.user_id
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Long userId;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.user_name
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private String userName;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.real_name
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private String realName;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.gender
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Integer gender;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.birth_date
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Integer birthDate;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.certificate_ud
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private String certificateUd;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.mobile_tel
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private String mobileTel;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.type
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Integer type;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.status
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Integer status;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.create_time
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Integer createTime;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.update_time
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Integer updateTime;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column zp_user.op_id
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private Long opId;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database table zp_user
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.user_id
     * @return  the value of zp_user.user_id
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Long getUserId()
    {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.user_id
     * @param userId  the value for zp_user.user_id
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.user_name
     * @return  the value of zp_user.user_name
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.user_name
     * @param userName  the value for zp_user.user_name
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.real_name
     * @return  the value of zp_user.real_name
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public String getRealName()
    {
        return realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.real_name
     * @param realName  the value for zp_user.real_name
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setRealName(String realName)
    {
        this.realName = realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.gender
     * @return  the value of zp_user.gender
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Integer getGender()
    {
        return gender;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.gender
     * @param gender  the value for zp_user.gender
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setGender(Integer gender)
    {
        this.gender = gender;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.birth_date
     * @return  the value of zp_user.birth_date
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Integer getBirthDate()
    {
        return birthDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.birth_date
     * @param birthDate  the value for zp_user.birth_date
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setBirthDate(Integer birthDate)
    {
        this.birthDate = birthDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.certificate_ud
     * @return  the value of zp_user.certificate_ud
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public String getCertificateUd()
    {
        return certificateUd;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.certificate_ud
     * @param certificateUd  the value for zp_user.certificate_ud
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setCertificateUd(String certificateUd)
    {
        this.certificateUd = certificateUd;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.mobile_tel
     * @return  the value of zp_user.mobile_tel
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public String getMobileTel()
    {
        return mobileTel;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.mobile_tel
     * @param mobileTel  the value for zp_user.mobile_tel
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setMobileTel(String mobileTel)
    {
        this.mobileTel = mobileTel;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.type
     * @return  the value of zp_user.type
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Integer getType()
    {
        return type;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.type
     * @param type  the value for zp_user.type
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setType(Integer type)
    {
        this.type = type;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.status
     * @return  the value of zp_user.status
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Integer getStatus()
    {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.status
     * @param status  the value for zp_user.status
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.create_time
     * @return  the value of zp_user.create_time
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Integer getCreateTime()
    {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.create_time
     * @param createTime  the value for zp_user.create_time
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setCreateTime(Integer createTime)
    {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.update_time
     * @return  the value of zp_user.update_time
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Integer getUpdateTime()
    {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.update_time
     * @param updateTime  the value for zp_user.update_time
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setUpdateTime(Integer updateTime)
    {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column zp_user.op_id
     * @return  the value of zp_user.op_id
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public Long getOpId()
    {
        return opId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column zp_user.op_id
     * @param opId  the value for zp_user.op_id
     * @ibatorgenerated  Thu Dec 26 19:21:47 CST 2013
     */
    public void setOpId(Long opId)
    {
        this.opId = opId;
    }
}