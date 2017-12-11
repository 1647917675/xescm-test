package com.example.edas;


import com.example.annocation.XescmEdasTest;
import com.example.annocation.XescmTest;
import com.example.demo.service.EdasCheckService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

@XescmEdasTest
public class EdasInvockTest {

    @Resource
    private EdasCheckService edasCheckService;


    @Test
    public void test(){

        Assertions.assertTrue(edasCheckService.add(1,2) == 3);
    }




}
