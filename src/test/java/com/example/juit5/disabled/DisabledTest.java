package com.example.juit5.disabled;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 *
 * Created by lw on 2017/11/21.
 */
public class DisabledTest {

    @Test
    @Disabled
    void  testDisabled(){
        Assertions.fail("测试是否没有测试");
    }
}
