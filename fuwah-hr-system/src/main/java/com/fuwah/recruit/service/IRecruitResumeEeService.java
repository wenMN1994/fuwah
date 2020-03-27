package com.fuwah.recruit.service;

import com.fuwah.recruit.domain.RecruitResumeEe;
import java.util.List;

/**
 * 招聘简历-教育经历Service接口
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
public interface IRecruitResumeEeService 
{
    /**
     * 查询招聘简历-教育经历
     * 
     * @param id 招聘简历-教育经历ID
     * @return 招聘简历-教育经历
     */
    public RecruitResumeEe selectRecruitResumeEeById(Long id);

    /**
     * 查询招聘简历-教育经历列表
     * 
     * @param recruitResumeEe 招聘简历-教育经历
     * @return 招聘简历-教育经历集合
     */
    public List<RecruitResumeEe> selectRecruitResumeEeList(RecruitResumeEe recruitResumeEe);

    /**
     * 新增招聘简历-教育经历
     * 
     * @param recruitResumeEe 招聘简历-教育经历
     * @return 结果
     */
    public int insertRecruitResumeEe(RecruitResumeEe recruitResumeEe);

    /**
     * 修改招聘简历-教育经历
     * 
     * @param recruitResumeEe 招聘简历-教育经历
     * @return 结果
     */
    public int updateRecruitResumeEe(RecruitResumeEe recruitResumeEe);

    /**
     * 批量删除招聘简历-教育经历
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRecruitResumeEeByIds(String ids);

    /**
     * 删除招聘简历-教育经历信息
     * 
     * @param id 招聘简历-教育经历ID
     * @return 结果
     */
    public int deleteRecruitResumeEeById(Long id);
}
