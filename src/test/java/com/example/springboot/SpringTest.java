package com.example.springboot;

import com.example.demo.DemoApplication;
import com.example.demo.service.CalculateSercice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

/**
 *
 * Created by lw on 2017/11/23.
 */

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {DemoApplication.class})
public class SpringTest {

    @Autowired
    private CalculateSercice calculateSercice;

    @Test
    public void testService(){
        System.out.println("just for Test"+"              "+calculateSercice);
        Assertions.assertTrue(calculateSercice != null);
//        Assertions.assertEquals(calculateSercice.calcValue(a,b),assumValue);
    }

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    public void testService2(int a,int b,int c){
        System.out.println("###################just for Test ###########"+"    "+calculateSercice);
        Assertions.assertTrue(calculateSercice != null);
        Assertions.assertEquals(calculateSercice.calcValue(a,b),c);
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 4)
        );
    }


}
