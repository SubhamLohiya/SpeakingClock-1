package com.test.speakingclock.utils;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
public class Constants {

	private String[] hour = {"Tweleve","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven"};
	private String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	private String[] teens = {"Ten","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
	private String[] tens = {"","","Twenty","Thirty","Fourty","Fifty"};
	public String getHour(int h) {
		return hour[h];
	}
	public void setHour(String[] hour) {
		this.hour = hour;
	}
	public String getOnes(int m) {
		return ones[m];
	}
	public void setOnes(String[] ones) {
		this.ones = ones;
	}
	public String getTeens(int m) {
		return teens[m];
	}
	public void setTeens(String[] teens) {
		this.teens = teens;
	}
	public String getTens(int m) {
		return tens[m];
	}
	public void setTens(String[] tens) {
		this.tens = tens;
	}

}
