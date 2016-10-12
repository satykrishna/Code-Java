package com.String.example;

import java.util.Arrays;
import java.util.Iterator;

public class TestCustomString {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = "qwerty123qwerty234 and 23";
        String numericNames[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        str = str.replaceAll("[^-?0-9]+", " ");
        
        System.out.println(str);

        // System.out.println(Arrays.asList(str.trim().split(" ")));

        Iterator iterator = Arrays.asList(str.trim().split(" ")).iterator();
        while (iterator.hasNext()) {

            String newNumericWord = (String) iterator.next();
            // System.out.println(newNumericWord);
            int foo = Integer.parseInt(newNumericWord);
            for (int i = 0; i < newNumericWord.length(); i++) {
                char index = newNumericWord.charAt(i);

                System.out.print(numericNames[Character.getNumericValue(index)]);

            }
            
                 System.out.println();
        }

    }

}
