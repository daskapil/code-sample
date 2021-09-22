package com.kapil.designpattern;

/*
 * Singleton class is a class of which only one instance
 * can be created at given time in one JVM
 */
public class SingletonClass {
    private static SingletonClass single_instance = null;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonClass();
        }

        return  single_instance;
    }
}
