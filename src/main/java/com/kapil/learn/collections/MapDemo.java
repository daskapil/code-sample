package com.kapil.learn.collections;

import com.kapil.learn.Student;

import javax.sound.midi.Soundbank;
import java.util.*;

public class MapDemo {
    private static void hashMapDemo() {
        System.out.println("\n\nInside hashMapDemo ...");

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("John", 25);
        map1.put("Raj", 29);
        map1.put("Anita", null);

        System.out.println(map1);

        map1.put("Anita", 23);
        System.out.println(map1);

        System.out.println("Contains John? " + map1.containsKey("John"));
        System.out.println("Contains value=29? " + map1.containsValue(29));
        System.out.println("John's age: " + map1.get("John"));

        System.out.println("Iterating using keySet ...");
        Set<String> names = map1.keySet();
        names.forEach(name -> System.out.println("Name: " + name + ", Age: " + map1.get(name)));
        int maxAge = map1.values().stream().max(Integer::compare).get();
        System.out.println("Maximum age: " + maxAge);

        System.out.println("Iterating using entrySet ...");
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        entries.forEach(element -> System.out.println("Name: " + element.getKey() + ", Age: " + element.getValue()));

        names.remove("Anita");
        System.out.println(map1);

        //complex map
        Map<String, Map<String, Object>> userProfile = new HashMap<>();

        Map<String, Object> profile = new HashMap<>();
        profile.put("age", 33);
        profile.put("dept", "CS");
        profile.put("city", "New York");

        userProfile.put("Kapil", profile);
        System.out.println(userProfile);

        profile = new HashMap<>();
        profile.put("age", 29);
        profile.put("dept", "CS");
        profile.put("city", "New York");

        userProfile.put("Raj", profile);

        System.out.println("userProfile: " + userProfile);

        Map<String, Object> profile1 = userProfile.get("Kapil");
        int age = (Integer) profile1.get("age");
        System.out.println("Age: " + age);

    }

    private static void getMaxValue() {
        Map<String, String> temp = new HashMap<>();
        temp.put("Mon", "30");
        temp.put("Tue", "20");
        temp.put("Wed", "-1");
        temp.put("Thu", "40");
        temp.put("Fri", "0");
        temp.put("Sat", "10");
        temp.put("Sun", "24");

        int max = temp.values().stream().map(Integer::parseInt).min(Integer::compare).get();

        System.out.println(" Max Temp: " + max);
    }

    /*
     * Demo:
     * 	1. See output with and without commenting get() calls
     *    2. See output when accessOrder=false with get() calls. get calls do not have any influence
     *    3. Finally, change object type from LRUCache to LinkedHashMap and see output.
     *       All 5 mappings will be printed as removeEldestEntry would return false by default
     */
    private static void lruCacheTest() {
        System.out.println("\n\nInside lruCacheTest ...");
        Map<String, String> lruCache = new LRUCache<>(16, 0.75f, true);
        lruCache.put("a", "A");
        lruCache.put("b", "B");
        lruCache.put("c", "C");
        System.out.println(lruCache);

        lruCache.get("a"); // multiple gets to "a" will not make a difference
        lruCache.get("a");
        lruCache.get("a");
        System.out.println(lruCache);
        lruCache.get("b");
        System.out.println(lruCache);

        lruCache.put("d", "D");
        System.out.println(lruCache);
        lruCache.put("e", "E");
        System.out.println(lruCache);
    }


    public static void main(String[] args) {
//        hashMapDemo();
//        getMaxValue();
        lruCacheTest();
    }
}

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    //private static final long serialVersionUID = 6464155743798737431L;
    private static final int MAX_ENTRIES = 3;

    public LRUCache(int initialCapacity,
                    float loadFactor,
                    boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    // Invoked by put and putAll after inserting a new entry into the map
    @Override
    public boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES; // return false; // same as normal linked hash map
    }
}