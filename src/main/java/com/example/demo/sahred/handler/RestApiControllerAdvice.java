package com.example.demo.sahred.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.sahred.exception.ApplicationException;

@RestControllerAdvice
public class RestApiControllerAdvice extends ResponseEntityExceptionHandler {

	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<Object> handleFileNotFoundException(Exception e) {
	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("エラーが発生しました。");
	  }
	  
	  @ExceptionHandler(ApplicationException.class)
	  public ResponseEntity<Object> handleFileNotFoundException(ApplicationException e) {
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("アプリケーションエラーが発生しました。");
	  }
}
