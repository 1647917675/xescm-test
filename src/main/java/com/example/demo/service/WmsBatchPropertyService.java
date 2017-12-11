package com.example.demo.service;

import com.example.demo.domain.BatchPropertyDTO;

/**
 * 〈功能简述〉<br/>
 * 〈WmsBatchProperty Service〉
 *
 * @author lw
 * @date 2017/12/7
 * @since 1.0.0
 */
public interface WmsBatchPropertyService {
    /**
     *  保存一条批次属性
     * @param batchPropertyDTO batchPropertyDTO
     */
    void insertBatchProperty(BatchPropertyDTO batchPropertyDTO);
}