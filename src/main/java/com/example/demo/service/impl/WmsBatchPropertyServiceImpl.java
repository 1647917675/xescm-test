package com.example.demo.service.impl;

import com.example.demo.domain.BatchPropertyDTO;
import com.example.demo.mapper.WmsBatchPropertyMapper;
import com.example.demo.service.WmsBatchPropertyService;
import org.junit.Assert;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈功能简述〉<br/>
 * 〈批次属性serviceImpl〉
 *
 * @author lw
 * @date 2017/12/7
 * @since 1.0.0
 */
@Service
public class WmsBatchPropertyServiceImpl implements WmsBatchPropertyService {

    @Resource
    private WmsBatchPropertyMapper wmsBatchPropertyMapper;
    @Override
    public void insertBatchProperty(BatchPropertyDTO batchPropertyDTO) {

        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);
        System.out.println("_____________________________________________"+wmsBatchPropertyMapper);


        if (batchPropertyDTO.getWmsTest() == 2){
            batchPropertyDTO.setBatchStatus(1);
        }else {batchPropertyDTO.setBatchStatus(0);}

        wmsBatchPropertyMapper.insertBatchProperty(batchPropertyDTO);
    }
}