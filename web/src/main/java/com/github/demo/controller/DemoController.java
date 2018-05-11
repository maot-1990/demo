package com.github.demo.controller;

import com.github.common.dto.RequestInfo;
import com.github.common.dto.ResponseInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public ResponseInfo test(RequestInfo requestInfo) {
        System.out.println("requestInfo=" + requestInfo.toString());
        ResponseInfo resInfo = new ResponseInfo();
        resInfo.setCode("success");
        resInfo.setMsg("成功");
        resInfo.setStatus("200");
        resInfo.setContext("无");
        return resInfo;
    }

    @RequestMapping(value = "/test2")
    @ResponseBody
    public ResponseInfo test2(@RequestBody RequestInfo requestInfo) {
        System.out.println("requestInfo=" + requestInfo.toString());
        ResponseInfo resInfo = new ResponseInfo();
        resInfo.setCode("success");
        resInfo.setMsg("成功");
        resInfo.setStatus("200");
        resInfo.setContext("无");
        return resInfo;
    }

    public DemoController(){
        System.out.println("初始化");
    }
}
