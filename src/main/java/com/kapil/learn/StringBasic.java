package com.kapil.learn;

import java.util.Arrays;
import java.util.Locale;

/*
* String is
*  - part of java.lang package
*  - immutable
*  - internally represented as Char[]
*  - Zero based
* */
public class StringBasic {
    public static void main(String[] args) {
        stringExamples();
    }

    static void stringExamples() {
        System.out.println("Inside string examples");

        String s = "hello world";

        //basic
        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());

        //compare
        System.out.println("s.equals() = " + s.equals("HELLO WORLD"));
        System.out.println("s.equalsIgnoreCase(\"HELLO WORLD\") = " + s.equalsIgnoreCase("HELLO WORLD"));
        System.out.println("s.compareTo(\"HELLO WORLD\") = " + s.compareTo("HELLO WORLD"));

        //Search
        System.out.println("s.contains(\"HELLO WORLD\") = " + s.contains("HELLO WORLD"));
        System.out.println("s.contains(\"hello world\") = " + s.contains("hello world"));
        System.out.println("s.startsWith(\"HELLO WORLD\") = " + s.startsWith("HELLO WORLD"));
        System.out.println("s.startsWith(\"hello world\") = " + s.startsWith("hello world"));
        System.out.println("s.endsWith(\"d\") = " + s.endsWith("d"));
        System.out.println("s.indexOf(\"lo\") = " + s.indexOf("lo"));
        System.out.println("s.indexOf(\"x\") = " + s.indexOf("x"));
        System.out.println("s.indexOf(\"o\") = " + s.indexOf("o"));
        System.out.println("s.lastIndexOf(\"o\") = " + s.lastIndexOf("o"));

        //Examining individual character
        System.out.println("s.charAt(4) = " + s.charAt(4));

        //Extracting substring
        System.out.println("s.substring(4) = " + s.substring(4)); //From 4th position till the end of the string
        System.out.println("s.substring(4, 9) = " + s.substring(4,9)); //From 4th position till 8th. 4 is inclusive, 9 is exclusive


        //Case conversion. String is immutable, only copy is returned
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());


        System.out.println("s.trim() = " + s.trim());//Returns a copy of the string

        //replace
        System.out.println("s.replaceAll(\"0\", \"r\") = " + s.replaceAll("o", "r"));

        String[] sa = s.split("o");
        Arrays.stream(sa).forEach( System.out::println);

        //Static methods
        System.out.println("String.valueOf(1.5) = " + String.valueOf(1.5));
    }
}
