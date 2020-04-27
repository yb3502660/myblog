package com.bingo.component.entity.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author:yaobin
 * @date:2020/4/22,15:33
 */

@Data
public class Test1 {

    @Value("${person.name}")
    private String name;

    private void sout(){
        System.out.println(name);

    }

    public static void main(String[] args) {
        new Test1().sout();
    }

}
