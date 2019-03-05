package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysArea;
import com.shuframework.admin.query.SysAreaDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 行政区划 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysAreaMapper extends BaseMapper<SysArea> {

    List<SysArea> selectPageList(Pagination page, SysAreaDTO sysAreaDTO);

}

