package com.example.juit5.paramtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.params.provider.EnumSource.Mode.MATCH_ALL;

/**
 *
 * Created by lw on 2017/11/20.
 */
public class ColorTest {

    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, mode = MATCH_ALL, names = "^(M|N).+SECONDS$")
    void testWithEnumSourceRegex(TimeUnit timeUnit) {
        String name = timeUnit.name();
        Assertions.assertTrue(name.startsWith("M") || name.startsWith("N"));
        Assertions.assertTrue(name.endsWith("SECONDS"));
    }

}