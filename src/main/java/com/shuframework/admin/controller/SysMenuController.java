package com.shuframework.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysMenu;
import com.shuframework.admin.query.SysMenuDTO;
import com.shuframework.admin.service.SysMenuService;
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
 * 系统表_菜单 前端控制器
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@RestController
@RequestMapping("/admin/sysMenu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;


    /**
     * 获取数据列表
     */
    @RequestMapping("/selectPage")
    public Result selectPage(@RequestBody SysMenuDTO sysMenuDTO){
        Page<SysMenu> page = new Page(sysMenuDTO.getPageIndex, sysMenuDTO.getPageSize);
        page = sysUserService.selectPage(page, sysUserDTO);
        return ResultUtil.success(page);
    }

    /**
     * 根据ID查找数据
     */
    @RequestMapping("/detail")
    public Result detail(@RequestParam("id") Long id){
        SysMenu sysMenu = sysMenuService.selectById(id);
        if(sysMenu == null){
            return ResultUtil.failure(FailureEnum.NOTEXIST_FAILURE);
        }
        return ResultUtil.success(sysMenu);
    }

    /**
     * 添加数据
     */
    @PostMapping(value = "/insert")
    public Result insert(@RequestBody SysMenu sysMenu){
        boolean flag = sysMenuService.insert(sysMenu);
        if(flag){
            return ResultUtil.successOfInsert(sysMenu);
        }
        return ResultUtil.failureOfInsert(sysMenu);
    }

    /**
     * 更新数据
     */
    @PostMapping(value = "/update")
    public Result update(@RequestBody SysMenu sysMenu){
        boolean isOk = sysMenuService.updateAllColumnById(sysMenu);
        if(isOk){
            return ResultUtil.successOfUpdate(sysMenu);
        }
        return ResultUtil.failureOfUpdate(sysMenu);
    }

    /**
     * 删除数据
     */
    @RequestMapping("/delete")
    public Result delete(@RequestParam("ids") List<Long> ids){
        boolean isOk = sysMenuService.deleteBatchIds(ids);
        if(isOk){
            return ResultUtil.successOfDelete(ids);
        }
        return ResultUtil.failureOfDelete(ids);
    }

}
