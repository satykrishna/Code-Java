package com.internalization.example;

import java.text.NumberFormat;
import java.util.Locale;

//write a program to display the java number in a italy specific form

public class ItalySpecific {

	public static void main(String[] args) {

		Locale locale = Locale.ITALY;
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		double d = 123456.789D;
		String no = numberFormat.format(d);
		System.out.println(no);
		System.out.println("CURRENCIES");
		System.out.println("----<<<--->>>------");
		locale = Locale.ITALY;
		currency(d, locale);
		locale = Locale.US;
		currency(d, locale);
		locale = new Locale("Hindi", "IN");
		currency(d, locale);
		locale = Locale.CHINA;
		currency(d, locale);
		locale = Locale.UK;
		currency(d, locale);

	}

	public static void currency(double d, Locale locale) {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		currencyFormat.setMaximumFractionDigits(3);
		currencyFormat.setMinimumFractionDigits(1);
		currencyFormat.setMaximumIntegerDigits(2);
		currencyFormat.setMaximumFractionDigits(2);
		String no = currencyFormat.format(d);
		System.out.println(locale.getDisplayCountry() + "...... " + no);
	}

}
