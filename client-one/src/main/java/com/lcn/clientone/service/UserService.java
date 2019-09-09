package com.lcn.clientone.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lcn.clientone.entity.User;
import com.lcn.clientone.mapper.UserLcnMapper;
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
    private UserLcnMapper userLcnMapper;


    /**
     * 新增
     */
    @Transactional
    @LcnTransaction
    public Integer saveUser(User user){
        //user.setId(9L);
        user.setEmail("lcn.@qq.com");
        user.setPassword("lcn123456");
        return userLcnMapper.insert(user);
    }
}
