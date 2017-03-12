package com.javamaster.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by win7 on 2017/3/12.
 */
@Configuration
@ComponentScan(basePackages ={"com.javamaster.controller"})
@EnableAutoConfiguration
public class Config {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Config.class, args);
    }
}
