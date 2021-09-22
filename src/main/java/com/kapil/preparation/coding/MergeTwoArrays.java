package com.kapil.preparation.coding;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {

    //Stream.of() method
    private static String[] concatenate1 (String[] first, String[] second) {
        return Stream.of(first, second)
                .flatMap(Stream::of) //or Use Arrays::stream
                .toArray(String[]::new);
    }

    // Method to merge two arrays in Java 8 and above
    private static String[] concatenate2 (String[] first, String[] second) {
        return Stream.concat(Arrays.stream(first), Arrays.stream(second))
                                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] first = {"Kapil", "Chaitali"};
        String[] second = {"Ahana"};
        System.out.println(Arrays.toString(concatenate1(first, second)));
        System.out.println(Arrays.toString(concatenate2(first, second)));
    }
}
