package com.fuwah.recruit.service.impl;

import java.util.List;
import com.fuwah.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fuwah.recruit.mapper.RecruitResumeMapper;
import com.fuwah.recruit.domain.RecruitResume;
import com.fuwah.recruit.service.IRecruitResumeService;
import com.fuwah.common.core.text.Convert;

/**
 * 招聘简历Service业务层处理
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
@Service
public class RecruitResumeServiceImpl implements IRecruitResumeService 
{
    @Autowired
    private RecruitResumeMapper recruitResumeMapper;

    /**
     * 查询招聘简历
     * 
     * @param resumeId 招聘简历ID
     * @return 招聘简历
     */
    @Override
    public RecruitResume selectRecruitResumeById(String resumeId)
    {
        return recruitResumeMapper.selectRecruitResumeById(resumeId);
    }

    /**
     * 查询招聘简历列表
     * 
     * @param recruitResume 招聘简历
     * @return 招聘简历
     */
    @Override
    public List<RecruitResume> selectRecruitResumeList(RecruitResume recruitResume)
    {
        return recruitResumeMapper.selectRecruitResumeList(recruitResume);
    }

    /**
     * 新增招聘简历
     * 
     * @param recruitResume 招聘简历
     * @return 结果
     */
    @Override
    public int insertRecruitResume(RecruitResume recruitResume)
    {
        recruitResume.setCreateTime(DateUtils.getNowDate());
        return recruitResumeMapper.insertRecruitResume(recruitResume);
    }

    /**
     * 修改招聘简历
     * 
     * @param recruitResume 招聘简历
     * @return 结果
     */
    @Override
    public int updateRecruitResume(RecruitResume recruitResume)
    {
        recruitResume.setUpdateTime(DateUtils.getNowDate());
        return recruitResumeMapper.updateRecruitResume(recruitResume);
    }

    /**
     * 删除招聘简历对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRecruitResumeByIds(String ids)
    {
        return recruitResumeMapper.deleteRecruitResumeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除招聘简历信息
     * 
     * @param resumeId 招聘简历ID
     * @return 结果
     */
    @Override
    public int deleteRecruitResumeById(String resumeId)
    {
        return recruitResumeMapper.deleteRecruitResumeById(resumeId);
    }
}
