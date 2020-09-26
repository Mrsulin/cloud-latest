package com.sulin.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sulin.cloud.service.ProductPlaceService;
import com.sulin.cloud.dao.ProductPlaceDao;
import com.sulin.cloud.entity.ProductPlace;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (ProductPlace)表服务实现类
 *
 * @author slc
 * @since 2020-09-26 00:54:33
 */
@Service("productPlaceService")
public class ProductPlaceServiceImpl extends ServiceImpl<ProductPlaceDao, ProductPlace> implements ProductPlaceService {
    @Resource
    private ProductPlaceDao productPlaceDao;

}
