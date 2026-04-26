package com.example.demo.sahred.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ログに出力するプロセス名を取得するためのユーティリティ
 */
@Component
public class ProcessUtility {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * プライベートコンストラクタ(警告抑止)
	 */
	private ProcessUtility() {}
	
	/**
	 * 処理名を取得
	 * 
	 * @return クラス名.メソッド名
	 * @throws ClassNotFoundException クラス名を解決できなかった場合
	 */
	public String getProccessName() throws ClassNotFoundException {
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		Class<?> clazz = Class.forName(ste[2].getClassName());
		return String.format("%s#%s", clazz.getSimpleName(), ste[2].getMethodName());
	}
}
