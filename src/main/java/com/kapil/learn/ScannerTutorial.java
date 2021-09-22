package com.kapil.learn;

import java.util.Scanner;

public class ScannerTutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("What is your first name? ");
        String firstName = scanner.next();
        System.out.println("First name: " + firstName);

        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        System.out.println("What is your senior quote? ");
        String quote = scanner.next();
        quote += scanner.nextLine();

        System.out.println("Quote: " + quote);

        System.out.println("Enter number of input: ");
        int elements = scanner.nextInt();
        System.out.println("Number of input: " + elements);
        */

        String line = scanner.nextLine();
        System.out.println("Hello, World.");
        System.out.println(line);
    }
}
