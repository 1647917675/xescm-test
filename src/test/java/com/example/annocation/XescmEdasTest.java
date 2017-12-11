package com.example.annocation;


import com.example.demo.DemoApplication;
import com.example.springboot.XescmSpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(XescmSpringExtension.class)
@SpringBootTest(classes = {DemoApplication.class})
public @interface XescmEdasTest {

}
