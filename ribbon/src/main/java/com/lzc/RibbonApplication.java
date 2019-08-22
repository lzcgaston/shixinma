package com.lzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liu zicheng
 * @date 2019/8/21 15:01
 */
@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }

    @Bean
    @LoadBalanced//基于ribbon的负载均衡
    public RestTemplate reatTemplate(){
        return new RestTemplate();
    }
}
