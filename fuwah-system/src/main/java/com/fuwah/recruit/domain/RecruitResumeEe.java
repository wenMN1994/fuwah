package com.fuwah.recruit.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fuwah.common.annotation.Excel;
import com.fuwah.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 招聘简历-教育经历对象 recruit_resume_ee
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
public class RecruitResumeEe extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 教育经历ID */
    private Long id;

    /** 入学时间 */
    @Excel(name = "入学时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date schoolStartTime;

    /** 毕业时间 */
    @Excel(name = "毕业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date schoolEndTime;

    /** 毕业院校 */
    @Excel(name = "毕业院校")
    private String schools;

    /** 学历 */
    @Excel(name = "学历")
    private String schoolEducation;

    /** 专业 */
    @Excel(name = "专业")
    private String schoolMajor;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public Date getSchoolStartTime() {
        return schoolStartTime;
    }

    public void setSchoolStartTime(Date schoolStartTime) {
        this.schoolStartTime = schoolStartTime;
    }

    public Date getSchoolEndTime() {
        return schoolEndTime;
    }

    public void setSchoolEndTime(Date schoolEndTime) {
        this.schoolEndTime = schoolEndTime;
    }

    public void setSchools(String schools)
    {
        this.schools = schools;
    }

    public String getSchools() 
    {
        return schools;
    }

    public String getSchoolEducation() {
        return schoolEducation;
    }

    public void setSchoolEducation(String schoolEducation) {
        this.schoolEducation = schoolEducation;
    }

    public String getSchoolMajor() {
        return schoolMajor;
    }

    public void setSchoolMajor(String schoolMajor) {
        this.schoolMajor = schoolMajor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("schoolStartTime", getSchoolStartTime())
            .append("schoolEndTime", getSchoolEndTime())
            .append("schools", getSchools())
            .append("schoolEducation", getSchoolEducation())
            .append("schoolMajor", getSchoolMajor())
            .toString();
    }
}
