package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysArea;
import com.shuframework.admin.query.SysAreaDTO;
import com.shuframework.admin.mapper.SysAreaMapper;
import com.shuframework.admin.service.SysAreaService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 行政区划 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysAreaServiceImpl extends ServiceImpl<SysAreaMapper, SysArea> implements SysAreaService {

    @Override
    public Page<SysArea> selectPage(Page<SysArea> page, SysAreaDTO sysAreaDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysAreaDTO);
        page.setRecords(list);
        return page;
    }

}

