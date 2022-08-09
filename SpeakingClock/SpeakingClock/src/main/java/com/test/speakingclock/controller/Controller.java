package com.test.speakingclock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.speakingclock.service.ClockService;
import com.test.speakingclock.utils.Times;

@RestController
public class Controller {
	
	@Autowired
	private ClockService clockService;
	
	public Controller(ClockService clockService) {
		super();
		this.clockService = clockService;
	}
	
	@PostMapping("/speakingclock")
	public ResponseEntity<String> sClock(@RequestBody Times times)
	{
		return new ResponseEntity<String>(clockService.process(times), HttpStatus.CREATED);
	}

}
