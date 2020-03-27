package com.fuwah.recruit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fuwah.recruit.mapper.RecruitResumeWeMapper;
import com.fuwah.recruit.domain.RecruitResumeWe;
import com.fuwah.recruit.service.IRecruitResumeWeService;
import com.fuwah.common.core.text.Convert;

/**
 * 招聘简历-工作经历Service业务层处理
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
@Service
public class RecruitResumeWeServiceImpl implements IRecruitResumeWeService 
{
    @Autowired
    private RecruitResumeWeMapper recruitResumeWeMapper;

    /**
     * 查询招聘简历-工作经历
     * 
     * @param id 招聘简历-工作经历ID
     * @return 招聘简历-工作经历
     */
    @Override
    public RecruitResumeWe selectRecruitResumeWeById(Long id)
    {
        return recruitResumeWeMapper.selectRecruitResumeWeById(id);
    }

    /**
     * 查询招聘简历-工作经历列表
     * 
     * @param recruitResumeWe 招聘简历-工作经历
     * @return 招聘简历-工作经历
     */
    @Override
    public List<RecruitResumeWe> selectRecruitResumeWeList(RecruitResumeWe recruitResumeWe)
    {
        return recruitResumeWeMapper.selectRecruitResumeWeList(recruitResumeWe);
    }

    /**
     * 新增招聘简历-工作经历
     * 
     * @param recruitResumeWe 招聘简历-工作经历
     * @return 结果
     */
    @Override
    public int insertRecruitResumeWe(RecruitResumeWe recruitResumeWe)
    {
        return recruitResumeWeMapper.insertRecruitResumeWe(recruitResumeWe);
    }

    /**
     * 修改招聘简历-工作经历
     * 
     * @param recruitResumeWe 招聘简历-工作经历
     * @return 结果
     */
    @Override
    public int updateRecruitResumeWe(RecruitResumeWe recruitResumeWe)
    {
        return recruitResumeWeMapper.updateRecruitResumeWe(recruitResumeWe);
    }

    /**
     * 删除招聘简历-工作经历对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRecruitResumeWeByIds(String ids)
    {
        return recruitResumeWeMapper.deleteRecruitResumeWeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除招聘简历-工作经历信息
     * 
     * @param id 招聘简历-工作经历ID
     * @return 结果
     */
    @Override
    public int deleteRecruitResumeWeById(Long id)
    {
        return recruitResumeWeMapper.deleteRecruitResumeWeById(id);
    }
}
