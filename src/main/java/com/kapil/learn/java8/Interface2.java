package com.kapil.learn.java8;

public interface Interface2 {

    void method2(String str);

    default void log(String s) {
        System.out.println("Logging" + s);
    }
}
