package com.example.juit5.extendsion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * Created by lw on 2017/11/21.
 */
@ExtendWith(ExtendsionJavaTest.class)
public class ExtendsionTest {

    @ParameterizedTest
    @ValueSource(strings = {"aa","bb","cc"})
    void junitDemo(String words){
        Assertions.assertTrue(words.length() >= 2);
    }
}
