package com.jiawa.wiki.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;

/**
 * @author qyyzxty@icloud.com
 * @data 2021/6/19
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class DocMapperTest {

    @Resource
    private DocMapper docMapper;

    @Test
    public void insert() {
        docMapper.insert(null);
    }

}