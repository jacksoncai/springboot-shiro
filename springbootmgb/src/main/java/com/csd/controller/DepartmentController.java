package com.csd.controller;


import com.csd.entity.Department;
import com.csd.service.DepartmentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

   @GetMapping("/user/department")
    public String AllDepartment(Model model){
       List<Department> allDepartment = departmentService.selectAllDepartment();
       model.addAttribute("allDep",allDepartment);
        return "/user/department";
    }
   @GetMapping("/user/addDep")
    public String addDep(){

       return "/user/addDep";
    }
   @PostMapping ("/addDep")
    public String addOneDep(Department department){
        departmentService.addOneDep(department);
      return "/user/department";
   }

   @RequestMapping("/dep/json")//   table.html 页面发出/json请求
    @ResponseBody   //返回一个字符传
    public String tableJson(Model model) throws JsonProcessingException {


       List<Department> allDepartment = departmentService.selectAllDepartment();
       int count = allDepartment.size();
       //将查询结果转化为一个字符串
       String str = JSONArray.toJSONString(allDepartment);
        //拼接成layui 识别的json串
        String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+str+"}";
        //  将此符合layui 的json串打回department页面,类似ajax回调
        return jso;
    }
    /*
        //从网上找的另外一种方式产生json
     @RequestMapping(value="findallEmp",produces="text/html;charset=utf-8")
    public @ResponseBody String findallEmp( int page, int limit){
       int before = limit * (page - 1) + 1;
        int after = page * limit;
        //带参数从数据库里查询出来放到eilist的集合里
        List<Information> eilist = informationService.findAllPage(before, after);
        int count = informationService.count();
        //用json来传值
       JSONArray json = JSONArray.fromObject(eilist);
        String js = json.toString();

        //*****转为layui需要的json格式，必须要这一步，博主也是没写这一步，在页面上数据就是数据接口异常
        String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+100+",\"data\":"+js+"}";
        return jso;
    }*/
}
