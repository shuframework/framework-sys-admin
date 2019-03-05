package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysDept;
import com.shuframework.admin.query.SysDeptDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统表_部门 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysDeptService extends IService<SysDept> {

    Page<SysDept> selectPage(Page<SysDept> page, SysDeptDTO sysDeptDTO);

}

