package com.bingo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bingo.component.entity.content.TMainContent;
import com.bingo.service.TMainContentService;
import com.bingo.utils.DateUtil;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.sound.sampled.Line;
import java.util.List;

/**
 * 博客文章表(TMainContent)表控制层
 *
 * @author makejava
 * @since 2020-05-09 14:13:38
 */
@RestController
@RequestMapping("tMainContent")
public class TMainContentController {
    /**
     * 服务对象
     */
    @Resource
    private TMainContentService tMainContentService;

    final private static Logger logger = LoggerFactory.getLogger(TMainContentController.class);

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/content/{id}")
    public TMainContent selectOne(@PathVariable Integer id)throws Exception {
        System.out.println("id:"+id);
        return this.tMainContentService.queryById(id);
    }

    @PostMapping("/save")
    public String Save(@RequestBody(required = false)String msg) throws Exception{
        logger.info("文章保存:{}",msg);
        JSONObject object = JSON.parseObject(msg);
        TMainContent tMainContent = new TMainContent();
        int num;
        this.packSaveData(object,tMainContent);

        if(object.getInteger("id")==null){
            num = tMainContentService.insert(tMainContent);
        }else {
            tMainContent.setId(object.getInteger("id"));
            num = tMainContentService.update(tMainContent);
        }

        if(num==0){
            return "failure";
        }

        return "success";
    }

    private void packSaveData(JSONObject object, TMainContent tMainContent) {

        tMainContent.setMainTitle(object.getString("mainTitle"));
        tMainContent.setSubTitle(object.getString("subTitle"));
        tMainContent.setContent(object.getString("content"));
        tMainContent.setCreateTime(DateUtil.formartCurrentDateTime());
//        tMainContent.setCreateUserId(object.getString("mainTitle"));
        tMainContent.setModifyTime(DateUtil.formartCurrentDateTime());
        tMainContent.setMainImg(object.getString("mainImg"));
        tMainContent.setReadCount(0);
        tMainContent.setSubscribeCount(0);
        tMainContent.setShareCount(0);
        tMainContent.setBackImg(object.getString("subImg"));
        tMainContent.setDelete(0);
    }


    @PutMapping("/content/{id}")
    public void readAdd(@PathVariable Integer id){
        TMainContent tMainContent = new TMainContent();
        tMainContent.setId(id);
    }



    @GetMapping("/content/list/{page}/{size}")
    public PageInfo<TMainContent> getList(@PathVariable Integer page,@PathVariable Integer size,TMainContent tMainContent){

        try {
            List<TMainContent> tMainContents = tMainContentService.selectAllByPage(page, size, tMainContent);

            PageInfo<TMainContent> info = new PageInfo<>(tMainContents);

            return info;
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("发生异常:"+e.getMessage());
        }

        return null;
    }

}