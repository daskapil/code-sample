package com.kapil.preparation.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        System.out.println(arr);

        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(sum);
        System.out.println("Min = " + (sum - max));
        System.out.println("Max = " + (sum - min));

    }

    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            miniMaxSum(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
