package com.java.lab3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Lab3_6 {

	public static void currTime(String zoneId) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// Use Madrid's time zone to format the date in
		df.setTimeZone(TimeZone.getTimeZone(zoneId));

		System.out.println("Date and time in " + zoneId + " is " + df.format(date));
	}
	
	public static void main(String[] args) {
		Lab3_6.currTime("America/New_York");
	}
}
