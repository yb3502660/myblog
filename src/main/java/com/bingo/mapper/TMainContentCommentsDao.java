package com.bingo.mapper;

import com.bingo.component.entity.content.TMainContentComments;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.sql.SQLException;

/**
 * 博客文章评论表(TMainContentComments)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-26 14:40:31
 */
public interface TMainContentCommentsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMainContentComments queryById(Integer id)throws SQLException;


    /**
     * 通过ID查询单条数据
     *
     * @param tMainContentComments 查询条件
     * @return 实例对象
     */
    TMainContentComments get(TMainContentComments tMainContentComments)throws SQLException;

    /**
     * 查询指定行数据
     *
     * @param start 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<TMainContentComments> selectAllByPage(@Param("start") int start, @Param("pageSize") int pageSize,TMainContentComments tMainContentComments)throws SQLException;


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tMainContentComments 实例对象
     * @return 对象列表
     */
    List<TMainContentComments> selectAll(TMainContentComments tMainContentComments)throws SQLException;

    /**
     * 新增数据
     *
     * @param tMainContentComments 实例对象
     * @return 影响行数
     */
    int insert(TMainContentComments tMainContentComments)throws SQLException;

    /**
     * 修改数据
     *
     * @param tMainContentComments 实例对象
     * @return 影响行数
     */
    int update(TMainContentComments tMainContentComments)throws SQLException;

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id)throws SQLException;


    /**
     * 批量删除
     * @param  list id列表
     * @return 影响行数
     */
    int delBatch(List<Integer> list)throws SQLException;
}