package com.fuwah.web.controller.recruit;

import java.util.List;

import com.fuwah.recruit.domain.RecruitResumeEe;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fuwah.common.annotation.Log;
import com.fuwah.common.enums.BusinessType;
import com.fuwah.recruit.domain.RecruitResume;
import com.fuwah.recruit.service.IRecruitResumeService;
import com.fuwah.common.core.controller.BaseController;
import com.fuwah.common.core.domain.AjaxResult;
import com.fuwah.common.utils.poi.ExcelUtil;
import com.fuwah.common.core.page.TableDataInfo;

/**
 * 招聘简历Controller
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
@Controller
@RequestMapping("/recruit/resume")
public class RecruitResumeController extends BaseController
{
    private String prefix = "recruit/resume";

    @Autowired
    private IRecruitResumeService recruitResumeService;

    @RequiresPermissions("recruit:resume:view")
    @GetMapping()
    public String resume()
    {
        return prefix + "/resume";
    }

    /**
     * 查询招聘简历列表
     */
    @RequiresPermissions("recruit:resume:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RecruitResume recruitResume)
    {
        startPage();
        List<RecruitResume> list = recruitResumeService.selectRecruitResumeList(recruitResume);
        return getDataTable(list);
    }

    /**
     * 导出招聘简历列表
     */
    @RequiresPermissions("recruit:resume:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RecruitResume recruitResume)
    {
        List<RecruitResume> list = recruitResumeService.selectRecruitResumeList(recruitResume);
        ExcelUtil<RecruitResume> util = new ExcelUtil<RecruitResume>(RecruitResume.class);
        return util.exportExcel(list, "resume");
    }

    /**
     * 新增招聘简历
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存招聘简历
     */
    @RequiresPermissions("recruit:resume:add")
    @Log(title = "招聘简历", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RecruitResume recruitResume ,RecruitResumeEe recruitResumeEe)
    {
        return toAjax(recruitResumeService.insertRecruitResume(recruitResume));
    }

    /**
     * 修改招聘简历
     */
    @GetMapping("/edit/{resumeId}")
    public String edit(@PathVariable("resumeId") String resumeId, ModelMap mmap)
    {
        RecruitResume recruitResume = recruitResumeService.selectRecruitResumeById(resumeId);
        mmap.put("recruitResume", recruitResume);
        return prefix + "/edit";
    }

    /**
     * 修改保存招聘简历
     */
    @RequiresPermissions("recruit:resume:edit")
    @Log(title = "招聘简历", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RecruitResume recruitResume)
    {
        return toAjax(recruitResumeService.updateRecruitResume(recruitResume));
    }

    /**
     * 删除招聘简历
     */
    @RequiresPermissions("recruit:resume:remove")
    @Log(title = "招聘简历", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(recruitResumeService.deleteRecruitResumeByIds(ids));
    }
}
