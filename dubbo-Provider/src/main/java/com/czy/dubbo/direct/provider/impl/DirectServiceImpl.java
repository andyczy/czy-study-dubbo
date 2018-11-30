package com.czy.dubbo.direct.provider.impl;


import com.czy.dubbo.direct.provider.DirectService;
import org.springframework.stereotype.Service;


/**
 * @auther 陈郑游
 * @create 2017/4/5 0005
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@Service
public class DirectServiceImpl implements DirectService {

	@Override
	public String direct() throws Exception {
		return "Direct Service";
	}

}
