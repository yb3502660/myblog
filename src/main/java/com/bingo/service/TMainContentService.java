package com.bingo.service;


import com.bingo.component.entity.content.TMainContent;

import java.util.List;

/**
 * 博客文章表(TMainContent)表服务接口
 *
 * @author makejava
 * @since 2020-05-09 14:13:37
 */
public interface TMainContentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMainContent queryById(Integer id)throws Exception;

    /**
     * 通过ID查询单条数据
     *
     * @param tMainContent 查询条件
     * @return 实例对象
     */
    TMainContent get(TMainContent tMainContent)throws Exception;


    /**
     * 查询多条数据
     *
     * @param start 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<TMainContent> selectAllByPage(int start, int pageSize,TMainContent tMainContent)throws Exception;

    /**
     * 新增数据
     *
     * @param tMainContent 实例对象
     * @return 实例对象
     */
    int insert(TMainContent tMainContent)throws Exception;

    /**
     * 修改数据
     *
     * @param tMainContent 实例对象
     * @return 实例对象
     */
    int update(TMainContent tMainContent)throws Exception;

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id)throws Exception;
    
    
    
    
    /**
     * 批量删除
     * @param  list id列表
     * @return 影响行数
     */
    int delBatch(List<Integer> list)throws Exception;

}