package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysRoleMenu;
import com.shuframework.admin.query.SysRoleMenuDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 角色_菜单_中间表 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    Page<SysRoleMenu> selectPage(Page<SysRoleMenu> page, SysRoleMenuDTO sysRoleMenuDTO);

}

