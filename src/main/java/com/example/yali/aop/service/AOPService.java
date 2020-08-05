package com.example.yali.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author Yali
 * @date 2020-08-04 22:13:06
 * @description
 **/
@Service
public class AOPService {
    public void add(){
        System.out.println("service aop .....");
    }
}
