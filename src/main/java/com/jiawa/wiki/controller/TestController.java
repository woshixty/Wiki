package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qyyzxty@icloud.com
 * 2021/4/5
 **/
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @PostMapping("/postTest")
    public String post(String name) {
        return "POST:" + name;
    }

}
