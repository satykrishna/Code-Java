package com.example.PatternMatching;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegularExpression {

    public static Matcher search(String searchString, String text) {
        Matcher matcher = Pattern.compile(searchString).matcher(text);
        return matcher;
    }

    public static void print(Matcher matcher) {

        while (matcher.find()) {
            System.out.println(matcher.start() + " .... " + matcher.group() + "...." + matcher.end());
        }

        System.out.println("======================");
    }

    public static void main(String[] args) {

        String text = "abcdefababababababab1ababijklnmniABCDEF";

        // print(search("abababab", "abcdefabababababababababijklnmni"));

        // either [abc]
        // print(search("[abc]", "dcefbgha"));

        // other than either [abc]
        // print(search("[^abc]", "abcdefabababababababababijklnmniABCDEF"));

        // print [A-Z]
        // print(search("[A-Z]", "abcdefabababababababababijklnmniABCDEF"));

        // print [a-zA-Z]
        // print(search("[a-zA-Z]", search));

        // print any word character [0-9];
        // text += "1234";
        // print(search("[0-9]", text));

        // print any alphanumeric symbol [a-zA-Z0-9]
        // print(search("[a-zA-Z0-9]", text));

        // print only spedcial Characters [^a-zA-Z0-9]
        print(search("[^a-zA-Z0-9]", text + "^!^!^!*(!"));

        // space character \s

        print(search("\\s", text + "  12 19 192 "));

        // Except space \\S
        print(search("\\S", text + "  12 19 192 "));

        // digit character \\d
        print(search("\\d", text + "  12 19 192 "));

        // except digit character \\D
        print(search("\\D", text + "  12 19 192 "));

        // word character \\w
        print(search("\\w", text + " abc def ghi jkl 123 345"));

        // only special Character \\W
        print(search("\\W", text + "> *& ^ ?"));

        // any character
        print(search(".", text + "2202902"));

        // print exactly one character
        print(search("2", text + "2202902"));

        // print at least one character
        print(search("2+", text + "2202902"));

        // print any number of one character
        print(search("2*", "abc2202902"));
        
     // print atmost one character
        print(search("2?", "abc2202902"));
        
     //print any character
        print(search("\\.", "anc"));
        
       String[] split = text.split("AB");
       
       for(String s : split) {
           System.out.println(s);
       }
       
       StringTokenizer tokenizer = new StringTokenizer("A B C");
       
       while(tokenizer.hasMoreTokens()) {
           System.out.println(tokenizer.nextToken());
       }
    }
    
    
    boolean validPhoneNo(String phoneNum) {
        
        String regex = "(0|[+]91)[[7-9]{0-9}{9}";
        
        
        Matcher matcher = Pattern.compile(regex).matcher(phoneNum);
        
        if(matcher.find()) {
            return true;
        }
        
        return false;
        
    }
    
    
    
    
    
    

}
