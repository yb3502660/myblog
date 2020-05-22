package com.bingo.service.impl;

import com.bingo.component.entity.content.TMainContentComments;
import com.bingo.mapper.TMainContentCommentsDao;
import com.bingo.service.TMainContentCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客文章评论表(TMainContentComments)表服务实现类
 *
 * @author makejava
 * @since 2020-04-26 14:43:57
 */
@Service
public class TMainContentCommentsServiceImpl implements TMainContentCommentsService {
    @Autowired
    private TMainContentCommentsDao tMainContentCommentsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TMainContentComments queryById(Integer id) throws Exception{
        return this.tMainContentCommentsDao.queryById(id);
    }
    
      /**
     * 通过ID查询单条数据
     *
     * @param tMainContentComments 查询条件
     * @return 实例对象
     */
    @Override
    public TMainContentComments get(TMainContentComments tMainContentComments)throws Exception {
        return this.tMainContentCommentsDao.get(tMainContentComments);
    }
    
    

    /**
     * 查询多条数据
     *
     * @param start 查询起始位置
     * @param pageSize 查询条数
     * @return 对象列表
     */
    @Override
    public List<TMainContentComments> selectAllByPage(int start, int pageSize,TMainContentComments tMainContentComments) throws Exception{
        return this.tMainContentCommentsDao.selectAllByPage(start, pageSize,tMainContentComments);
    }

    /**
     * 新增数据
     *
     * @param tMainContentComments 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(TMainContentComments tMainContentComments)throws Exception {
        return this.tMainContentCommentsDao.insert(tMainContentComments);
    }

    /**
     * 修改数据
     *
     * @param tMainContentComments 实例对象
     * @return 实例对象
     */
    @Override
    public int update(TMainContentComments tMainContentComments)throws Exception {
        return this.tMainContentCommentsDao.update(tMainContentComments);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id)throws Exception {
        return this.tMainContentCommentsDao.deleteById(id);
    }
    
       /**
     * 批量删除
     * @param  list id列表
     * @return 影响行数
     */
   
    @Override
    public int delBatch(List<Integer> list) throws Exception{
        return this.tMainContentCommentsDao.delBatch(list);
    }
    
   
}