package com.jiawa.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qyyzxty@icloud.com
 * 2021/4/8
 **/
@Service
@Slf4j
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(String name) {
        //对遇到的第一个SQL起作用
        PageHelper.startPage(1, 3);
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (name != null) {
            criteria.andNameLike("%" + name + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        log.info("{}", pageInfo.getTotal());
        log.info("{}", pageInfo.getPages());
        return ebookList;
    }

}