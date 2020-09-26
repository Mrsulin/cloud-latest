package com.sulin.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sulin.cloud.common.modules.product.entity.ProductPlace;
import org.apache.ibatis.annotations.Mapper;

/**
 * (ProductPlace)表数据库访问层
 *
 * @author slc
 * @since 2020-09-26 00:54:26
 */
@Mapper
public interface ProductPlaceDao extends BaseMapper<ProductPlace> {


}
