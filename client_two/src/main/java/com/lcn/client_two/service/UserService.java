package com.lcn.client_two.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lcn.client_two.entity.User;
import com.lcn.client_two.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserService
 *
 * @author heng
 * @date 2019/9/7
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @LcnTransaction
    public Integer saveUser(){
        User user = new User();
        user.setEmail("lcnxxx@xx.com");
        user.setAge(17);
        user.setName("lcn");
        int res = 1/0;
      return   userMapper.insert(user);
    }
}
