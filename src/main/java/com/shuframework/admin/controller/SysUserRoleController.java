package com.shuframework.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysUserRole;
import com.shuframework.admin.query.SysUserRoleDTO;
import com.shuframework.admin.service.SysUserRoleService;
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
 * 用户_角色_中间表 前端控制器
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@RestController
@RequestMapping("/admin/sysUserRole")
public class SysUserRoleController {

    @Autowired
    private SysUserRoleService sysUserRoleService;


    /**
     * 获取数据列表
     */
    @RequestMapping("/selectPage")
    public Result selectPage(@RequestBody SysUserRoleDTO sysUserRoleDTO){
        Page<SysUserRole> page = new Page(sysUserRoleDTO.getPageIndex, sysUserRoleDTO.getPageSize);
        page = sysUserService.selectPage(page, sysUserDTO);
        return ResultUtil.success(page);
    }

    /**
     * 根据ID查找数据
     */
    @RequestMapping("/detail")
    public Result detail(@RequestParam("id") Long id){
        SysUserRole sysUserRole = sysUserRoleService.selectById(id);
        if(sysUserRole == null){
            return ResultUtil.failure(FailureEnum.NOTEXIST_FAILURE);
        }
        return ResultUtil.success(sysUserRole);
    }

    /**
     * 添加数据
     */
    @PostMapping(value = "/insert")
    public Result insert(@RequestBody SysUserRole sysUserRole){
        boolean flag = sysUserRoleService.insert(sysUserRole);
        if(flag){
            return ResultUtil.successOfInsert(sysUserRole);
        }
        return ResultUtil.failureOfInsert(sysUserRole);
    }

    /**
     * 更新数据
     */
    @PostMapping(value = "/update")
    public Result update(@RequestBody SysUserRole sysUserRole){
        boolean isOk = sysUserRoleService.updateAllColumnById(sysUserRole);
        if(isOk){
            return ResultUtil.successOfUpdate(sysUserRole);
        }
        return ResultUtil.failureOfUpdate(sysUserRole);
    }

    /**
     * 删除数据
     */
    @RequestMapping("/delete")
    public Result delete(@RequestParam("ids") List<Long> ids){
        boolean isOk = sysUserRoleService.deleteBatchIds(ids);
        if(isOk){
            return ResultUtil.successOfDelete(ids);
        }
        return ResultUtil.failureOfDelete(ids);
    }

}
