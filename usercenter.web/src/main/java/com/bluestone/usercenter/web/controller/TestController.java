package com.bluestone.usercenter.web.controller;

import com.bluestone.usercenter.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bluestone.usercenter.web.bean.Response;

/**
 * Created by yumo on 16/7/29.
 */
@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private SayHelloService sayHelloService;

    @RequestMapping(value="hello", method = RequestMethod.GET)
    public @ResponseBody Response getShopInJSON() {


        return new Response(sayHelloService.sayHello());

    }
}
