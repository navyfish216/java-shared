package com.example.demo.sahred.config;

import lombok.Getter;

/**
 * サービス定義
 */
@Getter
public enum ServiceConfig {

	/** sandbox-service */
	SANDBOX_SERVICE("sandbox-service"),
	/** sandbox-2nd-service */
	SANDBOX_2ND_SERVICE("sandbox-2nd-service");
	
	private String serviceName;
	
	/**
	 * コンストラクタ
	 * 
	 * @param serviceName サービス名
	 */
	private ServiceConfig(String serviceName) {
		this.serviceName = serviceName;
	}

}
