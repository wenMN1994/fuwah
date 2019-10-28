package com.fuwah.recruit.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fuwah.common.annotation.Excel;
import com.fuwah.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 招聘简历-工作经历对象 recruit_resume_we
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
public class RecruitResumeWe extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工作经历ID */
    private Long id;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workStartTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workEndTime;

    /** 工作单位 */
    @Excel(name = "工作单位")
    private String workUnit;

    /** 职位 */
    @Excel(name = "职位")
    private String workTitle;

    /** 工作内容 */
    @Excel(name = "工作内容")
    private String workContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(Date workStartTime) {
        this.workStartTime = workStartTime;
    }

    public Date getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(Date workEndTime) {
        this.workEndTime = workEndTime;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workStartTime", getWorkStartTime())
            .append("workEndTime", getWorkEndTime())
            .append("workUnit", getWorkUnit())
            .append("workTitle", getWorkTitle())
            .append("workContent", getWorkContent())
            .toString();
    }
}
