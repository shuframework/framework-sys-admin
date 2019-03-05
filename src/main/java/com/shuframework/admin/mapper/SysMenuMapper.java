package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysMenu;
import com.shuframework.admin.query.SysMenuDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 系统表_菜单 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> selectPageList(Pagination page, SysMenuDTO sysMenuDTO);

}

