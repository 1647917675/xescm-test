package com.example.juit5.standardTests;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * 标准测试
 * Created by lw on 2017/11/21.
 */
public class Standard02Tests {
    //在当前的测试类 所有的的单元测试测试之前 调用一次 仅调用一次
    @BeforeAll
    static void initAll() {
        System.out.println("我是一个BeforeAll 单元测试");
    }
    //每一个单元测试测试之前 需要调用一下  有多少测试单元调用几次
    @BeforeEach
    void init() {
        System.out.println("我是一个BeforeEach 单元测试");
    }
    //测试的单元
    @Test
    void succeedingTest() {
        System.out.println("我是一个Test单元测试");
    }
    // 测试的单元
    @Test
    void failingTest() {
//        fail("a failing test");
    }

    //测试的单元
    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        System.out.println("我是一个Disabled 单元测试");
    }
    // 每一个单元测试 处理完之后调用
    @AfterEach
    void tearDown() {
        System.out.println("我是一个AfterEach 单元测试");
    }
    // 测试类的所有的单元测试执行完 调用一下
    @AfterAll
    static void tearDownAll() {
        System.out.println("我是一个AfterAll 单元测试");
    }

}
