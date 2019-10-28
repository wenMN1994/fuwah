package com.fuwah.recruit.mapper;

import com.fuwah.recruit.domain.RecruitResumeWe;
import java.util.List;

/**
 * 招聘简历-工作经历Mapper接口
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
public interface RecruitResumeWeMapper 
{
    /**
     * 查询招聘简历-工作经历
     * 
     * @param id 招聘简历-工作经历ID
     * @return 招聘简历-工作经历
     */
    public RecruitResumeWe selectRecruitResumeWeById(Long id);

    /**
     * 查询招聘简历-工作经历列表
     * 
     * @param recruitResumeWe 招聘简历-工作经历
     * @return 招聘简历-工作经历集合
     */
    public List<RecruitResumeWe> selectRecruitResumeWeList(RecruitResumeWe recruitResumeWe);

    /**
     * 新增招聘简历-工作经历
     * 
     * @param recruitResumeWe 招聘简历-工作经历
     * @return 结果
     */
    public int insertRecruitResumeWe(RecruitResumeWe recruitResumeWe);

    /**
     * 修改招聘简历-工作经历
     * 
     * @param recruitResumeWe 招聘简历-工作经历
     * @return 结果
     */
    public int updateRecruitResumeWe(RecruitResumeWe recruitResumeWe);

    /**
     * 删除招聘简历-工作经历
     * 
     * @param id 招聘简历-工作经历ID
     * @return 结果
     */
    public int deleteRecruitResumeWeById(Long id);

    /**
     * 批量删除招聘简历-工作经历
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRecruitResumeWeByIds(String[] ids);
}
