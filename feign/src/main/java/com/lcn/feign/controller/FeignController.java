package com.lcn.feign.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lcn.feign.client.Client2;
import com.lcn.feign.client.Client3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * FeignController
 *
 * @author heng
 * @date 2019/9/7
 **/
@RestController
@RequestMapping("feign")
public class FeignController {

    @Autowired
    private Client2 client2;
    @Autowired
    private Client3 client3;

    @RequestMapping("testLcn")
    @LcnTransaction
    public  String testLcn(){
        Map<String, Object> map  = new HashMap<>();
        Integer res = (Integer) client2.getMethod("tuser/saveUser",map);
        Integer res1 = (Integer) client3.getMethod("userTwo/insertUser",map);
       return res+"-"+res1;

    }
}
