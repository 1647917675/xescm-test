package com.example.juit5.paramtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

/**
 *
 * test ParameterizedTest
 * Created by lw on 2017/11/16.
 */
public class ParamTest {


    @ParameterizedTest
    @ValueSource(strings = {"aa","bb","cc"})
    public void testParameterizedTest(String json){
        Assertions.assertEquals(2,json.length());
    }


    @DisplayName("Display name of container")
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithSimpleMethodSource(Bean argument) {
        Assertions.assertTrue(argument != null);
    }

    static Stream<Bean> stringProvider() {
        Bean bean1 = new Bean();bean1.setName("zhangsan");
        Bean bean2 = new Bean();bean2.setName("lsis");
        return Stream.of(bean1,bean2);
    }

    private static class Bean {

        String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
