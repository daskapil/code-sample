package com.kapil.preparation.coding;

import java.util.Locale;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String s = "tat";
        System.out.println("isPalindromeStringBuilder(" + s + "): " + isPalindromeStringBuilder(s));
        System.out.println("isPalindromeStreamAPI(" + s + "): " + isPalindromeStreamAPI(s));

    }

    private static boolean isPalindromeStreamAPI(String s) {
        String temp = s.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length()/2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    private static boolean isPalindromeStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
