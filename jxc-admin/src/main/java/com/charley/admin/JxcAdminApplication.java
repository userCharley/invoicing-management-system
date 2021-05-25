package com.charley.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author charley
 * @version 1.0
 */
@SpringBootApplication
@MapperScan("com.charley.admin.mapper")
public class JxcAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxcAdminApplication.class,args);
    }
}
