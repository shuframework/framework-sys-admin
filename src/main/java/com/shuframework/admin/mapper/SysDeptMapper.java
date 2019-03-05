package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysDept;
import com.shuframework.admin.query.SysDeptDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 系统表_部门 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysDeptMapper extends BaseMapper<SysDept> {

    List<SysDept> selectPageList(Pagination page, SysDeptDTO sysDeptDTO);

}

