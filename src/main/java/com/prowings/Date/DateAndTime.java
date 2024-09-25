package com.prowings.Date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate customeDate =  LocalDate.of(1995, 4, 9);
		System.out.println(customeDate);
		
		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate pastDate = today.minusWeeks(100);
		System.out.println(pastDate);
		
		if(today.isAfter(pastDate))
			System.out.println("True");
		
		Long diff=ChronoUnit.DAYS.between(today, customeDate);
		System.out.println(diff);
		

	}
}
