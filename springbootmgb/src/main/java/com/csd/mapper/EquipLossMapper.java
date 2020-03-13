package com.csd.mapper;

import com.csd.entity.EquipLoss;
import com.csd.entity.EquipLossExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EquipLossMapper {
    long countByExample(EquipLossExample example);

    int deleteByExample(EquipLossExample example);

    int deleteByPrimaryKey(String equipLossId);

    int insert(EquipLoss record);

    int insertSelective(EquipLoss record);

    List<EquipLoss> selectByExample(EquipLossExample example);

    EquipLoss selectByPrimaryKey(String equipLossId);

    int updateByExampleSelective(@Param("record") EquipLoss record, @Param("example") EquipLossExample example);

    int updateByExample(@Param("record") EquipLoss record, @Param("example") EquipLossExample example);

    int updateByPrimaryKeySelective(EquipLoss record);

    int updateByPrimaryKey(EquipLoss record);
}