package com.example.demo.sahred.exception;

/**
 * アプリケーション例外
 * <p>
 * この例外は400 Bad Requestに相当する
 * </p>
 */
public class ApplicationException extends Exception {

	/**
	 * コンストラクタ
	 * 
	 * @param message 例外メッセージ
	 */
	public ApplicationException(String message) {
		super(message);
	}
}
