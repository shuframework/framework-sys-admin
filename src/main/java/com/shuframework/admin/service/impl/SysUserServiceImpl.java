package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysUser;
import com.shuframework.admin.query.SysUserDTO;
import com.shuframework.admin.mapper.SysUserMapper;
import com.shuframework.admin.service.SysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 系统表_用户 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public Page<SysUser> selectPage(Page<SysUser> page, SysUserDTO sysUserDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysUserDTO);
        page.setRecords(list);
        return page;
    }

}

