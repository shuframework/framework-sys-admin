package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysMenu;
import com.shuframework.admin.query.SysMenuDTO;
import com.shuframework.admin.mapper.SysMenuMapper;
import com.shuframework.admin.service.SysMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 系统表_菜单 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Override
    public Page<SysMenu> selectPage(Page<SysMenu> page, SysMenuDTO sysMenuDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysMenuDTO);
        page.setRecords(list);
        return page;
    }

}

