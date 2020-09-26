package com.sulin.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sulin.cloud.dao.DictionaryDao;
import com.sulin.cloud.entity.Dictionary;
import com.sulin.cloud.service.DictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Dictionary)表服务实现类
 *
 * @author slc
 * @since 2020-09-26 22:41:41
 */
@Service("dictionaryService")
public class DictionaryServiceImpl extends ServiceImpl<DictionaryDao, Dictionary> implements DictionaryService {
    @Resource
    private DictionaryDao dictionaryDao;

}
