package com.kapil.learn.java8;
/*
*  Functional Interface or Single Abstract Method (SAM) Interface
* */
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void singleAbstractMethod();

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
