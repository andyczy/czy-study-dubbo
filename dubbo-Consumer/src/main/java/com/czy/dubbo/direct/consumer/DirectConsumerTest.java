package com.czy.dubbo.direct.consumer;

import com.czy.dubbo.direct.provider.DirectService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DirectConsumerTest {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "direct-consumer.xml" });
		context.start();
			
		DirectService directService = (DirectService) context.getBean("directService");
		String ret = directService.direct();
		System.out.println(ret);
		
		System.in.read();
	}

}