package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysArea;
import com.shuframework.admin.query.SysAreaDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 行政区划 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysAreaService extends IService<SysArea> {

    Page<SysArea> selectPage(Page<SysArea> page, SysAreaDTO sysAreaDTO);

}

