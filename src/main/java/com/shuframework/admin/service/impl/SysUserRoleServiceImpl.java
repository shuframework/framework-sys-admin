package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysUserRole;
import com.shuframework.admin.query.SysUserRoleDTO;
import com.shuframework.admin.mapper.SysUserRoleMapper;
import com.shuframework.admin.service.SysUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 用户_角色_中间表 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    @Override
    public Page<SysUserRole> selectPage(Page<SysUserRole> page, SysUserRoleDTO sysUserRoleDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysUserRoleDTO);
        page.setRecords(list);
        return page;
    }

}

