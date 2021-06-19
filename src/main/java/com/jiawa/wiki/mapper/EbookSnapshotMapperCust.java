package com.jiawa.wiki.mapper;

import com.jiawa.wiki.resp.StatisticResp;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EbookSnapshotMapperCust {

    void genSnapshot();

    List<StatisticResp> getStatistic();

    List<StatisticResp> get30Statistic();
}
