package com.example.juit5.xescm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * Created by lw on 2017/11/21.
 */
public class Base02Test extends BaseTest {
    @Test
    void succeedingTest() {
        System.out.println("我是一个Test单元测试");
    }
    // 测试的单元
    @Test
    void failingTest() {
        fail("a failing test");
    }
}
