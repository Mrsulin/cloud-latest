package com.sulin.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (ProductPlace)实体类
 *
 * @author slc
 * @since 2020-09-26 00:54:23
 */
@Data
public class ProductPlace extends Model<ProductPlace> implements Serializable {
    private static final long serialVersionUID = 981418430646915727L;
    /**
     * 生产地id
     */
    @TableId
    private String id;
    /**
     * 生产地名
     */
    private String placeName;
    /**
     * 是否属于保密地
     */
    private Boolean isSecret;
    /**
     * 产值
     */
    private Integer proValue;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
