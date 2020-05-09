package com.bingo;

import org.csource.common.MyException;
import org.csource.fastdfs.ProtoCommon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

/**
 * @author:yaobin
 * @date:2020/4/23,18:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ApplicationMain.class})
public class Tset11 {
//
//    @Value("${fastdfs.http_secret_key}")
//    String secret;

    @Value("${fastdfs.tracker_servers} ")
    String fileServerAddr;

    @Value("${fastdfs.http_secret_key}")
    private String fastDFSHttpSecretKey;


    @Test
    public void test11() throws UnsupportedEncodingException, NoSuchAlgorithmException, MyException {
        String path = "xxx";
        int ts =(int)Instant.now().getEpochSecond();
        String token = ProtoCommon.getToken(path, ts, "FASTDFS864665226");
        System.out.println(token);
    }

    @Test
    public void test2(){
//        System.out.println(secret);
    }


    @Test
    public void uploadTest(){

//        String a = "\\u9999\\u6e2f\\u4ed3\\u6d4b\\u8bd5\\u8d27\\u53f7";
//        System.out.println(a);
        String s = new String("\\u9999\\u6e2f\\u4ed3\\u6d4b\\u8bd5\\u8d27\\u53f7".getBytes(), StandardCharsets.UTF_8);
        System.out.println(s);


    }

}
