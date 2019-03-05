package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysDictionary;
import com.shuframework.admin.query.SysDictionaryDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 系统表_字典表 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysDictionaryMapper extends BaseMapper<SysDictionary> {

    List<SysDictionary> selectPageList(Pagination page, SysDictionaryDTO sysDictionaryDTO);

}

