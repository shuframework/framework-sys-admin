package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysDept;
import com.shuframework.admin.query.SysDeptDTO;
import com.shuframework.admin.mapper.SysDeptMapper;
import com.shuframework.admin.service.SysDeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 系统表_部门 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {

    @Override
    public Page<SysDept> selectPage(Page<SysDept> page, SysDeptDTO sysDeptDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysDeptDTO);
        page.setRecords(list);
        return page;
    }

}

