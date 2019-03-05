package com.shuframework.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysDept;
import com.shuframework.admin.query.SysDeptDTO;
import com.shuframework.admin.service.SysDeptService;
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
 * 系统表_部门 前端控制器
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@RestController
@RequestMapping("/admin/sysDept")
public class SysDeptController {

    @Autowired
    private SysDeptService sysDeptService;


    /**
     * 获取数据列表
     */
    @RequestMapping("/selectPage")
    public Result selectPage(@RequestBody SysDeptDTO sysDeptDTO){
        Page<SysDept> page = new Page(sysDeptDTO.getPageIndex, sysDeptDTO.getPageSize);
        page = sysUserService.selectPage(page, sysUserDTO);
        return ResultUtil.success(page);
    }

    /**
     * 根据ID查找数据
     */
    @RequestMapping("/detail")
    public Result detail(@RequestParam("id") Long id){
        SysDept sysDept = sysDeptService.selectById(id);
        if(sysDept == null){
            return ResultUtil.failure(FailureEnum.NOTEXIST_FAILURE);
        }
        return ResultUtil.success(sysDept);
    }

    /**
     * 添加数据
     */
    @PostMapping(value = "/insert")
    public Result insert(@RequestBody SysDept sysDept){
        boolean flag = sysDeptService.insert(sysDept);
        if(flag){
            return ResultUtil.successOfInsert(sysDept);
        }
        return ResultUtil.failureOfInsert(sysDept);
    }

    /**
     * 更新数据
     */
    @PostMapping(value = "/update")
    public Result update(@RequestBody SysDept sysDept){
        boolean isOk = sysDeptService.updateAllColumnById(sysDept);
        if(isOk){
            return ResultUtil.successOfUpdate(sysDept);
        }
        return ResultUtil.failureOfUpdate(sysDept);
    }

    /**
     * 删除数据
     */
    @RequestMapping("/delete")
    public Result delete(@RequestParam("ids") List<Long> ids){
        boolean isOk = sysDeptService.deleteBatchIds(ids);
        if(isOk){
            return ResultUtil.successOfDelete(ids);
        }
        return ResultUtil.failureOfDelete(ids);
    }

}
