package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysMenu;
import com.shuframework.admin.query.SysMenuDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统表_菜单 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysMenuService extends IService<SysMenu> {

    Page<SysMenu> selectPage(Page<SysMenu> page, SysMenuDTO sysMenuDTO);

}

