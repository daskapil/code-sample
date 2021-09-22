package com.kapil.preparation.coding;

import java.util.*;

/*
 * Given 2 arrays, create a function that lets a user know(true/false) whether
 * these two array contain any common items
 * Example:
 * array1 = [a, b, c, d,f]
 * array2 = [x, y, z]
 * should return false
 * ------------------------
 * array1 = [a, b, c, d, f, x]
 * array2 = [x, y, z]
 * should return true
 * */
public class CommonItem {

    // Option: 1
    static boolean hasCommonItemUsingSet(String[] array1, String[] array2) {
        Set<String> array1Set = new HashSet<>(Arrays.asList(array1));
        Set<String> array2Set = new HashSet<>(Arrays.asList(array2));

        final int combinedLength = array1Set.size() + array2Set.size();

        Set<String> mergedSet = new HashSet<>(array1Set);
        mergedSet.addAll(array2Set);

        System.out.println(mergedSet);

        return combinedLength > mergedSet.size();
    }

    // Option: 2
    static boolean hasCommonItemUsingSetStream(String[] array1, String[] array2) {
        Set<String> array1Set = new HashSet<>(Arrays.asList(array1));
        Set<String> array2Set = new HashSet<>(Arrays.asList(array2));
        return array2Set.stream().anyMatch(array1Set::contains);
    }

    // Option: 3
    static boolean hasCommonItemUsingMap(String[] array1, String[] array2) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : array1) {
            map.putIfAbsent(s, true);
        }

        System.out.println(map);
        for (String item : array2) {
            if (map.containsKey(item)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d", "f", "e", "e"};
        String[] array2 = {"x", "y", "z"};

        System.out.println("Has common Item - Using Set: " + hasCommonItemUsingSet(array1, array2));
        System.out.println("Has common Item - Using Set Stream: " + hasCommonItemUsingSetStream(array1, array2));
        System.out.println("Has common Item - Using Map: " + hasCommonItemUsingMap(array1, array2));
    }
}
