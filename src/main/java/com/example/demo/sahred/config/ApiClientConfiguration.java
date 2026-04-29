package com.example.demo.sahred.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

/**
 * API呼び出し用の共通部品設定
 */
@Configuration
public class ApiClientConfiguration {

	/**
	 * コンストラクタ（必要に応じて中身を追加すること）
	 */
	public ApiClientConfiguration() {}
	
	@Bean
	RestClient restClient() {
		return RestClient.create();
	}

}
