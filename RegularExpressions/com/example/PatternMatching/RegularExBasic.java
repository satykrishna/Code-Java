package com.example.PatternMatching;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExBasic {

	
	public static void main(String[] args) {
//		int count = 0;
//		String regex = "[^abc]";
//		String searchString = "abcabbacbab";
//		Pattern p  = Pattern.compile(regex);
//		Matcher m = p.matcher(searchString);
//		
//		while(m.find()) {
//			System.out.println(m.start() + " ...... " + m.end()+" ..... "  + m.group());
//			++count;
//		}
//		
//		System.out.println("Total number of matches or " +
//				"occurences " + count);
//		
//		Matcher m1 = Pattern.compile("kaka").matcher("kaka is great foot baller ");
//		
//		while(m1.find()) {
//			System.out.println(m1.group());
//		}
		String str = "a7b k@9z";
//		
//		search("[abc]", str);
//		search("[^abc]", str);
//		search("[a-z]", str);
//		search("[^a-z]", str);
//		search("[0-9]", str);
//		search("[a-z0-9A-Z ]", str);
//		search("[^a-zA-Z0-9]", str);
//		search("[a-c]", str);
//		search("\\s", str);
//		search("\\S", str);
//		search("\\d", str);
//		search("\\D", str);
//		search("\\w", str);
//		search("\\W", str);
//		search(".", str);
//		
//	
//		
//		str = "abaabaaab";
//		
//		search("a", str);
//		search("a+", str);
//		search("a?", str);
//		search("a*", str);
//		
//		str = "Durga software solutions";
//		
//		String[] arr = split("\\.", "http://qes5mq1#qes6mq1#qes5mq4.gxs.online.com");
//        String []strings = split("//", arr[0]);
//        System.out.println(strings[1]);
//        String[] hostNames = split("#", strings[1]);
//        for(String s1: hostNames) {
//        	System.out.println(s1);
//        }
//		
//		
		
//		String[] split = "Durga software solutions".split("\\s");
//		
//		for(String s : split) {
//		System.out.println(s);
//		}
//		str = "http://localhost1!localhost2.gxs.com";
//		
//		search("a", str);
		
	    String s = "19-12-2015";	
		StringTokenizer st = new StringTokenizer("Durga software solutions");
	    StringTokenizer t = new StringTokenizer(s, "-");
		
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
	}
	
	
    public static String[] split(String pattern, String text) {
    	return Pattern.compile(pattern).split(text);
    }


	public static void search(String pattern, String text) {
		
		Matcher m = Pattern.compile(pattern).matcher(text);
		
		while(m.find()) {
			
			System.out.println(m.start() + " .... " + (m.end()-1) + " ... " + m.group());
		}
		
		System.out.println("Done!!!!!!!!");
	}
	
	
}
