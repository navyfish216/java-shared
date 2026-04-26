package com.example.demo.sahred.util;

import org.springframework.stereotype.Component;

@Component
public class ProcessUtility {

	public String getProccessName() {
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		return String.format("%s.%s", ste[2].getClass().getSimpleName(), ste[2].getMethodName());
	}
}
