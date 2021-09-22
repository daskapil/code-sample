package com.kapil.preparation.coding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseObject {

    public static void main(String[] args) {
        String s = "Kapil";
        System.out.println("reverseString(s): " + reverseStringLoop(s));
        System.out.println("reverseStringStringBuilder(s): " + reverseStringStringBuilder(s));

        Object[] array = new String[]{"apples", "tomatoes", "bananas", "guavas", "pineapples"};
        reverseArrayLoop(array);
        reverseStreamAPI(array);
        reverseCollections(array);
    }

    private static String reverseStringLoop(String input) {
        if (input == null) return input;

        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }

    private static String reverseStringStringBuilder(String input) {
        if (input == null) return input;

        return new StringBuilder(input).reverse().toString();
    }

    private static void reverseArrayLoop(Object[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            Object temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void reverseStreamAPI(Object[] array) {
        Object [] reversedArray = IntStream.rangeClosed(1, array.length).mapToObj(i ->array[array.length -i]).toArray();
        System.out.println(Arrays.toString(array));
    }

    private static void reverseCollections(Object[] array) {
        List<Object> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println(list);
    }
}
