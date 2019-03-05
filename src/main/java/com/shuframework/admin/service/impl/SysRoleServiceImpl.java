package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysRole;
import com.shuframework.admin.query.SysRoleDTO;
import com.shuframework.admin.mapper.SysRoleMapper;
import com.shuframework.admin.service.SysRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 系统表_角色 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public Page<SysRole> selectPage(Page<SysRole> page, SysRoleDTO sysRoleDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysRoleDTO);
        page.setRecords(list);
        return page;
    }

}

