/**  
* @Title:  PostReportModel.java
* @Package com.wugu.zhaopin.webapp.model
* @Description: TODO(用一句话描述该文件做什么)
* @author lijun
* @date  2014-3-10 
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.wugu.zhaopin.webapp.model;

/**
 * @ClassName: PostReportModel
 * @Description: 职位搜索json对象
 * @author lijun
 * @date 2014-3-10 
 *
 */
public class PostReportModel extends BaseModel
{
   /* 一、timeType
    1：职位发布时间
    2：公司发布时间
    二、startTime
    开始时间
    三、endTime
    结束时间
    四、keyType
    1：职位名（模糊）
    2：职位id
    3：公司名（模糊）
    4：公司id
    五、keyWord
    关键字
    六、publicMan
    发布人（模糊）
    七、order
    1：职位发布降序
    2：职位发布升序
    3：公司发布降序
    4：公司发布升序
    八、pageSize
    页面大小
    九、page
    第几页*/
    Integer timeType ;
    Integer startTime;
    Integer endTime;
    Integer keyType;
    String keyWord;
    String publicMan;
    String order;
    Integer orderType;
    Integer pageSize = 20;
    Integer page = 1;
    Integer companyId;
    Integer companyStatus;
    Integer postStatus;
    String workAddress;
    
    public Integer getCompanyId()
    {
        return companyId;
    }
    public String getWorkAddress()
    {
        return workAddress;
    }
    public void setWorkAddress(String workAddress)
    {
        this.workAddress = workAddress;
    }
    public void setCompanyId(Integer companyId)
    {
        this.companyId = companyId;
    }
    public Integer getCompanyStatus()
    {
        return companyStatus;
    }
    public void setCompanyStatus(Integer companyStatus)
    {
        this.companyStatus = companyStatus;
    }
    public Integer getPostStatus()
    {
        return postStatus;
    }
    public void setPostStatus(Integer postStatus)
    {
        this.postStatus = postStatus;
    }
    public Integer getTimeType()
    {
        return timeType;
    }
    public void setTimeType(Integer timeType)
    {
        this.timeType = timeType;
    }
    public Integer getStartTime()
    {
        return startTime;
    }
    public void setStartTime(Integer startTime)
    {
        this.startTime = startTime;
    }
    public Integer getEndTime()
    {
        return endTime;
    }
    public void setEndTime(Integer endTime)
    {
        this.endTime = endTime;
    }
    public Integer getKeyType()
    {
        return keyType;
    }
    public void setKeyType(Integer keyType)
    {
        this.keyType = keyType;
    }
    public String getKeyWord()
    {
        return keyWord;
    }
    public void setKeyWord(String keyWord)
    {
        this.keyWord = keyWord;
    }
    public String getPublicMan()
    {
        return publicMan;
    }
    public void setPublicMan(String publicMan)
    {
        this.publicMan = publicMan;
    }
    public String getOrder()
    {
        return order;
    }
    public void setOrder(String order)
    {
        this.order = order;
    }
    public Integer getOrderType()
    {
        return orderType;
    }
    public void setOrderType(Integer orderType)
    {
        this.orderType = orderType;
    }
    public Integer getPageSize()
    {
        return pageSize;
    }
    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }
    public Integer getPage()
    {
        return page;
    }
    public void setPage(Integer page)
    {
        this.page = page;
    }  

}
