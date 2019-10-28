package com.fuwah.recruit.mapper;

import com.fuwah.recruit.domain.RecruitResume;
import java.util.List;

/**
 * 招聘简历Mapper接口
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
public interface RecruitResumeMapper 
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
     * 删除招聘简历
     * 
     * @param resumeId 招聘简历ID
     * @return 结果
     */
    public int deleteRecruitResumeById(String resumeId);

    /**
     * 批量删除招聘简历
     * 
     * @param resumeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRecruitResumeByIds(String[] resumeIds);
}
