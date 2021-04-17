package com.jiawa.wiki.controller;

import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qyyzxty@icloud.com
 * 2021/4/8
 **/
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(String name) {
        return new CommonResp(ebookService.list(name));
    }

}
