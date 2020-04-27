package com.bingo.service.impl;

import com.bingo.component.entity.content.TMainContentImgs;
import com.bingo.mapper.TMainContentImgsMapper;
import com.bingo.service.TMainContentImgsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客文章图片表(TMainContentImgs)表服务实现类
 *
 * @author makejava
 * @since 2020-04-26 00:14:40
 */
@Service
public class TMainContentImgsServiceImpl implements TMainContentImgsService {
    @Autowired
    private TMainContentImgsMapper tMainContentImgsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TMainContentImgs queryById(Integer id) {
        return this.tMainContentImgsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TMainContentImgs> queryAllByLimit(int offset, int limit) {
        return this.tMainContentImgsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tMainContentImgs 实例对象
     * @return 实例对象
     */
    @Override
    public TMainContentImgs insert(TMainContentImgs tMainContentImgs) {
        this.tMainContentImgsDao.insert(tMainContentImgs);
        return tMainContentImgs;
    }

    /**
     * 修改数据
     *
     * @param tMainContentImgs 实例对象
     * @return 实例对象
     */
    @Override
    public TMainContentImgs update(TMainContentImgs tMainContentImgs) {
        this.tMainContentImgsDao.update(tMainContentImgs);
        return this.queryById(tMainContentImgs.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tMainContentImgsDao.deleteById(id) > 0;
    }
    
       /**
     * 批量删除
     * @param  list id列表
     * @return 影响行数
     */
    @Override
    public int delBatch(List<Integer> list) {
        return this.tMainContentImgsDao.delBatch(list);
    }

}