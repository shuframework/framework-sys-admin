package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysUserRole;
import com.shuframework.admin.query.SysUserRoleDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户_角色_中间表 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysUserRoleService extends IService<SysUserRole> {

    Page<SysUserRole> selectPage(Page<SysUserRole> page, SysUserRoleDTO sysUserRoleDTO);

}

