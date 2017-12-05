package com.example.edas;

import com.example.annocation.ContinuousIntegration;
import com.example.annocation.XescmEdasTest;
import com.example.demo.service.EdasCheckService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Stream;

@XescmEdasTest
public class TestEdas{
    @Autowired
    private EdasCheckService edasCheckService;

    @ContinuousIntegration
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