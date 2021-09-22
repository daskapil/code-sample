package com.kapil.preparation;

import java.util.HashMap;
import java.util.Map;

/*
 * How to Create Immutable Class in Java?
 * https://www.journaldev.com/1058/deadlock-in-java-example
 *
 * To create an immutable class in Java, you have to do the following steps:
 *  - Declare the class as final, so it can’t be extended.
 *  - Make all fields private so that direct access is not allowed.
 *  - Don’t provide setter methods for variables.
 *  - Make all mutable fields final so that its value can be assigned only once.
 *  - Initialize all the fields via a constructor performing deep copy.
 *  - Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 * */
public class ImmutableClass {
    private final int id;
    private final String name;
    private final HashMap<String, String> testMap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * Accessor function for mutable objects
     */
    public HashMap<String, String> getTestMap() {
        // return testMap;
        return (HashMap<String, String>) testMap.clone();
    }

    /**
     * Constructor performing Deep Copy
     *
     * @param id
     * @param name
     * @param hm
     */
    public ImmutableClass(int id, String name, HashMap<String, String> hm) {
        System.out.println("Performing Deep Copy for Object initialization");
        this.id = id;
        this.name = name;

        HashMap<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.testMap = tempMap;
    }


    /**
     * Constructor performing Shallow Copy
     *
     * @param id
     * @param name
     * @param hm
     */
    /*public ImmutableClass(int id, String name, HashMap<String, String> hm) {
        System.out.println("Performing Shallow Copy for Object initialization");
        this.id = id;
        this.name = name;
        this.testMap = hm;
    }*/
    public static void main(String[] args) {
        int id = 10;
        String name = "Kapil";
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        ImmutableClass immutableClass = new ImmutableClass(id, name, h1);

        //Let's see whether its copy by field or reference
        System.out.println(name == immutableClass.getName());
        System.out.println(h1 == immutableClass.getTestMap());

        //print the ImmutableClass values
        System.out.println("ImmutableClass id:" + immutableClass.getId());
        System.out.println("ImmutableClass name:" + immutableClass.getName());
        System.out.println("ImmutableClass testMap:" + immutableClass.getTestMap());

        //change the local variable values
        id = 20;
        name = "modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("\nImmutableClass id after local variable change:" + immutableClass.getId());
        System.out.println("ImmutableClass name after local variable change:" + immutableClass.getName());
        System.out.println("ImmutableClass testMap after local variable change:" + immutableClass.getTestMap());

        HashMap<String, String> hmTest = immutableClass.getTestMap();
        hmTest.put("4", "new");

        System.out.println("\nImmutableClass testMap after changing variable from accessor methods:" + immutableClass.getTestMap());
    }
}
