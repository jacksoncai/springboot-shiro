package com.csd.service;

import com.csd.entity.Department;
import com.csd.entity.Equipment;
import com.csd.entity.EquipmentExample;
import com.csd.mapper.DepartmentMapper;
import com.csd.mapper.EquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipmentService {
    @Autowired
    EquipmentMapper equipmentMapper;
    @Autowired
    DepartmentMapper departmentMapper;
    public List<Equipment> selectAllEquipment() {
        EquipmentExample equipmentExample = new EquipmentExample();
        List<Equipment> equipmentList = equipmentMapper.selectByExample(equipmentExample);
        for (Equipment equipment:equipmentList){
            Department department = departmentMapper.selectByPrimaryKey(equipment.getDepartmentId());
            equipment.setDepartment(department);
        }
        return equipmentList;
    }

}
