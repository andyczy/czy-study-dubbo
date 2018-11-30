package com.czy.dubbo.hello.consumer;

import com.czy.dubbo.hello.provider.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @auther 陈郑游
 * @create 2017/3/25 0025
 * @功能   消费者
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
public class HelloConsumerTest {




    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"hello-Consumer.xml"});
        context.start();

        // 获取远程服务代理
        HelloService helloService = (HelloService) context.getBean("HelloService");
        // 执行远程方法
        String hello = helloService.sayHello("ChenZhengYou!");

        // 显示调用结果
        System.out.println(hello);

        //为保证服务一直开着，利用输入流的阻塞来模拟
        System.in.read();
    }
}  