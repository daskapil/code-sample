package com.kapil.preparation.coding;

public class Recursion {

    public static void countBackwards(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            countBackwards(--n);
        }
    }

    // Factorial
    // Formula: n! = n * (n - 1)!
    // 0! = 1
    // 1! = 1
    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }

    /*
     * Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
     *
     * FIn mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence,
     * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,[1]
     * F_{0} = 0, F_{1} = 1
     * and
     * F_{n} = F_{n-1} + F_{n-2}
     * for n > 1.
     */
    public static long fibonacci(int index) {
        if (index == 0) return 0;
        if (index <= 2) return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    public static void main(String[] args) {
//        countBackwards(15);
//        System.out.println(factorial(0));
        int index = 8;
        for (int i = 0; i <= index; i++) {
            System.out.println("F_{" + i + "}: " + fibonacci(i));
        }

    }
}
