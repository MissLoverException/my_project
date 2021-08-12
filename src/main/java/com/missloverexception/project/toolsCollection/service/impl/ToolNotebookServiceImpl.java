package com.missloverexception.project.toolsCollection.service.impl;

import com.missloverexception.project.toolsCollection.dao.ToolNotebookInfoMapper;
import com.missloverexception.project.toolsCollection.model.ToolNotebookInfo;
import com.missloverexception.project.toolsCollection.service.ToolNoteBookService;
import com.missloverexception.project.utils.resultModel.CommonResult;
import com.missloverexception.project.utils.resultModel.CommonResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.Date;

@Service
public class ToolNotebookServiceImpl implements ToolNoteBookService {

    @Autowired
    private ToolNotebookInfoMapper notebookInfoMapper;

    @Override
    public CommonResult save(ToolNotebookInfo notebookInfo) {
        if (null == notebookInfo.getCreateTime()) {
            notebookInfo.setCreateTime(new Date());
        }
        if (null == notebookInfo.getCreateBy()) {
            notebookInfo.setCreateBy("1");
        }
        notebookInfo.setEditStatus("1");
        notebookInfo.setDeleteFlag("0");
        return 0 < notebookInfoMapper.insertSelective(notebookInfo) ?
                CommonResult.getMsgEnumInstance(CommonResultEnum.RESULT_SUCCESS) :
                CommonResult.getMsgEnumInstance(CommonResultEnum.RESULT_FAIL);
    }
}
