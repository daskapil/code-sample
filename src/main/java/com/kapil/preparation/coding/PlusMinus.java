package com.kapil.preparation.coding;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {

        double[] counts = new double[3];

        for (Integer num : arr) {
            if (num > 0) {
//               positives++;
                counts[0]++;
            } else if (num < 0) {
//               negatives++;
                counts[1]++;
            } else {
//               zeros++;
                counts[2]++;
            }
        }

//        for (double count : counts) {
//            System.out.println(count);
//            System.out.printf("%.6f %n", count / arr.size());
//        }

        for (double count : counts) {
            DecimalFormat df = new DecimalFormat("######.######");
            System.out.println(df.format(count / arr.size()));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of input: ");
        int elements = scanner.nextInt();
        System.out.println("Number of input: " + elements);

        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNextInt()) {
            System.out.println(arr.size());
            arr.add(scanner.nextInt());
            if (arr.size() == elements)
                break;
        }

        System.out.println("Input array: " + arr);
        plusMinus(arr);
    }
}
