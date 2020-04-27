package com.bingo.mapper;

import com.bingo.component.entity.content.TMainContentImgs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 博客文章图片表(TMainContentImgs)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-26 00:14:40
 */
public interface TMainContentImgsMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMainContentImgs queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TMainContentImgs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tMainContentImgs 实例对象
     * @return 对象列表
     */
    List<TMainContentImgs> queryAll(TMainContentImgs tMainContentImgs);

    /**
     * 新增数据
     *
     * @param tMainContentImgs 实例对象
     * @return 影响行数
     */
    int insert(TMainContentImgs tMainContentImgs);

    /**
     * 修改数据
     *
     * @param tMainContentImgs 实例对象
     * @return 影响行数
     */
    int update(TMainContentImgs tMainContentImgs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    /**
     * 批量删除
     * @param  list id列表
     * @return 影响行数
     */
    int delBatch(List<Integer> list);
}