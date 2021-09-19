package cn.freefly.springsecurityjwtredis.web.controller;

import cn.freefly.springsecurityjwtredis.annotation.Log;
import cn.freefly.springsecurityjwtredis.domain.AjaxResult;
import cn.freefly.springsecurityjwtredis.domain.entity.SysLogininfor;
import cn.freefly.springsecurityjwtredis.enums.BusinessType;
import cn.freefly.springsecurityjwtredis.service.ISysLogininforService;
import cn.freefly.springsecurityjwtredis.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 系统访问记录
 */
@RestController
@RequestMapping("/monitor/logininfor")
public class SysLogininforController extends BaseController{
    @Autowired
    private ISysLogininforService logininforService;

    @Log(title = "登录日志", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('monitor:logininfor:export')")
    @GetMapping("/export")
    public AjaxResult export(SysLogininfor logininfor)
    {
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        ExcelUtil<SysLogininfor> util = new ExcelUtil<SysLogininfor>(SysLogininfor.class);
        return util.exportExcel(list, "登录日志");
    }

    @PreAuthorize("@ss.hasPermi('monitor:logininfor:remove')")
    @Log(title = "登录日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/{infoIds}")
    public AjaxResult remove(@PathVariable Long[] infoIds)
    {
        return toAjax(logininforService.deleteLogininforByIds(infoIds));
    }

    @PreAuthorize("@ss.hasPermi('monitor:logininfor:remove')")
    @Log(title = "登录日志", businessType = BusinessType.CLEAN)
    @DeleteMapping("/clean")
    public AjaxResult clean()
    {
        logininforService.cleanLogininfor();
        return AjaxResult.success();
    }
}
