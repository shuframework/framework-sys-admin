package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysLog;
import com.shuframework.admin.query.SysLogDTO;
import com.shuframework.admin.mapper.SysLogMapper;
import com.shuframework.admin.service.SysLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 系统表_操作日志表 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    @Override
    public Page<SysLog> selectPage(Page<SysLog> page, SysLogDTO sysLogDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysLogDTO);
        page.setRecords(list);
        return page;
    }

}

