package com.sulin.cloud.common.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author slc
 * @since 2020-09-26 00:49:32
 */
@Data
public class Product extends Model<Product> implements Serializable {
    private static final long serialVersionUID = 696223296906568099L;
    /**
     * 产品id
     */
    @TableId
    private String id;
    /**
     * 产品名
     */
    private String productName;
    /**
     * 产品种类
     */
    private String productType;
    /**
     * 单价
     */
    private Double price;
    /**
     * 生产地id
     */
    private String placeId;

    /**
     * 原料id
     */
    private String rawId;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
