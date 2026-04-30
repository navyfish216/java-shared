package com.example.demo.sahred.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestClient;

import io.micrometer.observation.ObservationRegistry;

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
	RestClient restClient(ObservationRegistry observationRegistry) {
		return RestClient.builder()
				.observationRegistry(observationRegistry)
				.requestInterceptor(logInterceptor)
				.build();
	}

	ClientHttpRequestInterceptor logInterceptor = (request, body, execution) -> {
	    Logger logger = LoggerFactory.getLogger("RestClientLogger");
	    logger.info("URI         : {}", request.getURI());
	    logger.info("HTTP Method : {}", request.getMethod());
	    logger.info("Headers     : {}", request.getHeaders());
	    return execution.execute(request, body);
	};
	
}
