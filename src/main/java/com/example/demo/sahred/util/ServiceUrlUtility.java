package com.example.demo.sahred.util;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.demo.sahred.enumeration.ServiceNameCatalog;

import lombok.Setter;

/**
 * サービスに対応するURLを返却する共通部品
 */
@Component
@ConfigurationProperties("sandbox.service.url.config")
@Setter
public class ServiceUrlUtility {

	private Map<String, String> map;

	/**
	 * プライベートコンストラクタ(警告抑止)
	 */
	private ServiceUrlUtility() {}
	
	/**
	 * サービスのURLを取得
	 * 
	 * @param config ServiceConfig
	 * @return URL
	 */
	public String getUrl(ServiceNameCatalog config) {
		return map.get(config.getServiceName());
	}
}
