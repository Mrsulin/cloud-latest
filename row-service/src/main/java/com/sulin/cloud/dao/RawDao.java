package com.sulin.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sulin.cloud.common.modules.raw.entity.Raw;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Raw)表数据库访问层
 *
 * @author slc
 * @since 2020-09-26 21:11:25
 */
@Mapper
public interface RawDao extends BaseMapper<Raw> {


}
