package com.missloverexception.project.demo.controller;

import com.alibaba.fastjson.JSON;
import com.missloverexception.project.demo.dao.DemoTestMapper;
import com.missloverexception.project.demo.model.DemoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @Auther: Chang.hy
 * @Description:
 * @Date: Create in 18:25 2018/7/31
 * @Modified By:
 */
@RequestMapping("test")
@Controller
public class TestController {

    @Autowired
    private DemoTestMapper demoTestMapper;

    @RequestMapping("startTest")
    @ResponseBody
    public String startTest() {
        return "Success!";
    }

    @ResponseBody
    @RequestMapping("testData")
    public String testData() {
        return JSON.toJSONString(demoTestMapper.selectByPrimaryKey(1));
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        ClassLoader c1 = DemoTest.class.getClassLoader();
        System.out.println(c1.getParent().toString());
        System.out.println(System.getProperty("sun.boot.class.path"));

    }


}
