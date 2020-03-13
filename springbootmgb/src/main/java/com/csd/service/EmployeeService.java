package com.csd.service;

import com.csd.entity.*;
import com.csd.mapper.DepartmentMapper;
import com.csd.mapper.EmployeeMapper;
import com.csd.mapper.EquipmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<Employee> selectAllEmp() {
        EmployeeExample employeeExample = new EmployeeExample();
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);
        for(Employee e:employees){
            Department department = departmentMapper.selectByPrimaryKey(e.getDepartmentId());
            e.setDepartment(department);
        }
        return employees;
    }

    public Employee selectOneEmp(Integer empId) {

        Employee employee = employeeMapper.selectByPrimaryKey(empId);

        return employee;
    }

    public void updateEmp(Employee employee) {
        EmployeeExample employeeExample = new EmployeeExample();
        //处理phone  Integer
        int phone = Integer.parseInt(employee.getPhone().toString());
        employee.setPhone(phone);

        //只更新一个员工
        employeeExample.createCriteria().andEmpIdEqualTo(employee.getEmpId());
                                        //(数据,条件)
        employeeMapper.updateByExampleSelective(employee,employeeExample);
    }

    public void deleteOneEmp(Employee employee) {
        employeeMapper.deleteByPrimaryKey(employee.getEmpId());
    }

    public void addOneEmp(Employee employee) {
        employeeMapper.insert(employee);
    }

    public List<Employee> selectEmpByCondition(String condition) {
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andEmpNameLike("%"+condition+"%");
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);
        logger.info("模糊查询的employees为"+employees);
        return employees;
    }
}
