package com.bingo.service.impl;


import com.bingo.component.entity.content.TMainContent;
import com.bingo.mapper.TMainContentDao;
import com.bingo.service.TMainContentService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客文章表(TMainContent)表服务实现类
 *
 * @author makejava
 * @since 2020-05-09 14:13:37
 */
@Service
public class TMainContentServiceImpl implements TMainContentService {
    @Resource
    private TMainContentDao tMainContentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TMainContent queryById(Integer id) throws Exception{
        return this.tMainContentDao.queryById(id);
    }
    
      /**
     * 通过ID查询单条数据
     *
     * @param tMainContent 查询条件
     * @return 实例对象
     */
    @Override
    public TMainContent get(TMainContent tMainContent)throws Exception {
        return this.tMainContentDao.get(tMainContent);
    }
    
    

    /**
     * 查询多条数据
     *
     * @param start 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    @Override
    public List<TMainContent> selectAllByPage(int start, int pageSize,TMainContent tMainContent) throws Exception{
        PageHelper.startPage(start, pageSize);
        return this.tMainContentDao.selectAllByPage(start, pageSize,tMainContent);
    }

    /**
     * 新增数据
     *
     * @param tMainContent 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(TMainContent tMainContent)throws Exception {
        return this.tMainContentDao.insert(tMainContent);
    }

    /**
     * 修改数据
     *
     * @param tMainContent 实例对象
     * @return 实例对象
     */
    @Override
    public int update(TMainContent tMainContent)throws Exception {
        return this.tMainContentDao.update(tMainContent);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id)throws Exception {
        return this.tMainContentDao.deleteById(id);
    }
    
       /**
     * 批量删除
     * @param  list id列表
     * @return 影响行数
     */
   
    @Override
    public int delBatch(List<Integer> list) throws Exception{
        return this.tMainContentDao.delBatch(list);
    }
    
   
}