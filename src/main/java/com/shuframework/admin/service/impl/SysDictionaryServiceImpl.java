package com.shuframework.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysDictionary;
import com.shuframework.admin.query.SysDictionaryDTO;
import com.shuframework.admin.mapper.SysDictionaryMapper;
import com.shuframework.admin.service.SysDictionaryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 * 系统表_字典表 服务实现类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
@Service
public class SysDictionaryServiceImpl extends ServiceImpl<SysDictionaryMapper, SysDictionary> implements SysDictionaryService {

    @Override
    public Page<SysDictionary> selectPage(Page<SysDictionary> page, SysDictionaryDTO sysDictionaryDTO) {
        List<SysUser> list = baseMapper.selectPageList(page, sysDictionaryDTO);
        page.setRecords(list);
        return page;
    }

}

