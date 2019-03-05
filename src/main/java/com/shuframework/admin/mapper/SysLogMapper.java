package com.shuframework.admin.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shuframework.admin.model.SysLog;
import com.shuframework.admin.query.SysLogDTO;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

/**
 * <p>
 * 系统表_操作日志表 Mapper 接口
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysLogMapper extends BaseMapper<SysLog> {

    List<SysLog> selectPageList(Pagination page, SysLogDTO sysLogDTO);

}

