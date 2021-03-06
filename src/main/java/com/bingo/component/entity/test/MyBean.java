package com.bingo.component.entity.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author:yaobin
 * @date:2020/4/22,15:04
 */
@Data
public class MyBean {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    public void printPerson(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);


    }

}
