package com.sulin.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sulin.cloud.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Product)表数据库访问层
 *
 * @author slc
 * @since 2020-09-26 00:44:05
 */
@Mapper
public interface ProductDao extends BaseMapper<Product> {


}
