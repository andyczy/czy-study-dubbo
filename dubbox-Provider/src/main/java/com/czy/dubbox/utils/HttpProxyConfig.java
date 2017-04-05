package com.czy.dubbox.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <br>
 * 类 名: HttpCallerConfig <br>
 * 描 述: http属性配置参数 <br>
 */
@Component
public class HttpProxyConfig {
	/**
	 * 最大连接数
	 */
	public static int MAX_TOTAL_CONNECTIONS = 800;
	/**
	 * 每个路由最大连接数
	 */
	public static int MAX_ROUTE_CONNECTIONS = 400;
	/**
	 * 连接超时时间
	 */
	public static int CONNECT_TIMEOUT = 10000;
	/**
	 * 读取超时时间
	 */
	public static int READ_TIMEOUT = 10000;

	/**
	 * 设置 mAX_TOTAL_CONNECTIONS
	 * 
	 * @param mAX_TOTAL_CONNECTIONS
	 */
	@Value("#{zcparams[max_total_connections]}")
	private void setMAX_TOTAL_CONNECTIONS(int mAX_TOTAL_CONNECTIONS) {
		MAX_TOTAL_CONNECTIONS = mAX_TOTAL_CONNECTIONS;
	}

	/**
	 * 设置 mAX_ROUTE_CONNECTIONS
	 * 
	 * @param mAX_ROUTE_CONNECTIONS
	 */
	@Value("#{zcparams[max_total_connections]}")
	private void setMAX_ROUTE_CONNECTIONS(int mAX_ROUTE_CONNECTIONS) {
		MAX_ROUTE_CONNECTIONS = mAX_ROUTE_CONNECTIONS;
	}

	/**
	 * 设置 cONNECT_TIMEOUT
	 * 
	 * @param cONNECT_TIMEOUT
	 */
	@Value("#{zcparams[connect_timeout]}")
	private void setCONNECT_TIMEOUT(int cONNECT_TIMEOUT) {
		CONNECT_TIMEOUT = cONNECT_TIMEOUT;
	}

	/**
	 * 设置 rEAD_TIMEOUT
	 * 
	 * @param rEAD_TIMEOUT
	 */
	@Value("#{zcparams[read_timeout]}")
	private void setREAD_TIMEOUT(int rEAD_TIMEOUT) {
		READ_TIMEOUT = rEAD_TIMEOUT;
	}

}
