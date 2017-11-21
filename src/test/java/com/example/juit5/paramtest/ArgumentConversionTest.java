package com.example.juit5.paramtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 * Created by lw on 2017/11/20.
 */
public class ArgumentConversionTest {

    @ParameterizedTest
    @ValueSource(strings = "SECONDS")
    void testWithImplicitArgumentConversion(TimeUnit argument) {
        assertNotNull(argument.name());
    }

    static class ToStringConversion extends SimpleArgumentConverter{

        @Override
        protected Object convert(Object o, Class<?> aClass) throws ArgumentConversionException {
            //o 单元测试的参数化的数据的值
            //aClass 转换的类型 即单元测试的参数的入参的类型
            Assertions.assertEquals(String.class,aClass,"校验要转换的参数的类型是");
            return String.valueOf(o);
        }
    }

}
