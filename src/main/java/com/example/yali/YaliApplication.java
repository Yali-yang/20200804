package com.example.yali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class YaliApplication {
    // 这是0806的分支

    public static void main(String[] args) {
        SpringApplication.run(YaliApplication.class, args);
    }

}
