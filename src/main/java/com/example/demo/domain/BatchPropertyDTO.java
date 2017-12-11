package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 〈功能简述〉<br/>
 * 〈批次属性Dto〉
 *
 * @author lw
 * @date 2017/12/7
 * @since 1.0.0
 */
@Data
@Table(name = "tb_wms_batch_property")
public class BatchPropertyDTO {
    @Id
    @GeneratedValue(generator = "UUID")
    private String  batchId;

    @Column(name = "batch_desc")
    private String  batchDesc;

    @Column(name = "customer_code")
    private String  customerCode;

    @Column(name = "customer_name")
    private String  customerName;

    @Column(name = "warehouse_code")
    private String  warehouseCode;

    @Column(name = "warehouse_name")
    private String  warehouseName;

    @Column(name = "batch_born_time")
    private Integer  batchBornTime;

    @Column(name = "batch_unvalid_time")
    private Integer   batchUnvalidTime;

    @Column(name = "batch_born_number")
    private Integer     batchBornNumber;

    @Column(name = "batch_supplier")
    private Integer     batchSupplier;

    @Column(name = "batch_number")
    private Integer     batchNumber;

    @Column(name = "batch_sku_gooding")
    private Integer   batchSkuGooding;

    @Column(name = "creator")
    private String  creator;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "creator_name")
    private String creatorName;

    @Column(name = "operator")
    private String   operator;

    @Column(name = "operator_name")
    private String operatorName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @Column(name = "operate_time")
    private Timestamp operateTime;

    @Column(name = "wms_test")
    private Integer wmsTest;

    @Column(name = "batch_status")
    private Integer batchStatus;


}