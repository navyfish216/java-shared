package com.example.demo.sahred.component;

import java.util.Locale;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.example.demo.sahred.config.CommonServiceConfiguration;

import lombok.extern.slf4j.Slf4j;

/**
 * Spring Boot起動直後に呼ばれる処理を定義
 */
@Component
@Slf4j
public class AfterStartup {

	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private CommonServiceConfiguration config;
	
	/**
	 * コンストラクタ（必要に応じて中身を追加すること）
	 */
	public AfterStartup() {}
	
    /**
     * Spring Boot起動直後に行う処理
     */
    @PostConstruct
    public void executeAfterStartup() {
    	//起動時の処理を記述
    	log.info(messageSource.getMessage("sandbox.application.log.start", new String[]{config.getServiceName()}, Locale.getDefault()));
    }
}
