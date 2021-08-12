package com.missloverexception.project.toolsCollection.controller;

import com.missloverexception.project.toolsCollection.model.ToolNotebookInfo;
import com.missloverexception.project.toolsCollection.service.ToolNoteBookService;
import com.missloverexception.project.utils.resultModel.CommonResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tool/notebook")
public class NotebookController {

    @Autowired
    private ToolNoteBookService noteBookService;

    private Logger logger = Logger.getLogger(NotebookController.class);

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public CommonResult save(@RequestBody ToolNotebookInfo notebookInfo) {
        return noteBookService.save(notebookInfo);
    }
}
