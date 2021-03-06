package com.example.demo.service.impl;

import com.example.demo.service.EdasCheckService;
import com.xescm.bc.ac.service.CustomerAutoComputeEdasService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class EdasCheckServiceImpl implements EdasCheckService {

    @Resource
    private   CustomerAutoComputeEdasService customerAutoComputeEdasService;

    @Override
    public String getEdasConsumerClassName() {
        return this.getClass().getName();
    }

    @Override
    public int add(int a, int b) {
        return (int) customerAutoComputeEdasService.add(a,b).getResult();
    }
}
