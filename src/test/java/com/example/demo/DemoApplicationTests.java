package com.example.demo;

import com.example.demo.entity.HttpResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    private static final Logger log = LoggerFactory.getLogger("LHT");
    @Test
    public void contextLoads() {
////
////        System.out.println("hello World");
////        log.error("this is logger ");
//
//    /*    List<String> datas=new ArrayList<>();
//        datas.add("a");
//        datas.add("2");*/
//
        HashMap<String,Object> map=new HashMap<>();
        map.put("name","sdfs");
        map.put("age",25);
        map.put("sex","man");

        HttpResult t = new HttpResult(111, "测试", map);
        System.out.println(t);


    }

}
