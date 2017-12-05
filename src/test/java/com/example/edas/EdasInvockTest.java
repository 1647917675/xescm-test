package com.example.edas;


import com.example.annocation.XescmTest;
import com.example.demo.service.EdasCheckService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

@XescmTest
public class EdasInvockTest {

    @Resource
    private EdasCheckService edasCheckService;


    @Test
    public void test(){
        Assertions.assertTrue(edasCheckService != null);
    }




}
