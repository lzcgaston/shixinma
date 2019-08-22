package com.lzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author liu zicheng
 * @date 2019/8/21 14:35
 */
@EnableZuulProxy //包含了@EnableZuulServer,设置该类是网关的启动类
@EnableAutoConfiguration//帮助springboot将所有符合条件的configuration配置加载到当前ioc容器
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
