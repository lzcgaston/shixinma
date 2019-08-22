package com.lzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liu zicheng
 * @date 2019/8/22 10:24
 */
@SpringBootApplication
@EnableConfigServer //声明配置中心
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
