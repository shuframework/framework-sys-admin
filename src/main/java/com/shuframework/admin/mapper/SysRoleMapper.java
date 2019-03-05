package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysRole;
import com.shuframework.admin.query.SysRoleDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 系统表_角色 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> selectPageList(Pagination page, SysRoleDTO sysRoleDTO);

}

