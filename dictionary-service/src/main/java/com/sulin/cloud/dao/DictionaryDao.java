package com.sulin.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sulin.cloud.entity.Dictionary;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Dictionary)表数据库访问层
 *
 * @author slc
 * @since 2020-09-26 22:41:41
 */
@Mapper
public interface DictionaryDao extends BaseMapper<Dictionary> {


}
