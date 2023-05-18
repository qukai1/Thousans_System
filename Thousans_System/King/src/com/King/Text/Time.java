package com.King.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	public static void main(String[] args) {
		System.out.println(Math.random()*100000);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmssSS");
		String date = format.format(new Date());
		System.out.println(date);
	}
}
