package com.kapil.learn.java8;
/*
*  Interface - default and static interface
* */
public interface Interface1 {

    void method1(String str);

    default void log(String s) {
        System.out.println("Logging" + s);
    }

    default void print(String s) {
        if(isNull(s)){
            System.out.println("My Data print: " + s);
        }
    }

    static boolean isNull(String s) {
        System.out.println("Interface Null check");
        return s == null ? true : "".equals(s)? true: false;
    }
}
