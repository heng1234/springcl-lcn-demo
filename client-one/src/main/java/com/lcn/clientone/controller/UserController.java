package com.lcn.clientone.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lcn.clientone.entity.User;
import com.lcn.clientone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author heng
 * @date 2019/9/7
 **/
@RequestMapping("tuser")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

  //  @LcnTransaction
    @RequestMapping("/saveUser")
    public Integer saveUser(){
        User user = new User();
        return userService.saveUser(user);
    }
}
