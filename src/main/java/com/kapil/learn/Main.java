package com.kapil.learn;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inside main method!");
//        arrrays();

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 5);

    }

    //Array
    public static void arrrays() {
        System.out.println("Inside arrays ..");

//        Array initialization - 1:
//        int [] scores= new int[4];
//        scores[0] = 90;
//        scores[1] = 100;
//        scores[2] = 70;
//        scores[3] = 80;

//        Array initialization - 2:
//        int[] scores = new int[] {90, 100, 70, 80};

//        Array initialization - 3:
        int[] scores = {90, 100, 70, 80};
        System.out.println("Scores 0: " + scores[0]);
        System.out.println("Scores 1: " + scores[1]);
        System.out.println("Scores 2: " + scores[2]);
        System.out.println("Scores 3: " + scores[3]);
        System.out.println("Scores  size: " + scores.length);
    }




}
