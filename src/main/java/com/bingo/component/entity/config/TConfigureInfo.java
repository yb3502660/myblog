package com.bingo.component.entity.config;

import java.io.Serializable;

/**
 * 配置信息表(TConfigureInfo)实体类
 *
 * @author makejava
 * @since 2020-04-25 00:13:33
 */

public class TConfigureInfo implements Serializable {
    private static final long serialVersionUID = -67111116237853553L;
    /**
    * 自增主键
    */
    private Integer id;
    /**
    * 配置信息键
    */
    private String key;
    /**
    * 配置信息值
    */
    private String value;
    /**
    * 描述
    */
    private String desc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}