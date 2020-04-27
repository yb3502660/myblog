package com.bingo.mapper;

import com.bingo.component.entity.config.TConfigureInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 配置信息表(TConfigureInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-25 00:13:39
 */
public interface TConfigureInfoMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TConfigureInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TConfigureInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tConfigureInfo 实例对象
     * @return 对象列表
     */
    List<TConfigureInfo> queryAll(TConfigureInfo tConfigureInfo);

    /**
     * 新增数据
     *
     * @param tConfigureInfo 实例对象
     * @return 影响行数
     */
    int insert(TConfigureInfo tConfigureInfo);

    /**
     * 修改数据
     *
     * @param tConfigureInfo 实例对象
     * @return 影响行数
     */
    int update(TConfigureInfo tConfigureInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    /**
     * 批量删除
     *
     * @return 影响行数
     */
    int delBatch(List<Integer> list);
}