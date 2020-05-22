package com.bingo.service;

import com.bingo.component.entity.content.TMainContentComments;
import java.util.List;

/**
 * 博客文章评论表(TMainContentComments)表服务接口
 *
 * @author makejava
 * @since 2020-04-26 14:40:31
 */
public interface TMainContentCommentsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMainContentComments queryById(Integer id)throws Exception;

    /**
     * 通过ID查询单条数据
     *
     * @param tMainContentComments 查询条件
     * @return 实例对象
     */
    TMainContentComments get(TMainContentComments tMainContentComments)throws Exception;


    /**
     * 查询多条数据
     *
     * @param start 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<TMainContentComments> selectAllByPage(int start, int pageSize,TMainContentComments tMainContentComments)throws Exception;

    /**
     * 新增数据
     *
     * @param tMainContentComments 实例对象
     * @return 实例对象
     */
    int insert(TMainContentComments tMainContentComments)throws Exception;

    /**
     * 修改数据
     *
     * @param tMainContentComments 实例对象
     * @return 实例对象
     */
    int update(TMainContentComments tMainContentComments)throws Exception;

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