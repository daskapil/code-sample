package com.kapil.learn.functionalprogramming;

/*
 * Demo for ** Anonymous Class ** and ** Lambda **
 *
 * ** Anonymous classes ** are inner classes with no name. Since they have no name,
 * we can't use them in order to create instances of anonymous classes. As a result,
 * we have to declare and instantiate anonymous classes in a single expression at the point of use.
 * We may either extend an existing class or implement an interface.
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

interface CacheIterator {
    boolean hasNext();

    Bookmark next();
}

@FunctionalInterface //optional
interface Test {
    void apply();

    default void defaultMethod() {
    }

    static void staticMethod() {
        System.out.println("SAM or Functional Interface can have static method");
    }

    String toString();
}

interface Add {
    int add(int a, int b);
}

public class Cache {
    private Bookmark[] items;
    private int next = 0;

    public Cache(int size) {
        items = new Bookmark[size];
    }

    public void add(Bookmark item) {
        if (next < items.length)
            items[next++] = item;
    }

    public CacheIterator iterator() {
        return new CacheIteratorImpl();
    }

    private class CacheIteratorImpl implements CacheIterator {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < items.length;
        }

        @Override
        public Bookmark next() {
            return items[i++];
        }
    }

    public void go(Test test) {
        test.apply();
    }

    public void testAdd(Add add) {
        add.add(5, 6);
    }

    public static void main(String[] args) {
        Cache recommendedItems = new Cache(5);

        Bookmark item1 = new Bookmark(2000, "Use Final Liberally", 1.0);
        Bookmark item2 = new Bookmark(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", 2.0);
        Bookmark item3 = new Bookmark(2002, "UInterface vs Abstract Class", 3.0);
        Bookmark item4 = new Bookmark(2003, "NIO tutorial by Greg Travis", 4.0);
        Bookmark item5 = new Bookmark(2004, "Virtual Hosting and Tomcat", 5.0);

        recommendedItems.add(item1);
        recommendedItems.add(item2);
        recommendedItems.add(item3);
        recommendedItems.add(item4);
        recommendedItems.add(item5);

        CacheIterator iterator = recommendedItems.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        //Anonymous Class - implemented Comparator interface
        Arrays.sort(recommendedItems.items, new Comparator<Bookmark>() {
            @Override
            public int compare(Bookmark o1, Bookmark o2) {
                return o1.getRating() < o2.getRating() ? 1 : -1;
            }
        });

        System.out.println("\nSorted by rating (using Anonymous class) ...");
        iterator = recommendedItems.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        /*
         * Lambda - implemented Comparator interface.
         * Lambda can be passed to functional interface only.
         * Comparator is a Functional or SAM interface.
         * */
        Arrays.sort(recommendedItems.items, Comparator.comparing((Bookmark o) -> Integer.valueOf(o.getTitle().length())));
        System.out.println("\nSorted by Titles (using Lambda class) ...");
        iterator = recommendedItems.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        new Cache(5).go(() -> System.out.println("\nTesting SAM interface for lambda"));
        new Cache(5).testAdd((int a, int b) -> a + b);
    }
}
