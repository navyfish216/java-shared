package com.example.demo.sahred.enumeration;

import lombok.Getter;

/**
 * サービス定義
 */
@Getter
public enum ServiceNameCatalog {

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
	private ServiceNameCatalog(String serviceName) {
		this.serviceName = serviceName;
	}

}
