package com.kapil.preparation.coding;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    static boolean hasPairWithSum(int[] arr, int sum) {
        Set<Integer> complements = new HashSet<>();
        for (int num : arr) {
            if (complements.contains(num)) return true;
            complements.add(sum - num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -1, 9};
        int sum = 8;
        System.out.println(hasPairWithSum(arr, sum));
    }
}
