package com.lzc.controller;

import com.lzc.entity.Student;
import com.lzc.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author liu zicheng
 * @date 2019/8/22 9:53
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
