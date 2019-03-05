package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysLog;
import com.shuframework.admin.query.SysLogDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统表_操作日志表 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysLogService extends IService<SysLog> {

    Page<SysLog> selectPage(Page<SysLog> page, SysLogDTO sysLogDTO);

}

