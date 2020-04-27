package com.bingo.service;


import com.bingo.component.entity.config.TConfigureInfo;

import java.util.List;

/**
 * 配置信息表(TConfigureInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-25 00:13:40
 */
public interface TConfigureInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TConfigureInfo queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TConfigureInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tConfigureInfo 实例对象
     * @return 实例对象
     */
    TConfigureInfo insert(TConfigureInfo tConfigureInfo);

    /**
     * 修改数据
     *
     * @param tConfigureInfo 实例对象
     * @return 实例对象
     */
    TConfigureInfo update(TConfigureInfo tConfigureInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}