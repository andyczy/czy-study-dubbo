package com.czy.dubbo.hello.consumer;

import com.czy.dubbo.hello.provider.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Chen zheng you
 * CreateTime: 2018-11-30 9:19
 * Description:
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloService;


    @RequestMapping("hello")
    private void hello(){
        String sayHello = helloService.sayHello("注解方式");
        System.out.println(sayHello);
    }
}
