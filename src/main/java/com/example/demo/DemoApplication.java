package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lw
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:edas-hsf-config.xml"})
@ComponentScan(basePackages = {"com.example.demo"})
public class DemoApplication  {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
