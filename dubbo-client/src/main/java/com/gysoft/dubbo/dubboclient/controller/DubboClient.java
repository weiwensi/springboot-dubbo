package com.gysoft.dubbo.dubboclient.controller;

import com.gysoft.dubbo.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/1/11 18:17
 */

@Controller
public class DubboClient {

    @Autowired
    DubboService dubboService;

    @RequestMapping("testDubbo")
    @ResponseBody
    public  String   testDubbo(){

        String s = dubboService.testDubbo();

        return s;
    }
}
