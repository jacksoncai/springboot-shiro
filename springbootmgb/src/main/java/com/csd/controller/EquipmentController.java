package com.csd.controller;

import com.csd.entity.Equipment;
import com.csd.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//此controller用来测试页面table无特殊含义

@Controller
public class EquipmentController {

    @Autowired
    EquipmentService equipmentService;

    @RequestMapping("/user/equipment")
    public String testJson(Model model){
        List<Equipment> equipment = equipmentService.selectAllEquipment();
        System.out.println(equipment);
        model.addAttribute("equips",equipment);
        return "user/equipment";
    }
}
