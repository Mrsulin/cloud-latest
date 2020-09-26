package com.sulin.cloud.common.modules.raw.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Raw)实体类
 *
 * @author slc
 * @since 2020-09-26 21:11:24
 */
@Data
public class Raw extends Model<Raw> implements Serializable {
    private static final long serialVersionUID = 301916696789471487L;
    /**
     * 原料id
     */
    @TableId
    private String id;
    /**
     * 原料名
     */
    private String rawName;
    /**
     * 是否为安全原料
     */
    private Boolean isSafe;
    /**
     * 稀有程度 字典
     */
    private Integer rareLevel;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
