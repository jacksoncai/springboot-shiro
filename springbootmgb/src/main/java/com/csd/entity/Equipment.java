package com.csd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment implements Serializable {
    private Integer equipId;
    //一对多
    private Department department;
    private Integer departmentId;

    private String equipName;

    private String equipTypeName;

    private String equipDesc;

    private String equipStorageDate;

    private Integer equipCount;

    private BigDecimal equipPrice;

    private static final long serialVersionUID = 1L;


}