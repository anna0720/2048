package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello2048 {
    @ResponseBody
    @RequestMapping("/hello")
    public  String hello() {
        return  "这里是2048的测试页面...";
    }
}
