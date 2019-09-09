package com.lcn.feign.client;

import com.lcn.feign.fallback.Client2Fallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "client-two" , fallback = Client2Fallback.class)
public interface Client3 {

    @GetMapping("{method}")
    Object getMethod(@PathVariable("method") String method, @RequestParam Map<String, Object> map);
}
