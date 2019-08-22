package com.lzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liu zicheng
 * @date 2019/8/21 10:57
 */

@SpringBootApplication //springboot服务入口
@EnableEurekaServer //声明该类是eurekaserver服务注册中心
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
