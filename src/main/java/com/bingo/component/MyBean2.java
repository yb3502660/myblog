package com.bingo.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author:yaobin
 * @date:2020/4/22,15:30
 */

//@Component
public class MyBean2 {

//    @Bean
   private MyBean myBean(){
        return new MyBean();
    }
}
