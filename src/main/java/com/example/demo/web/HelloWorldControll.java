package com.example.demo.web;

import com.example.demo.service.CalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/test")
    public  String getWords(){
        return "hello world!!!";
    }

    @RequestMapping("/calc")

    public int calcValue(@RequestParam("a") int a,@RequestParam("b") int b){
        return calculateSercice.calcValue(a,b);
    }
}
