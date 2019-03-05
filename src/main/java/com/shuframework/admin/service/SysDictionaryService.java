package com.shuframework.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.shuframework.admin.model.SysDictionary;
import com.shuframework.admin.query.SysDictionaryDTO;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 系统表_字典表 服务类
 * </p>
 *
 * @author shuheng
 * @since 2019-03-05
 */
public interface SysDictionaryService extends IService<SysDictionary> {

    Page<SysDictionary> selectPage(Page<SysDictionary> page, SysDictionaryDTO sysDictionaryDTO);

}

