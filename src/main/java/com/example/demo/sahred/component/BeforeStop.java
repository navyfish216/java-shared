package com.example.demo.sahred.component;

import java.util.Locale;

import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.example.demo.sahred.config.CommonServiceConfiguration;

import lombok.extern.slf4j.Slf4j;

/**
 * Spring Boot停止直前に呼ばれる処理を定義
 */
@Component
@Slf4j
public class BeforeStop {

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private CommonServiceConfiguration config;

	/**
	 * Spring Boot停止直前に行う処理
	 */
	@PreDestroy
	public void executeBeforeStop() {
		//停止時の処理を記述
		log.info(messageSource.getMessage("sandbox.application.log.end", new String[]{config.getServiceName()}, Locale.getDefault()));
	}
}
