package com.lzc.feign.impl;

import com.lzc.entity.Student;
import com.lzc.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author liu zicheng
 * @date 2019/8/22 9:22
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
