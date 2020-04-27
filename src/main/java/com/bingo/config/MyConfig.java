package com.bingo.config;

import com.bingo.component.entity.test.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:yaobin
 * @date:2020/4/22,15:45
 */

@Configuration
public class MyConfig {
    @Bean
    MyBean myBean(){
        MyBean myBean = new MyBean();
        myBean.setAge(2);
        myBean.setName("x");
        return myBean;
    }

}
