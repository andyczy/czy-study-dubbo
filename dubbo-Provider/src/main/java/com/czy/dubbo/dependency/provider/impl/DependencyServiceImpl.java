package com.czy.dubbo.dependency.provider.impl;

import com.czy.dubbo.dependency.provider.DependencyService;
import com.czy.dubbo.hello.provider.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @auther 陈郑游
 * @create 2017/4/5 0005
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@Service("dependencyServiceImpl")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=com.czy.dubbo.dependency.provider.DependencyService.class, protocol={"dubbo"}, retries=0)
public class DependencyServiceImpl implements DependencyService,Serializable {

	//注入SampleService
	@Autowired
	private HelloService helloService;
		
	public String dependency(String str) throws Exception {
		//这里、我们可能需要调用SampleService，也可能不需要...
		System.out.println(helloService.sayHello("str"));
		return "dependency return!";
	}

}
