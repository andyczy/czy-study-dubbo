package com.czy.dubbox.service.impl;

import com.czy.dubbox.entity.Simple;
import com.czy.dubbox.service.SimpleService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;




/**
 * @auther     陈郑游
 * @create     2017/4/5 0005
 * @功能       implements Serializable
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@Service("simpleService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=com.czy.dubbox.service.SimpleService.class, protocol={"dubbo"}, retries=0)
public class SimpleServiceImpl implements SimpleService {

	@Override
	public String sayHello(String name) {
		return "hello" + name;
	}

	@Override
	public Simple getSimple() {
        Map<String,Integer> map = new HashMap<String, Integer>(2);  
        map.put("zhang0", 1);  
        map.put("zhang1", 2);  
        return new Simple("zhang3", 21, map);
	}

}
