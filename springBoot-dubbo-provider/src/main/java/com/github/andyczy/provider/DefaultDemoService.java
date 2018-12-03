package com.github.andyczy.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.andyczy.dubbo.api.DemoService;

/**
 * Author: Chen zheng you
 * CreateTime: 2018-12-03 8:52
 * Description: 服务提供者
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}