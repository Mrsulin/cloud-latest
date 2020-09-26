package com.sulin.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sulin.cloud.dao.RawDao;
import com.sulin.cloud.entity.Raw;
import com.sulin.cloud.service.RawService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Raw)表服务实现类
 *
 * @author slc
 * @since 2020-09-26 21:11:27
 */
@Service("rawService")
public class RawServiceImpl extends ServiceImpl<RawDao, Raw> implements RawService {
    @Resource
    private RawDao rawDao;

}
