package com.lzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liu zicheng
 * @date 2019/8/21 15:48
 */
@SpringBootApplication
@EnableFeignClients //使用feign客户端
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
