package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysRoleMenu;
import com.shuframework.admin.query.SysRoleMenuDTO;
import com.shuframework.admin.mapper.SysRoleMenuMapper;
import com.shuframework.admin.service.SysRoleMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 角色_菜单_中间表 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

    @Override
    public Page<SysRoleMenu> selectPage(Page<SysRoleMenu> page, SysRoleMenuDTO sysRoleMenuDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysRoleMenuDTO);
        page.setRecords(list);
        return page;
    }

}

