package com.bingo.controller;

import com.bingo.component.entity.content.TMainContentImgs;
import com.bingo.service.TMainContentImgsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 博客文章图片表(TMainContentImgs)表控制层
 *
 * @author makejava
 * @since 2020-04-26 00:14:40
 */
@RestController
@RequestMapping("tMainContentImgs")
public class TMainContentImgsController {
    /**
     * 服务对象
     */
    @Resource
    private TMainContentImgsService tMainContentImgsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TMainContentImgs selectOne(Integer id) {
        return this.tMainContentImgsService.queryById(id);
    }


    @PostMapping("save")
    public String save(TMainContentImgs tMainContentImgs) {


        TMainContentImgs insert = tMainContentImgsService.insert(tMainContentImgs);




        return "xx";
    }


}