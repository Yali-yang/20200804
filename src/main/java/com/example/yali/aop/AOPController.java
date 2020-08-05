package com.example.yali.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yali
 * @date 2020-08-04 22:08:02
 * @description
 **/
@RestController
public class AOPController {

    @GetMapping(value = "aop-test")
    public String add(){
        System.out.println("");
        return "鸭梨测试AOP";
    }


    public void update(){

    }

}
