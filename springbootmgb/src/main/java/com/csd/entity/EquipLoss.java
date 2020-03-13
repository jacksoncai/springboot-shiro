package com.csd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipLoss implements Serializable {
    private String equipLossId;
    //  一对多
    private Equipment equipment;
    private Integer equipId;

    private String lossDesc;

    private String reason;

    private static final long serialVersionUID = 1L;

/*
2020年3月7日20:48:29 测试新增,equiploss表中没有equipName属性,
完全是因为layui中不会取json嵌套元素才用此下策
*/
    private String equipName;
}