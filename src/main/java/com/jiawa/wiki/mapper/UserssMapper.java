package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.Userss;
import com.jiawa.wiki.domain.UserssExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserssMapper {
    long countByExample(UserssExample example);

    int deleteByExample(UserssExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userss record);

    int insertSelective(Userss record);

    List<Userss> selectByExample(UserssExample example);

    Userss selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userss record, @Param("example") UserssExample example);

    int updateByExample(@Param("record") Userss record, @Param("example") UserssExample example);

    int updateByPrimaryKeySelective(Userss record);

    int updateByPrimaryKey(Userss record);
}