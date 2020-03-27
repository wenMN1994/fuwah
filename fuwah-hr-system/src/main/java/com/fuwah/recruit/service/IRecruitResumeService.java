package com.fuwah.recruit.service;

import com.fuwah.recruit.domain.RecruitResume;
import java.util.List;

/**
 * 招聘简历Service接口
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
public interface IRecruitResumeService 
{
    /**
     * 查询招聘简历
     * 
     * @param resumeId 招聘简历ID
     * @return 招聘简历
     */
    public RecruitResume selectRecruitResumeById(String resumeId);

    /**
     * 查询招聘简历列表
     * 
     * @param recruitResume 招聘简历
     * @return 招聘简历集合
     */
    public List<RecruitResume> selectRecruitResumeList(RecruitResume recruitResume);

    /**
     * 新增招聘简历
     * 
     * @param recruitResume 招聘简历
     * @return 结果
     */
    public int insertRecruitResume(RecruitResume recruitResume);

    /**
     * 修改招聘简历
     * 
     * @param recruitResume 招聘简历
     * @return 结果
     */
    public int updateRecruitResume(RecruitResume recruitResume);

    /**
     * 批量删除招聘简历
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRecruitResumeByIds(String ids);

    /**
     * 删除招聘简历信息
     * 
     * @param resumeId 招聘简历ID
     * @return 结果
     */
    public int deleteRecruitResumeById(String resumeId);
}
