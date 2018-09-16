package com.missloverexception.project.demo.dao;

import com.missloverexception.project.demo.model.DemoTest;
import com.missloverexception.project.demo.model.DemoTestExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DemoTestMapper {
    int countByExample(DemoTestExample example);

    int deleteByExample(DemoTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DemoTest record);

    int insertSelective(DemoTest record);

    List<DemoTest> selectByExample(DemoTestExample example);

    DemoTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DemoTest record, @Param("example") DemoTestExample example);

    int updateByExample(@Param("record") DemoTest record, @Param("example") DemoTestExample example);

    int updateByPrimaryKeySelective(DemoTest record);

    int updateByPrimaryKey(DemoTest record);
}