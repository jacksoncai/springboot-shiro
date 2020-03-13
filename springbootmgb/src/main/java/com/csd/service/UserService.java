package com.csd.service;

import com.csd.entity.*;
import com.csd.mapper.DepartmentMapper;
import com.csd.mapper.EquipmentMapper;
import com.csd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    UserExample userExample = new UserExample();

    public List<User> selectAllUser() {
       List<User> users = userMapper.selectByExample(userExample);
       return users;
    }
   public User selectUserByUsername(String uName) {

        userExample.createCriteria().andUNameEqualTo(uName);
       List<User> users = userMapper.selectByExample(userExample);
       User user = null;
       if(users.size()==1){
          user  = users.get(0);
       }
       return user;
    }

}
