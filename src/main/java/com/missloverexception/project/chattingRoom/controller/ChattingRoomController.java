package com.missloverexception.project.chattingRoom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Chang.hy
 * @Description:
 * @Date: Create in 16:17 2018/8/3
 * @Modified By:
 */
@Controller
@RequestMapping("chattingRoom")
public class ChattingRoomController {
    Logger logger = LoggerFactory.getLogger(ChattingRoomController.class);

    @RequestMapping(value = "index")
    public String index() {
        logger.info("123 one two three 一二三");
        return "chattingRoom/index";
    }
}
