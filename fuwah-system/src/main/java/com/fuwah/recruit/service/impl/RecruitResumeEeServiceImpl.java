package com.fuwah.recruit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fuwah.recruit.mapper.RecruitResumeEeMapper;
import com.fuwah.recruit.domain.RecruitResumeEe;
import com.fuwah.recruit.service.IRecruitResumeEeService;
import com.fuwah.common.core.text.Convert;

/**
 * 招聘简历-教育经历Service业务层处理
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
@Service
public class RecruitResumeEeServiceImpl implements IRecruitResumeEeService 
{
    @Autowired
    private RecruitResumeEeMapper recruitResumeEeMapper;

    /**
     * 查询招聘简历-教育经历
     * 
     * @param id 招聘简历-教育经历ID
     * @return 招聘简历-教育经历
     */
    @Override
    public RecruitResumeEe selectRecruitResumeEeById(Long id)
    {
        return recruitResumeEeMapper.selectRecruitResumeEeById(id);
    }

    /**
     * 查询招聘简历-教育经历列表
     * 
     * @param recruitResumeEe 招聘简历-教育经历
     * @return 招聘简历-教育经历
     */
    @Override
    public List<RecruitResumeEe> selectRecruitResumeEeList(RecruitResumeEe recruitResumeEe)
    {
        return recruitResumeEeMapper.selectRecruitResumeEeList(recruitResumeEe);
    }

    /**
     * 新增招聘简历-教育经历
     * 
     * @param recruitResumeEe 招聘简历-教育经历
     * @return 结果
     */
    @Override
    public int insertRecruitResumeEe(RecruitResumeEe recruitResumeEe)
    {
        return recruitResumeEeMapper.insertRecruitResumeEe(recruitResumeEe);
    }

    /**
     * 修改招聘简历-教育经历
     * 
     * @param recruitResumeEe 招聘简历-教育经历
     * @return 结果
     */
    @Override
    public int updateRecruitResumeEe(RecruitResumeEe recruitResumeEe)
    {
        return recruitResumeEeMapper.updateRecruitResumeEe(recruitResumeEe);
    }

    /**
     * 删除招聘简历-教育经历对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRecruitResumeEeByIds(String ids)
    {
        return recruitResumeEeMapper.deleteRecruitResumeEeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除招聘简历-教育经历信息
     * 
     * @param id 招聘简历-教育经历ID
     * @return 结果
     */
    @Override
    public int deleteRecruitResumeEeById(Long id)
    {
        return recruitResumeEeMapper.deleteRecruitResumeEeById(id);
    }
}
