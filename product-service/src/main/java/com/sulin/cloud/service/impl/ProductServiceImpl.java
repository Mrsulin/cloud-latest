package com.sulin.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sulin.cloud.service.ProductService;
import com.sulin.cloud.dao.ProductDao;
import com.sulin.cloud.entity.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Product)表服务实现类
 *
 * @author slc
 * @since 2020-09-26 00:44:06
 */
@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements ProductService {
    @Resource
    private ProductDao productDao;

}
