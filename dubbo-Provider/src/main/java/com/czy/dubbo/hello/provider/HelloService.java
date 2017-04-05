package com.czy.dubbo.hello.provider;



/**
 * @auther 陈郑游
 * @create 2017/3/25 0025
 * @功能  定义服务接口: (该接口需单独打包，在服务提供方和消费方共享)
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
public interface HelloService {

    String sayHello(String name);

}