package com.example.demo.config;

import com.example.demo.DemoApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author lw
 */
public class ServletInitializer extends SpringBootServletInitializer {

     @Override
     protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(DemoApplication.class);
     }
 }