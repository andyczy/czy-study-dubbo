package com.czy.dubbo.dependency.consumer;

import com.czy.dubbo.dependency.provider.DependencyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
public class DependencyConsumerTest implements Serializable {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dependency-consumer.xml"});
		context.start();

		// 获取远程服务代理
		DependencyService dependencyService = (DependencyService) context.getBean("dependencyService");
		// 执行远程方法
		String dependency = dependencyService.dependency("dubbo两层依赖！");
		// 显示调用结果
		System.out.println(dependency);

		//为保证服务一直开着，利用输入流的阻塞来模拟
		System.in.read();
	}

}