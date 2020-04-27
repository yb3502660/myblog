package com.bingo.service;


import com.bingo.component.entity.content.TMainContentImgs;

import java.util.List;

/**
 * 博客文章图片表(TMainContentImgs)表服务接口
 *
 * @author makejava
 * @since 2020-04-26 00:14:40
 */
public interface TMainContentImgsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMainContentImgs queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TMainContentImgs> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tMainContentImgs 实例对象
     * @return 实例对象
     */
    TMainContentImgs insert(TMainContentImgs tMainContentImgs);

    /**
     * 修改数据
     *
     * @param tMainContentImgs 实例对象
     * @return 实例对象
     */
    TMainContentImgs update(TMainContentImgs tMainContentImgs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    
    
    
    
    /**
     * 批量删除
     * @param  list id列表
     * @return 影响行数
     */
    int delBatch(List<Integer> list);

}