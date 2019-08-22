package com.lzc.feign;

import com.lzc.entity.Student;
import com.lzc.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author liu zicheng
 * @date 2019/8/21 17:06
 * fallback标识访问失败是调用指定error的方法
 */
@FeignClient(value = "provider", fallback = FeignError.class)//指定服务当前访问的服务
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
