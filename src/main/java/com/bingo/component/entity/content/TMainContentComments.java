package com.bingo.component.entity.content;

import java.io.Serializable;

/**
 * 博客文章评论表(TMainContentComments)实体类
 *
 * @author makejava
 * @since 2020-04-26 14:40:31
 */
public class TMainContentComments implements Serializable {
    private static final long serialVersionUID = 985419468366898923L;
    /**
    * 自增主键
    */
    private Integer id;
    /**
    * 回复内容
    */
    private String comment;
    /**
    * 文章主键id
    */
    private Integer contentId;
    /**
    * 回复人id
    */
    private Integer reviewUserId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

}