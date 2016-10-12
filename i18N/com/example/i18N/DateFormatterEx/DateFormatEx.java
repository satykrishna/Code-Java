package com.example.i18N.DateFormatterEx;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date d  = cal.getTime();
//		display(Locale.US, d, 0);
//		display(Locale.US, d, 1);
//		display(Locale.US, d, 2);
//		display(Locale.US, d, 3);
//		
//		display(Locale.UK, d, 0);
//		display(Locale.UK, d, 1);
//		display(Locale.UK, d, 2);
//		display(Locale.ITALY, d, 1);
		displayTime(Locale.US, d, 3, 0);
		
		

	}
	
	public static void display(Locale locale, Date d, int style) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, locale);
		String str = df.format(d);
		System.out.println(df + "... " +str);
	}
	
	
	public static void displayTime(Locale locale, Date d, int dateStyle, int timeStyle) {
		DateFormat df = DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale);
		String str = df.format(d);
		System.out.println(df + "... " +str);
	}

}
