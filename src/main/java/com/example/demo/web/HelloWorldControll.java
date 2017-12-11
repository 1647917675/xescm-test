package com.example.demo.web;

import com.example.demo.domain.BatchPropertyDTO;
import com.example.demo.mapper.WmsBatchPropertyMapper;
import com.example.demo.service.CalculateService;
import com.example.demo.service.EdasCheckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.UUID;

/**
 *
 * Created by lw on 2017/11/23.
 *
 */
@Controller
@RequestMapping("/demo")
public class HelloWorldControll {
    @Resource
    private CalculateService calculateSercice;
    @Resource
    private EdasCheckService edasCheckService;

    @Resource
    private WmsBatchPropertyMapper wmsBatchPropertyMapper;
    @RequestMapping("/test")
    public  String getWords(){
        return "hello world!!!";
    }

    @RequestMapping("/calc")
    @ResponseBody()
    public int calcValue(@RequestParam("a") int a,@RequestParam("b") int b){
        return edasCheckService.add(a,b);
    }


    @RequestMapping("/insert")
    @ResponseBody()
    public void calcValue(){
        BatchPropertyDTO batchPropertyDTO = new BatchPropertyDTO();
        batchPropertyDTO.setBatchStatus(1);
        batchPropertyDTO.setBatchId(UUID.randomUUID().toString());
        batchPropertyDTO.setBatchStatus(1);
        batchPropertyDTO.setBatchDesc("java");
        batchPropertyDTO.setCreateTime(new Timestamp(System.currentTimeMillis()));
        batchPropertyDTO.setOperateTime(new Timestamp(System.currentTimeMillis()));
        batchPropertyDTO.setCreator("123");
        batchPropertyDTO.setCreatorName("123name");
        batchPropertyDTO.setOperator("456");
        batchPropertyDTO.setOperatorName("456name");
        batchPropertyDTO.setBatchBornNumber(1);
        batchPropertyDTO.setWmsTest(1);
        batchPropertyDTO.setBatchNumber(2);
        batchPropertyDTO.setBatchSupplier(1);
        batchPropertyDTO.setBatchBornTime(3);
        batchPropertyDTO.setBatchUnvalidTime(2);
        batchPropertyDTO.setBatchSkuGooding(3);

        wmsBatchPropertyMapper.insertBatchProperty(batchPropertyDTO);
    }





}
