package com.example.i18N.localeEx;

import java.util.Locale;

public class LocaleEx {

	public static void main(String[] args) {

		Locale locale = new Locale("English");

		Locale l2 = new Locale("Hindi", "India");

		l2 = Locale.ENGLISH;
		l2 = Locale.KOREAN;

		System.out.println(Locale.getDefault());

		System.out.println(Locale.getDefault().getDisplayCountry());

		System.out.println(Locale.getDefault().getDisplayLanguage());

		
		Locale.setDefault(Locale.GERMAN);

		System.out.println(Locale.getDefault().getDisplayCountry());

		System.out.println(Locale.getDefault().getDisplayLanguage());

		for (String lang : Locale.getISOLanguages()) {
			System.out.println(lang);
		}
		

		for (String country : Locale.getISOCountries()) {
			System.out.println(country);
		}

		
		
		l2 = new Locale("PUNJAB", "INDIA");
		Locale.setDefault(l2);
		System.out.println(l2.getLanguage());
		
		for (Locale l : Locale.getAvailableLocales()) {
			System.out.println(l.getDisplayLanguage() + " .... " + l.getDisplayCountry());
		}
		

	}
}
