package com.fuwah.recruit.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fuwah.common.annotation.Excel;
import com.fuwah.common.core.domain.BaseEntity;
import java.util.Date;
import java.util.List;

/**
 * 招聘简历对象 recruit_resume
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
public class RecruitResume extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 简历ID 系统自动生成记录号，生成规则：年份后2位+月份2位+3位编号 */
    private String resumeId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phoneNumber;

    /** 邮箱地址 */
    @Excel(name = "邮箱地址")
    private String email;

    /** 性别（0男 1女 2未知） */
    @Excel(name = "性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthDate;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 求职意向 */
    @Excel(name = "求职意向")
    private String jobIntention;

    /** 专业 */
    @Excel(name = "专业")
    private String major;

    /** 学历 */
    @Excel(name = "学历")
    private String education;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private String workSeniority;

    /** 行业 */
    @Excel(name = "行业")
    private String industry;

    /** 期望月薪 */
    @Excel(name = "期望月薪")
    private Double monthlySalary;

    /** 薪酬结构 */
    @Excel(name = "薪酬结构")
    private String salaryStructure;

    /** 目前居住地址 */
    @Excel(name = "目前居住地址")
    private String address;

    /** 教育经历ID */
    @Excel(name = "教育经历ID")
    private Long educationExperience;

    /** 工作经历ID */
    @Excel(name = "工作经历ID")
    private Long workExperience;

    /** 自我评价 */
    @Excel(name = "自我评价")
    private String selfEvaluation;

    /** 简历来源 */
    @Excel(name = "简历来源")
    private String resumeSource;

    /** 来源渠道 */
    @Excel(name = "来源渠道")
    private String channel;

    /** 简历状态 [新创建；已邀请；面试中；面试通过；待入职；已入职；面试淘汰；已离职] */
    @Excel(name = "简历状态 [新创建；已邀请；面试中；面试通过；待入职；已入职；面试淘汰；已离职]")
    private String status;

    public void setResumeId(String resumeId) 
    {
        this.resumeId = resumeId;
    }

    public String getResumeId() 
    {
        return resumeId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setBirthDate(Date birthDate) 
    {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() 
    {
        return birthDate;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setJobIntention(String jobIntention) 
    {
        this.jobIntention = jobIntention;
    }

    public String getJobIntention() 
    {
        return jobIntention;
    }
    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }
    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }
    public void setWorkSeniority(String workSeniority) 
    {
        this.workSeniority = workSeniority;
    }

    public String getWorkSeniority() 
    {
        return workSeniority;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setMonthlySalary(Double monthlySalary) 
    {
        this.monthlySalary = monthlySalary;
    }

    public Double getMonthlySalary() 
    {
        return monthlySalary;
    }
    public void setSalaryStructure(String salaryStructure) 
    {
        this.salaryStructure = salaryStructure;
    }

    public String getSalaryStructure() 
    {
        return salaryStructure;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setEducationExperience(Long educationExperience) 
    {
        this.educationExperience = educationExperience;
    }

    public Long getEducationExperience() 
    {
        return educationExperience;
    }
    public void setWorkExperience(Long workExperience) 
    {
        this.workExperience = workExperience;
    }

    public Long getWorkExperience() 
    {
        return workExperience;
    }
    public void setSelfEvaluation(String selfEvaluation) 
    {
        this.selfEvaluation = selfEvaluation;
    }

    public String getSelfEvaluation() 
    {
        return selfEvaluation;
    }
    public void setResumeSource(String resumeSource) 
    {
        this.resumeSource = resumeSource;
    }

    public String getResumeSource() 
    {
        return resumeSource;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("resumeId", getResumeId())
            .append("name", getName())
            .append("phoneNumber", getPhoneNumber())
            .append("email", getEmail())
            .append("sex", getSex())
            .append("birthDate", getBirthDate())
            .append("age", getAge())
            .append("jobIntention", getJobIntention())
            .append("major", getMajor())
            .append("education", getEducation())
            .append("workSeniority", getWorkSeniority())
            .append("industry", getIndustry())
            .append("monthlySalary", getMonthlySalary())
            .append("salaryStructure", getSalaryStructure())
            .append("address", getAddress())
            .append("educationExperience", getEducationExperience())
            .append("workExperience", getWorkExperience())
            .append("selfEvaluation", getSelfEvaluation())
            .append("createTime", getCreateTime())
            .append("resumeSource", getResumeSource())
            .append("channel", getChannel())
            .append("createBy", getCreateBy())
            .append("status", getStatus())
            .toString();
    }
}
