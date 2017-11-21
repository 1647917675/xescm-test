package com.example.juit5.standardTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

/**
 *  基准的单元测试
 *
 * Created by lw on 2017/11/20.
 *
 */

public class Standard01Tests {
    @Test
    @Tag("fast")
    @DisplayName("standard")
    public void demo1(){
        Assert.assertEquals(2,1 + 1);
    }

}
