package com.czy.dubbo.hello.provider.impl;

import com.czy.dubbo.hello.provider.HelloService;


/**
 * @auther 陈郑游
 * @create 2017/3/25 0025
 * @功能     在服务提供方实现接口：(对服务消费方隐藏实现)
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}  