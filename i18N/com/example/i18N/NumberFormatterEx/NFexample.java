package com.example.i18N.NumberFormatterEx;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NFexample {

	
	
	public static void main(String[] args) throws ParseException {
		
		
		NumberFormat normalFormat = NumberFormat.getInstance();
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentageFormat = NumberFormat.getPercentInstance();
		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		
		Locale locale = Locale.FRANCE;
		
		normalFormat = NumberFormat.getInstance(locale);
		currencyFormat = NumberFormat.getCurrencyInstance(locale);
		percentageFormat = NumberFormat.getPercentInstance(locale);
		numberFormat = NumberFormat.getNumberInstance(locale);
		
		String localeNumber = numberFormat.format(Double.valueOf(12345.6789));
		
		System.out.println(localeNumber);
		
		Number no = currencyFormat.parse(localeNumber);
		
		System.out.println(no.doubleValue());
		
		

	}
}
