package com.missloverexception.project.toolsCollection.dao;

import com.missloverexception.project.toolsCollection.model.ToolNotebookInfo;
import com.missloverexception.project.toolsCollection.model.ToolNotebookInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ToolNotebookInfoMapper {
    int countByExample(ToolNotebookInfoExample example);

    int deleteByExample(ToolNotebookInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolNotebookInfo record);

    int insertSelective(ToolNotebookInfo record);

    List<ToolNotebookInfo> selectByExampleWithBLOBs(ToolNotebookInfoExample example);

    List<ToolNotebookInfo> selectByExample(ToolNotebookInfoExample example);

    ToolNotebookInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolNotebookInfo record, @Param("example") ToolNotebookInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ToolNotebookInfo record, @Param("example") ToolNotebookInfoExample example);

    int updateByExample(@Param("record") ToolNotebookInfo record, @Param("example") ToolNotebookInfoExample example);

    int updateByPrimaryKeySelective(ToolNotebookInfo record);

    int updateByPrimaryKeyWithBLOBs(ToolNotebookInfo record);

    int updateByPrimaryKey(ToolNotebookInfo record);
}