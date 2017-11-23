package com.example.demo.service.impl;

import com.example.demo.service.CalculateSercice;
import org.springframework.stereotype.Service;

/**
 *
 * Created by lw on 2017/11/23.
 */
@Service
public class CalculateServiceImpl implements CalculateSercice {

    @Override
    public int calcValue(int a, int b) {
        return a + b;
    }
}
