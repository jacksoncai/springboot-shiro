package com.csd.service;

import com.csd.entity.Department;
import com.csd.entity.DepartmentExample;
import com.csd.mapper.DepartmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<Department> selectAllDepartment() {

        DepartmentExample departmentExample = new DepartmentExample();
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }

    public Department selectOneDepartByDid(Integer departmentId) {
        Department department = departmentMapper.selectByPrimaryKey(departmentId);
        logger.info("查询到的dep对象为"+department.toString());

        return department;
    }

    public void addOneDep(Department department) {
        logger.info("添加到数据库中的dep对象为"+department.toString());
        departmentMapper.insert(department);
    }
}
