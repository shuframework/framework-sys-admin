package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysUser;
import com.shuframework.admin.query.SysUserDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统表_用户 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysUserService extends IService<SysUser> {

    Page<SysUser> selectPage(Page<SysUser> page, SysUserDTO sysUserDTO);

}

