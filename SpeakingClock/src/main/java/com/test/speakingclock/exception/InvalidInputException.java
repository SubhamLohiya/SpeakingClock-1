package com.test.speakingclock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class InvalidInputException extends RuntimeException {
	
	private HttpStatus status;
	private String message;
	public InvalidInputException(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
	
}
