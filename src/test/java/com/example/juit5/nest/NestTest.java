package com.example.juit5.nest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * 〈功能简述〉<br/>
 * 〈测试nest 注解〉
 *
 * @author lw
 * @date 2017/12/4
 * @since 1.0.0
 */
public class NestTest {

    @Nested
    class NestTestInner{

        @Test
        @DisplayName("hello testTest1")
        public void test2(){
            System.out.println("hello testTest1");
        }


        @Nested
        class NestTest2Inner{

            @Test
            @DisplayName("hello testTest2")
            public void test2(){
                System.out.println("hello testTest2");
            }
        }
    }

    @Test
    @DisplayName("hello nestTest")
    public void test1(){
        System.out.println("hello nestTest");
    }
}