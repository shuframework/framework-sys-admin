package com.shuframework.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysDictionary;
import com.shuframework.admin.query.SysDictionaryDTO;
import com.shuframework.admin.service.SysDictionaryService;
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
 * 系统表_字典表 前端控制器
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@RestController
@RequestMapping("/admin/sysDictionary")
public class SysDictionaryController {

    @Autowired
    private SysDictionaryService sysDictionaryService;


    /**
     * 获取数据列表
     */
    @RequestMapping("/selectPage")
    public Result selectPage(@RequestBody SysDictionaryDTO sysDictionaryDTO){
        Page<SysDictionary> page = new Page(sysDictionaryDTO.getPageIndex, sysDictionaryDTO.getPageSize);
        page = sysUserService.selectPage(page, sysUserDTO);
        return ResultUtil.success(page);
    }

    /**
     * 根据ID查找数据
     */
    @RequestMapping("/detail")
    public Result detail(@RequestParam("id") Long id){
        SysDictionary sysDictionary = sysDictionaryService.selectById(id);
        if(sysDictionary == null){
            return ResultUtil.failure(FailureEnum.NOTEXIST_FAILURE);
        }
        return ResultUtil.success(sysDictionary);
    }

    /**
     * 添加数据
     */
    @PostMapping(value = "/insert")
    public Result insert(@RequestBody SysDictionary sysDictionary){
        boolean flag = sysDictionaryService.insert(sysDictionary);
        if(flag){
            return ResultUtil.successOfInsert(sysDictionary);
        }
        return ResultUtil.failureOfInsert(sysDictionary);
    }

    /**
     * 更新数据
     */
    @PostMapping(value = "/update")
    public Result update(@RequestBody SysDictionary sysDictionary){
        boolean isOk = sysDictionaryService.updateAllColumnById(sysDictionary);
        if(isOk){
            return ResultUtil.successOfUpdate(sysDictionary);
        }
        return ResultUtil.failureOfUpdate(sysDictionary);
    }

    /**
     * 删除数据
     */
    @RequestMapping("/delete")
    public Result delete(@RequestParam("ids") List<Long> ids){
        boolean isOk = sysDictionaryService.deleteBatchIds(ids);
        if(isOk){
            return ResultUtil.successOfDelete(ids);
        }
        return ResultUtil.failureOfDelete(ids);
    }

}
