package com.missloverexception.project.toolsCollection.service;

import com.missloverexception.project.toolsCollection.model.ToolNotebookInfo;
import com.missloverexception.project.utils.resultModel.CommonResult;

public interface ToolNoteBookService {

    CommonResult save(ToolNotebookInfo notebookInfo);
}
