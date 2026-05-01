package com.example.demo.sahred.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.sahred.component.AfterStartup;
import com.example.demo.sahred.component.BeforeStop;

import lombok.Data;

/**
 * 各サービスの共通的な設定項目を定義
 */
@Configuration
@Data
public class CommonServiceConfiguration {

	/**
	 * コンストラクタ（必要に応じて中身を追加すること）
	 */
	public CommonServiceConfiguration() {}
	
	@Value("${server.port:8080}")
	private Integer selfServerPort;
	
	@Value("${spring.application.name:default}")
	private String serviceName;
	
	/**
	 * Spring Boot起動直後に呼ばれる処理をBean登録
	 * 
	 * @return AfterStartup
	 */
	@Bean
	AfterStartup afterStartup() {
		return new AfterStartup();
	}
	
	/**
	 * Spring Boot停止直前に呼ばれる処理をBean登録
	 * 
	 * @return BeforeStop
	 */
	@Bean
	BeforeStop beforeStop() {
		return new BeforeStop();
	}
}
