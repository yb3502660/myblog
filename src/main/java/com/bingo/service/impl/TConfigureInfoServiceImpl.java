package com.bingo.service.impl;

import com.bingo.component.entity.config.TConfigureInfo;
import com.bingo.mapper.TConfigureInfoMapper;
import com.bingo.service.TConfigureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 配置信息表(TConfigureInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-25 00:13:41
 */
@Service
public class TConfigureInfoServiceImpl implements TConfigureInfoService {

    @Autowired
    private TConfigureInfoMapper tConfigureInfoMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TConfigureInfo queryById(Integer id) {
        return this.tConfigureInfoMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TConfigureInfo> queryAllByLimit(int offset, int limit) {
        return this.tConfigureInfoMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tConfigureInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TConfigureInfo insert(TConfigureInfo tConfigureInfo) {
        this.tConfigureInfoMapper.insert(tConfigureInfo);
        return tConfigureInfo;
    }

    /**
     * 修改数据
     *
     * @param tConfigureInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TConfigureInfo update(TConfigureInfo tConfigureInfo) {
        this.tConfigureInfoMapper.update(tConfigureInfo);
        return this.queryById(tConfigureInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tConfigureInfoMapper.deleteById(id) > 0;
    }
}