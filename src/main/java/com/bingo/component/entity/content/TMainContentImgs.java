package com.bingo.component.entity.content;

import java.io.Serializable;

/**
 * 博客文章图片表(TMainContentImgs)实体类
 *
 * @author makejava
 * @since 2020-04-26 00:14:38
 */
public class TMainContentImgs implements Serializable {
    private static final long serialVersionUID = -61827964210089709L;
    /**
    * 自增主键
    */
    private Integer id;
    /**
    * 关联主表t_main_content主键id
    */
    private Integer contentId;
    /**
    * 图片名称
    */
    private String imgName;
    /**
    * 图片链接
    */
    private String imgUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}