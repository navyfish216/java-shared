package com.example.demo.sahred.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.sahred.exception.ApplicationException;

/**
 * 例外スロー時のレスポンスを制御
 */
@RestControllerAdvice
public class RestApiControllerAdvice extends ResponseEntityExceptionHandler {

	/**
	 * Exception時は500 Internal Server Error
	 * 
	 * @param e Exception
	 * @return ResponseEntity
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleFileNotFoundException(Exception e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("エラーが発生しました。");
	}

	/**
	 * ApplicationException時は400 Bad Request
	 * 
	 * @param e ApplicationException
	 * @return ResponseEntity
	 */
	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<Object> handleFileNotFoundException(ApplicationException e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("アプリケーションエラーが発生しました。");
	}
}
