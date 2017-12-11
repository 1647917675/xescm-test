package com.example.demo.mapper;

import com.example.demo.domain.BatchPropertyDTO;

/**
 * 〈功能简述〉<br/>
 * 〈saas-wms 批次属性mapper〉
 *
 * @author lw
 * @date 2017/12/7
 * @since 1.0.0
 */
public interface WmsBatchPropertyMapper  {
    /**
     *  插入一条批次属性对象
     * @param batchPropertyDTO batchPropertyDTO
     */
    void insertBatchProperty(BatchPropertyDTO batchPropertyDTO);

}