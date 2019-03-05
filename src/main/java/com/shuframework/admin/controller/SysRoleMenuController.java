package com.shuframework.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysRoleMenu;
import com.shuframework.admin.query.SysRoleMenuDTO;
import com.shuframework.admin.service.SysRoleMenuService;
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
 * 角色_菜单_中间表 前端控制器
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@RestController
@RequestMapping("/admin/sysRoleMenu")
public class SysRoleMenuController {

    @Autowired
    private SysRoleMenuService sysRoleMenuService;


    /**
     * 获取数据列表
     */
    @RequestMapping("/selectPage")
    public Result selectPage(@RequestBody SysRoleMenuDTO sysRoleMenuDTO){
        Page<SysRoleMenu> page = new Page(sysRoleMenuDTO.getPageIndex, sysRoleMenuDTO.getPageSize);
        page = sysUserService.selectPage(page, sysUserDTO);
        return ResultUtil.success(page);
    }

    /**
     * 根据ID查找数据
     */
    @RequestMapping("/detail")
    public Result detail(@RequestParam("id") Long id){
        SysRoleMenu sysRoleMenu = sysRoleMenuService.selectById(id);
        if(sysRoleMenu == null){
            return ResultUtil.failure(FailureEnum.NOTEXIST_FAILURE);
        }
        return ResultUtil.success(sysRoleMenu);
    }

    /**
     * 添加数据
     */
    @PostMapping(value = "/insert")
    public Result insert(@RequestBody SysRoleMenu sysRoleMenu){
        boolean flag = sysRoleMenuService.insert(sysRoleMenu);
        if(flag){
            return ResultUtil.successOfInsert(sysRoleMenu);
        }
        return ResultUtil.failureOfInsert(sysRoleMenu);
    }

    /**
     * 更新数据
     */
    @PostMapping(value = "/update")
    public Result update(@RequestBody SysRoleMenu sysRoleMenu){
        boolean isOk = sysRoleMenuService.updateAllColumnById(sysRoleMenu);
        if(isOk){
            return ResultUtil.successOfUpdate(sysRoleMenu);
        }
        return ResultUtil.failureOfUpdate(sysRoleMenu);
    }

    /**
     * 删除数据
     */
    @RequestMapping("/delete")
    public Result delete(@RequestParam("ids") List<Long> ids){
        boolean isOk = sysRoleMenuService.deleteBatchIds(ids);
        if(isOk){
            return ResultUtil.successOfDelete(ids);
        }
        return ResultUtil.failureOfDelete(ids);
    }

}
