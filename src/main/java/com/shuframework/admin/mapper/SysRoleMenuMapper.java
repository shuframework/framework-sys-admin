package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysRoleMenu;
import com.shuframework.admin.query.SysRoleMenuDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 角色_菜单_中间表 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    List<SysRoleMenu> selectPageList(Pagination page, SysRoleMenuDTO sysRoleMenuDTO);

}

