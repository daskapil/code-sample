package com.kapil.learn.java8;

public class MyClass implements Interface1, Interface2 {

    @Override
    public void method1(String str) {
        System.out.println("From Method 1");
    }

    @Override
    public void log(String s) {
        System.out.println("From  default overridden log");
        Interface1.super.log(s);
    }

    @Override
    public void method2(String str) {
        System.out.println("From Method 2");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print("");
        obj.print("abc");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
