package com.csd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private Integer departmentId;

    private String departmentName;

    private static final long serialVersionUID = 1L;

}