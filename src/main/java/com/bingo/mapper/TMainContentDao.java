package com.bingo.mapper;


import com.bingo.component.entity.content.TMainContent;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.sql.SQLException;

/**
 * 博客文章表(TMainContent)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-09 14:13:36
 */
public interface TMainContentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMainContent queryById(Integer id)throws SQLException;


    /**
     * 通过ID查询单条数据
     *
     * @param tMainContent 查询条件
     * @return 实例对象
     */
    TMainContent get(TMainContent tMainContent)throws SQLException;

    /**
     * 查询指定行数据
     *
     * @param start 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    List<TMainContent> selectAllByPage(@Param("start") int start, @Param("pageSize") int pageSize,TMainContent tMainContent)throws SQLException;


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tMainContent 实例对象
     * @return 对象列表
     */
    List<TMainContent> selectAll(TMainContent tMainContent)throws SQLException;

    /**
     * 新增数据
     *
     * @param tMainContent 实例对象
     * @return 影响行数
     */
    int insert(TMainContent tMainContent)throws SQLException;

    /**
     * 修改数据
     *
     * @param tMainContent 实例对象
     * @return 影响行数
     */
    int update(TMainContent tMainContent)throws SQLException;

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

    int readCountAdd(Integer id) throws SQLException;
}