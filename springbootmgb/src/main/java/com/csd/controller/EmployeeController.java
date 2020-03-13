package com.csd.controller;


import com.csd.entity.Department;
import com.csd.entity.Employee;
import com.csd.service.DepartmentService;
import com.csd.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //由于未写首页,所以再次就直接返回一个employee页面
    @GetMapping({"/", "/index", "/user/employee"})
    public String AllDepartment(Model model) {
        List<Employee> employees = employeeService.selectAllEmp();
        /*注意引号中没有空格*/
        model.addAttribute("employees", employees);
        logger.info("进入了/user/employee------employees对象为" + employees);

        return "user/employee";
    }

    @GetMapping("/user/selectEmployee")
    public String selectEmp(Model model, @RequestParam("condition") String condition) {
        logger.info("/user/selectEmployee----condition--->查询条件为" + condition);

        List<Employee> employees = employeeService.selectEmpByCondition(condition);

        logger.info("employees--->" + employees);

        //需要再次查询因为emp.department.departmentName不能为空
        for (Employee employee : employees) {

            Department department = departmentService.selectOneDepartByDid(employee.getDepartmentId());
            employee.setDepartment(department);

        }
        /*注意attributeName引号中没有空格*/
        model.addAttribute("employees", employees);

        return "redirect:/user/employee";
    }

    @GetMapping("/user/updateEmployee/{empId}")
    public String ToUpdateEmpPage(@PathVariable("empId") Integer empId, Model model) {
        Employee employee = employeeService.selectOneEmp(empId);

        Department department = departmentService.selectOneDepartByDid(employee.getDepartmentId());

        employee.setDepartment(department);
        //回显
        model.addAttribute("employee", employee);
        return "user/updateEmployee";
    }

    @PostMapping("/user/updateEmployee")
    public String updateOneEmp(Employee employee, Model model) {
        logger.info("进入了@PostMapping(/user/updateEmployee)---employee对象为" + employee);
        employeeService.updateEmp(employee);

        //查询所有员工
        List<Employee> employees = employeeService.selectAllEmp();
        model.addAttribute("employees", employees);
        //更新完成回到员工展示页面
        return "user/employee";
    }

    @GetMapping("/user/deleteEmployee/{empId}")
    public String deleteOneEmp1(Employee employee) {

        logger.info("删除一个员工-----" + employee.toString());
        employeeService.deleteOneEmp(employee);
        return "redirect:/user/employee";
    }

    //进入添加员工页面
    @GetMapping("/user/addEmployee")
    public String addEmp(Model model) {
        //下拉表单有departmentName
        List<Department> departmentList = departmentService.selectAllDepartment();
        model.addAttribute("departments", departmentList);
        return "user/addEmployee";
    }

    @PostMapping("/user/addEmployee")
    public String addEmp(Employee employee) {
        logger.info("添加员工信息为-----" + employee.toString());
        //将页面departmentId的信息,查出dep对象,赋给emp,是为了数据库emp表中的dep.depName属性不为空

        Integer.parseInt(employee.getPhone().toString());

        //将employee对象中的dep对象的did属性取出,
        // 赋值给employee对象的did属性,因为这样才能insert进数据库
        employee.setDepartmentId(employee.getDepartment().getDepartmentId());

        employeeService.addOneEmp(employee);

        return "redirect:/user/employee";
    }
}
