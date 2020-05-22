package com.bingo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:yaobin
 * @date:2020/5/14,10:20
 */

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/aa")
    @ResponseBody
    public String test(@RequestBody(required = false) String msg){

        System.out.println(msg);

        return msg;

    }
}
