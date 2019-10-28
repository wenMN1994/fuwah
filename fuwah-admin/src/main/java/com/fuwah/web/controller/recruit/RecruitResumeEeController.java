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
import com.fuwah.recruit.domain.RecruitResumeEe;
import com.fuwah.recruit.service.IRecruitResumeEeService;
import com.fuwah.common.core.controller.BaseController;
import com.fuwah.common.core.domain.AjaxResult;
import com.fuwah.common.utils.poi.ExcelUtil;
import com.fuwah.common.core.page.TableDataInfo;

/**
 * 招聘简历-教育经历Controller
 * 
 * @author DragonWen
 * @date 2019-10-25
 */
@Controller
@RequestMapping("/recruit/ee")
public class RecruitResumeEeController extends BaseController
{
    private String prefix = "recruit/ee";

    @Autowired
    private IRecruitResumeEeService recruitResumeEeService;

    @RequiresPermissions("recruit:ee:view")
    @GetMapping()
    public String ee()
    {
        return prefix + "/ee";
    }

    /**
     * 查询招聘简历-教育经历列表
     */
    @RequiresPermissions("recruit:ee:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RecruitResumeEe recruitResumeEe)
    {
        startPage();
        List<RecruitResumeEe> list = recruitResumeEeService.selectRecruitResumeEeList(recruitResumeEe);
        return getDataTable(list);
    }

    /**
     * 导出招聘简历-教育经历列表
     */
    @RequiresPermissions("recruit:ee:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RecruitResumeEe recruitResumeEe)
    {
        List<RecruitResumeEe> list = recruitResumeEeService.selectRecruitResumeEeList(recruitResumeEe);
        ExcelUtil<RecruitResumeEe> util = new ExcelUtil<RecruitResumeEe>(RecruitResumeEe.class);
        return util.exportExcel(list, "ee");
    }

    /**
     * 新增招聘简历-教育经历
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存招聘简历-教育经历
     */
    @RequiresPermissions("recruit:ee:add")
    @Log(title = "招聘简历-教育经历", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RecruitResumeEe recruitResumeEe)
    {
        return toAjax(recruitResumeEeService.insertRecruitResumeEe(recruitResumeEe));
    }

    /**
     * 修改招聘简历-教育经历
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RecruitResumeEe recruitResumeEe = recruitResumeEeService.selectRecruitResumeEeById(id);
        mmap.put("recruitResumeEe", recruitResumeEe);
        return prefix + "/edit";
    }

    /**
     * 修改保存招聘简历-教育经历
     */
    @RequiresPermissions("recruit:ee:edit")
    @Log(title = "招聘简历-教育经历", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RecruitResumeEe recruitResumeEe)
    {
        return toAjax(recruitResumeEeService.updateRecruitResumeEe(recruitResumeEe));
    }

    /**
     * 删除招聘简历-教育经历
     */
    @RequiresPermissions("recruit:ee:remove")
    @Log(title = "招聘简历-教育经历", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(recruitResumeEeService.deleteRecruitResumeEeByIds(ids));
    }
}
