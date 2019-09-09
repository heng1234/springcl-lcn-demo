package com.lcn.client_two.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lcn.client_two.entity.User;
import com.lcn.client_two.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserTwoController
 *
 * @author heng
 * @date 2019/9/7
 **/
@RestController
@RequestMapping("userTwo")
public class UserTwoController {
    @Autowired
    private UserService userService;
   // @LcnTransaction
    @RequestMapping("/insertUser")
    public Integer insertUser() {
        return   userService.saveUser();
    }
}
