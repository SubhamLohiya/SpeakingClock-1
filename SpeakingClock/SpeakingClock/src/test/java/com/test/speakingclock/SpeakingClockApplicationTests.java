package com.test.speakingclock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.speakingclock.service.impl.ClockServiceImpl;
import com.test.speakingclock.utils.Times;

@SpringBootTest
class SpeakingClockApplicationTests {

	@Autowired
	ClockServiceImpl serImpl;
	
	@Test
	public void inputTime() {
		
		Times t1 = new Times();
		t1.setHours(20);
		t1.setMinutes(45);
		serImpl.process(t1);
		
		Times t2 = new Times();
		t2.setHours(24);
		t2.setMinutes(27);
		serImpl.process(t2);
		
		Times t3 = new Times();
		t3.setHours(00);
		t3.setMinutes(00);
		serImpl.process(t3);
		
		Times t4 = new Times();
		t3.setHours(12);
		t3.setMinutes(00);
		serImpl.process(t4);
	}

}
