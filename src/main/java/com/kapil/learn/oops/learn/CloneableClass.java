package com.kapil.learn.oops.learn;

public class CloneableClass implements Cloneable {
    public CloneableClass clone() {
        try {
            return (CloneableClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
