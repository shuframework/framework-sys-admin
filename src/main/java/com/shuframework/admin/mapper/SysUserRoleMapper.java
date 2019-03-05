package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysUserRole;
import com.shuframework.admin.query.SysUserRoleDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 用户_角色_中间表 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    List<SysUserRole> selectPageList(Pagination page, SysUserRoleDTO sysUserRoleDTO);

}

