package com.bingo.controller;

import com.bingo.component.entity.config.TConfigureInfo;
import com.bingo.service.TConfigureInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 配置信息表(TConfigureInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-25 00:13:41
 */
@RestController
@RequestMapping("tConfigureInfo")
public class TConfigureInfoController {
    /**
     * 服务对象
     */
    @Resource
    private TConfigureInfoService tConfigureInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TConfigureInfo selectOne(Integer id) {

        return this.tConfigureInfoService.queryById(id);
    }




}