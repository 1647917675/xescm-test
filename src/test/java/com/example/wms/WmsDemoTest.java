package com.example.wms;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.annocation.ContinuousIntegration;
import com.example.annocation.XescmEdasTest;
import com.example.demo.domain.BatchPropertyDTO;
import com.example.demo.mapper.WmsBatchPropertyMapper;
import com.example.demo.service.WmsBatchPropertyService;
import com.sun.org.apache.bcel.internal.util.BCELifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * 〈功能简述〉<br/>
 * 〈wms测试粒度demo〉
 *
 * @author lw
 * @date 2017/12/7
 * @since 1.0.0
 */
@XescmEdasTest
public class WmsDemoTest {
    @Autowired
    private WmsBatchPropertyService wmsBatchPropertyService;


    @Test
    public void test(){
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

        System.out.println(JSON.toJSON(batchPropertyDTO));
    }


//    @ContinuousIntegration
    @ParameterizedTest
    @ValueSource(strings = {"{\"creator\":\"123\",\"batchBornNumber\":1,\"batchSupplier\":1,\"batchSkuGooding\":3,\"operateTime\":1512646716738,\"creatorName\":\"123name\",\"batchDesc\":\"java\",\"batchId\":\"5b586787-7fce-4eb0-a233-45b3a91882d3\",\"operatorName\":\"456name\",\"wmsTest\":1,\"operator\":\"456\",\"batchUnvalidTime\":2,\"createTime\":1512646716738,\"batchBornTime\":3,\"batchStatus\":1,\"batchNumber\":2}\n","{\"creator\":\"123\",\"batchBornNumber\":1,\"batchSupplier\":1,\"batchSkuGooding\":3,\"operateTime\":1512646716738,\"creatorName\":\"123name\",\"batchDesc\":\"java\",\"batchId\":\"5b586787-7fce-4eb0-a233-45b3a91882d3\",\"operatorName\":\"456name\",\"wmsTest\":1,\"operator\":\"456\",\"batchUnvalidTime\":2,\"createTime\":1512646716738,\"batchBornTime\":3,\"batchStatus\":1,\"batchNumber\":2}\n"})
    public void insertTest(@ConvertWith(BatchPropertyDTOConverter.class) BatchPropertyDTO batchPropertyDTO){
        System.out.println(batchPropertyDTO);
        wmsBatchPropertyService.insertBatchProperty(batchPropertyDTO);
    }

}

class BatchPropertyDTOConverter implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        Assertions.assertEquals(BatchPropertyDTO.class,context.getParameter().getType());

        BatchPropertyDTO batchPropertyDTO = JSONObject.parseObject(source.toString(),BatchPropertyDTO.class);
        return batchPropertyDTO;
    }
}