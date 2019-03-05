package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysUser;
import com.shuframework.admin.query.SysUserDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 系统表_用户 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectPageList(Pagination page, SysUserDTO sysUserDTO);

}

