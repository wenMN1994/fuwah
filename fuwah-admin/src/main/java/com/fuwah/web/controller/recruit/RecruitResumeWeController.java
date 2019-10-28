package com.fuwah.web.controller.recruit;

import java.util.List;
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
import com.fuwah.recruit.domain.RecruitResumeWe;
import com.fuwah.recruit.service.IRecruitResumeWeService;
import com.fuwah.common.core.controller.BaseController;
import com.fuwah.common.core.domain.AjaxResult;
import com.fuwah.common.utils.poi.ExcelUtil;
import com.fuwah.common.core.page.TableDataInfo;

/**
 * 招聘简历-工作经历Controller
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
@Controller
@RequestMapping("/recruit/we")
public class RecruitResumeWeController extends BaseController
{
    private String prefix = "recruit/we";

    @Autowired
    private IRecruitResumeWeService recruitResumeWeService;

    @RequiresPermissions("recruit:we:view")
    @GetMapping()
    public String we()
    {
        return prefix + "/we";
    }

    /**
     * 查询招聘简历-工作经历列表
     */
    @RequiresPermissions("recruit:we:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RecruitResumeWe recruitResumeWe)
    {
        startPage();
        List<RecruitResumeWe> list = recruitResumeWeService.selectRecruitResumeWeList(recruitResumeWe);
        return getDataTable(list);
    }

    /**
     * 导出招聘简历-工作经历列表
     */
    @RequiresPermissions("recruit:we:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RecruitResumeWe recruitResumeWe)
    {
        List<RecruitResumeWe> list = recruitResumeWeService.selectRecruitResumeWeList(recruitResumeWe);
        ExcelUtil<RecruitResumeWe> util = new ExcelUtil<RecruitResumeWe>(RecruitResumeWe.class);
        return util.exportExcel(list, "we");
    }

    /**
     * 新增招聘简历-工作经历
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存招聘简历-工作经历
     */
    @RequiresPermissions("recruit:we:add")
    @Log(title = "招聘简历-工作经历", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RecruitResumeWe recruitResumeWe)
    {
        return toAjax(recruitResumeWeService.insertRecruitResumeWe(recruitResumeWe));
    }

    /**
     * 修改招聘简历-工作经历
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RecruitResumeWe recruitResumeWe = recruitResumeWeService.selectRecruitResumeWeById(id);
        mmap.put("recruitResumeWe", recruitResumeWe);
        return prefix + "/edit";
    }

    /**
     * 修改保存招聘简历-工作经历
     */
    @RequiresPermissions("recruit:we:edit")
    @Log(title = "招聘简历-工作经历", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RecruitResumeWe recruitResumeWe)
    {
        return toAjax(recruitResumeWeService.updateRecruitResumeWe(recruitResumeWe));
    }

    /**
     * 删除招聘简历-工作经历
     */
    @RequiresPermissions("recruit:we:remove")
    @Log(title = "招聘简历-工作经历", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(recruitResumeWeService.deleteRecruitResumeWeByIds(ids));
    }
}
