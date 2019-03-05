package com.shuframework.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysLog;
import com.shuframework.admin.query.SysLogDTO;
import com.shuframework.admin.service.SysLogService;
import com.shuframework.commonbase.enums.FailureEnum;
import com.shuframework.commonbase.result.Result;
import com.shuframework.commonbase.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p>
 * 系统表_操作日志表 前端控制器
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@RestController
@RequestMapping("/admin/sysLog")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;


    /**
     * 获取数据列表
     */
    @RequestMapping("/selectPage")
    public Result selectPage(@RequestBody SysLogDTO sysLogDTO){
        Page<SysLog> page = new Page(sysLogDTO.getPageIndex, sysLogDTO.getPageSize);
        page = sysUserService.selectPage(page, sysUserDTO);
        return ResultUtil.success(page);
    }

    /**
     * 根据ID查找数据
     */
    @RequestMapping("/detail")
    public Result detail(@RequestParam("id") Long id){
        SysLog sysLog = sysLogService.selectById(id);
        if(sysLog == null){
            return ResultUtil.failure(FailureEnum.NOTEXIST_FAILURE);
        }
        return ResultUtil.success(sysLog);
    }

    /**
     * 添加数据
     */
    @PostMapping(value = "/insert")
    public Result insert(@RequestBody SysLog sysLog){
        boolean flag = sysLogService.insert(sysLog);
        if(flag){
            return ResultUtil.successOfInsert(sysLog);
        }
        return ResultUtil.failureOfInsert(sysLog);
    }

    /**
     * 更新数据
     */
    @PostMapping(value = "/update")
    public Result update(@RequestBody SysLog sysLog){
        boolean isOk = sysLogService.updateAllColumnById(sysLog);
        if(isOk){
            return ResultUtil.successOfUpdate(sysLog);
        }
        return ResultUtil.failureOfUpdate(sysLog);
    }

    /**
     * 删除数据
     */
    @RequestMapping("/delete")
    public Result delete(@RequestParam("ids") List<Long> ids){
        boolean isOk = sysLogService.deleteBatchIds(ids);
        if(isOk){
            return ResultUtil.successOfDelete(ids);
        }
        return ResultUtil.failureOfDelete(ids);
    }

}
