package com.bingo.component.entity.content;

import java.util.Date;
import java.io.Serializable;

/**
 * 博客文章表(TMainContent)实体类
 *
 * @author makejava
 * @since 2020-05-09 14:28:16
 */
public class TMainContent implements Serializable {
    private static final long serialVersionUID = -45393156958862742L;
    /**
    * 主键自增
    */
    private Integer id;
    /**
    * 文章主标题
    */
    private String mainTitle;
    /**
    * 文章副标题
    */
    private String subTitle;
    /**
    * 文章内容
    */
    private String content;
    /**
    * 创建时间
    */
    private String createTime;
    /**
    * 创建人
    */
    private Integer createUserId;
    /**
    * 修改时间
    */
    private String modifyTime;
    /**
    * 页面主图
    */
    private String mainImg;
    /**
    * 阅读数
    */
    private Integer readCount;
    /**
    * 点赞数
    */
    private Integer subscribeCount;
    /**
    * 分享数
    */
    private Integer shareCount;
    /**
    * 背景图
    */
    private String backImg;
    /**
    * 是否删除,0:未删除;1:已删除
    */
    private Integer delete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCreateTime() {
        return createTime;
    }

    public TMainContent setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public TMainContent setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getSubscribeCount() {
        return subscribeCount;
    }

    public void setSubscribeCount(Integer subscribeCount) {
        this.subscribeCount = subscribeCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

}