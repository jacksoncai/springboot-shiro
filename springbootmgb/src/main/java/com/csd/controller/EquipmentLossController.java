package com.csd.controller;

import com.csd.entity.EquipLoss;
import com.csd.service.EquipmentLossService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class EquipmentLossController {

    @Autowired
    EquipmentLossService equipmentLossService;
    //日志
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/user/equipLoss")
    public String AllEquipLoss(Model model){
        List<EquipLoss> equipLosses = equipmentLossService.allEquipmentLoss();
        model.addAttribute("equipLosses",equipLosses);
        return "user/equipLoss";
    }

    //接收更新请求
    @GetMapping("/user/updateEquipLoss/{equipLossId}")
    public String EditLoss(Model model,@PathVariable("equipLossId")String equipLossId){
        logger.info("updateEquipLoss接收更新请求");
        //查询一条设备损失记录,得到对象
        EquipLoss oneEquipLossMessage=equipmentLossService.selectOneEquipLoss(equipLossId);
       //将所选的对象打到更新页面,实现回显
        model.addAttribute("oneEquipLossMessage",oneEquipLossMessage);

        return "user/updateEquipLoss";
    }

    //接收编辑表单
    @PostMapping("/user/updateEquipLoss")
    public String EditLoss(EquipLoss equipLoss){
        //更新
        equipmentLossService.updateOneEquipLoss(equipLoss);

        logger.info("开始updateEquipLoss----equipLoss对象为:"+equipLoss);
        //编辑完后返回页面
        return "redirect:/user/equipLoss";
    }
    //删除指定的
    @GetMapping("/user/deleteLoss/{equipLossId}")
    public String deleteEquipLoss(Model model, @PathVariable("equipLossId")String equipLossId){
        //日志记录
        logger.info("删除的equipLossId--->>"+equipLossId);

        equipmentLossService.delectByEquipLossId(equipLossId);

       return "redirect:/user/equipLoss";
    }

    // restful风格 ,post对应添加
    @PostMapping("/user/addEquipLoss")
    public String addEquipLoss(EquipLoss equipLoss){

        logger.info("开始addEquipLoss操作----equipLoss对象为:"+equipLoss);

        //equipLoss存入为uuid
        if(equipLoss==null){
            return "user/equipLoss";
        }
            equipLoss.setEquipLossId( UUID.randomUUID().toString().replaceAll("-", ""));

            equipLoss.setEquipId(1);

        equipmentLossService.addOneEquipLoss(equipLoss);

        return "redirect:/user/equipLoss";
    }
    @GetMapping("/user/addEquipLoss")
    public String ToAddEquipLoss(){
     logger.info("跳转到addEquipLoss页面");

        return "user/addEquipLoss";
    }

    //处理模糊查询
    @GetMapping("/user/selectEquipLoss")
    public String selectEquipLoss(@RequestParam("condition")String condition,Model model){
        logger.info("模糊查询的condition为"+condition);

        List<EquipLoss> equipLossList=equipmentLossService.selectByCondition(condition);

        model.addAttribute("equipLosses",equipLossList);

        return "user/equipLoss";
    }
}
