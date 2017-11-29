package com.example.demo.web;

import com.example.demo.service.CalculateService;
import com.example.demo.service.EdasCheckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 *
 * Created by lw on 2017/11/23.
 *
 */
@Controller
@RequestMapping("/demo")
public class HelloWorldControll {
    @Resource
    private CalculateService calculateSercice;
    @Resource
    private EdasCheckService edasCheckService;
    @RequestMapping("/test")
    public  String getWords(){
        return "hello world!!!";
    }

    @RequestMapping("/calc")
    @ResponseBody()
    public int calcValue(@RequestParam("a") int a,@RequestParam("b") int b){
        return edasCheckService.add(a,b);
    }





}
