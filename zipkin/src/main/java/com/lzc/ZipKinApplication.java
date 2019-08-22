package com.lzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author liu zicheng
 * @date 2019/8/22 11:25
 */
@SpringBootApplication
@EnableZipkinServer //声明启动zipkinserver
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
