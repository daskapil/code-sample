package com.kapil.learn.java8;

public class MethodReference {
    public static void main(String[] args) {

        // SAM implementation using Lambda expression
        FunctionalInterfaceDemo f = () -> System.out.println("Implementation of Single Abstract Method (SAM)");
        f.singleAbstractMethod(); // calling the SAM

        // SAM implementation using Method reference - Re-usability of existing method.
        // Method Reference can be used to replace lambda expression
        FunctionalInterfaceDemo functionalInterfaceDemo = Test::testImplementation;
        functionalInterfaceDemo.singleAbstractMethod();
    }
}

class Test {
    static void testImplementation() {
        System.out.println("This is a test implementation - using method reference");
    }
}
