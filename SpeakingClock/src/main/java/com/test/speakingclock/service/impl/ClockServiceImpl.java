package com.test.speakingclock.service.impl;

import java.time.LocalTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jmx.access.InvalidInvocationException;
import org.springframework.stereotype.Service;

import com.test.speakingclock.exception.InvalidInputException;
import com.test.speakingclock.service.ClockService;
import com.test.speakingclock.utils.Constants;
import com.test.speakingclock.utils.Times;


@Service
public class ClockServiceImpl implements ClockService {
	
	@Autowired
	private Constants constants;

	public ClockServiceImpl(Constants data) {
		super();
		this.constants = constants;
	}
	
	//LocalTime time = LocalTime.now();

	@Override
	public String process(Times times) {
		try {
			Integer h = times.getHours();
			Integer m = times.getMinutes();
		
		}
		catch(NullPointerException e)
		{
			e.getStackTrace();
		}
		String s = "";
		
		if(times.getHours()>23)
		{
			throw new InvalidInputException(HttpStatus.BAD_REQUEST, "Input is out of range");
			
		}
		
		if(times.getHours() == 0 & times.getMinutes() == 0)
			{s = "It's Midnight";
			return s;
			}
		if(times.getHours() == 12 & times.getMinutes() == 0)
			{s ="It's Midday";
			return s;
			}
		
		if(times.getMinutes() < 10)
		{	
			int h = times.getHours()%12;
			s = "It's " + constants.getHour(h) + " " + constants.getOnes(times.getMinutes());
			return s;
		}
		if (times.getMinutes() < 20)
		{
			int h = times.getHours()%12;
			int r = times.getMinutes()%10;
			s = "It's " + constants.getHour(h) + " " + constants.getTeens(r);
			return s;
		}
		else
		{
			int h = times.getHours()%12;
			int r = times.getMinutes()%10;
			int m = times.getMinutes()/10;
			s = "It's " + constants.getHour(h) + " " + constants.getTens(m) + " " + constants.getOnes(r);
			return s;
		}
		
	}

}
