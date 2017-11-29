package com.example.edas;


import com.example.annocation.XescmTest;
import com.example.demo.service.EdasCheckService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.annotation.Resource;
import java.util.stream.Stream;

@XescmTest
public class EdasInvockTest {

    @Resource
    private EdasCheckService edasCheckService;


    @Test
    public void test(){
        Assertions.assertTrue(edasCheckService != null);
    }

    @ParameterizedTest
    @MethodSource("getEdasArgs")
    public void test2(int a,int b,int c){
        System.out.println(edasCheckService.add(a,b)+"==========="+c);
        Assertions.assertTrue(edasCheckService.add(a,b) == c);
    }

    static Stream<Arguments> getEdasArgs(){
        return Stream.of( Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 5));
    }
}
