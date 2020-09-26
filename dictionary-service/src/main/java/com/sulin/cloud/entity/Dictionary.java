package com.sulin.cloud.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Dictionary)实体类
 *
 * @author slc
 * @since 2020-09-26 22:41:41
 */
@Data
public class Dictionary extends Model<Dictionary> implements Serializable {
    private static final long serialVersionUID = 732432519727532348L;
    /**
     * 字典id
     */
    private String id;
    /**
     * 父id
     */
    private String parentId;
    /**
     * 字典名
     */
    private String dicCode;
    /**
     * 字典值
     */
    private Integer dicValue;
    /**
     * 字典项值
     */
    private String dicItemValue;
    /**
     * 字典项名
     */
    private String dicItemCode;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
