package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysRole;
import com.shuframework.admin.query.SysRoleDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统表_角色 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysRoleService extends IService<SysRole> {

    Page<SysRole> selectPage(Page<SysRole> page, SysRoleDTO sysRoleDTO);

}

