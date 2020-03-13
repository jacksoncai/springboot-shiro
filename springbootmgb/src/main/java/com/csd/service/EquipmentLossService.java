package com.csd.service;

import com.csd.entity.EquipLoss;
import com.csd.entity.EquipLossExample;
import com.csd.entity.Equipment;
import com.csd.entity.EquipmentExample;
import com.csd.mapper.EquipLossMapper;
import com.csd.mapper.EquipmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EquipmentLossService {
    @Autowired
    EquipLossMapper equipLossMapper;
    @Autowired
    EquipmentMapper equipmentMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //查询所有损失
    public List<EquipLoss> allEquipmentLoss(){
        EquipLossExample equipLossExample = new EquipLossExample();
        List<EquipLoss> equipLosses = equipLossMapper.selectByExample(equipLossExample);
        for(EquipLoss equipLoss:equipLosses){
            Equipment equipment = equipmentMapper.selectByPrimaryKey(equipLoss.getEquipId());
            equipLoss.setEquipment(equipment);
        }
        return equipLosses;
    }

    //删除,确认权限?
    public void delectByEquipLossId(String equipLossId) {
        equipLossMapper.deleteByPrimaryKey(equipLossId);
    }

    public void addOneEquipLoss(EquipLoss equiploss) {
        equipLossMapper.insert(equiploss);
    }

    //查询一条设备损失记录
    public EquipLoss selectOneEquipLoss(String equipLossId) {
        EquipLoss equipLoss = equipLossMapper.selectByPrimaryKey(equipLossId);

        Equipment equipment = equipmentMapper.selectByPrimaryKey(equipLoss.getEquipId());
        equipLoss.setEquipment(equipment);

        return  equipLoss;
    }

    //更新一条设备损失记录
    public void updateOneEquipLoss(EquipLoss equipLoss) {
        EquipLossExample equipLossExample = new EquipLossExample();
        //需要添加删选条件,否则会全表更新
        equipLossExample.createCriteria().andEquipLossIdEqualTo(equipLoss.getEquipLossId());
        // 更新方法(更新值,更新条件)
         equipLossMapper.updateByExampleSelective(equipLoss,equipLossExample);

    }
    //模糊查询
    public List<EquipLoss> selectByCondition(String condition) {
        EquipLossExample equipLossExample = new EquipLossExample();
        EquipLossExample.Criteria criteria = equipLossExample.createCriteria();
        if(condition!=null){
            criteria.andReasonLike("%"+condition+"%")
                  .andLossDescIn(Collections.singletonList(condition));
        }
        List<EquipLoss> equipLossList = equipLossMapper.selectByExample(equipLossExample);
        logger.info("equipLossList"+equipLossList);

        //对单个equipLoss对象查询equipName
        for(EquipLoss after:equipLossList){
            Equipment equipment = equipmentMapper.selectByPrimaryKey(after.getEquipId());
            after.setEquipment(equipment);
        }
        return equipLossList;
    }

}
