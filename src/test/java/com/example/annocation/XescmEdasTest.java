package com.example.annocation;


import com.example.demo.DemoApplication;
import com.example.springboot.EdasSpringExtension;
import com.example.springboot.XescmSprngExtension;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(XescmSprngExtension.class)
@SpringBootTest(classes = {DemoApplication.class})
public @interface XescmEdasTest {

}
