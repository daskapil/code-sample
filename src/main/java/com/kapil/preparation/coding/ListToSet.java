package com.kapil.preparation.coding;

import java.util.*;
import java.util.stream.Collectors;

/*
* Input : [[1, 2, 1], [1, 2, 3], [2, 2, 2, 2], [0]] --> List
* Output : [{1, 2}, {1, 2, 3}, {2}, {0}] --> Set
* */
public class ListToSet {
    public static void main(String[] args) {
        List<List<Integer>> complexList = new ArrayList<>();
        Collections.addAll(complexList,
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 2, 3),
                Arrays.asList(2, 2, 2, 2),
                Arrays.asList(0));
//        complexList.add(Arrays.asList(1, 2, 1));
//        complexList.add(Arrays.asList(1, 2, 3));
//        complexList.add(Arrays.asList(2, 2, 2, 2));
//        complexList.add(Arrays.asList(0));
        System.out.println("INPUT: "+ complexList);
        listToSet(complexList);
    }

    private static void listToSet(List<List<Integer>> complexList) {
        Set<Set<Integer>> resultSet = new HashSet<>();
        Iterator<List<Integer>> iterator = complexList.listIterator();

        while(iterator.hasNext()) {
            List<Integer> element = iterator.next();
            Set<Integer> result = new HashSet<>(element);
            resultSet.add(result);
        }

        System.out.println("OUTPUT: " + resultSet);
    }

}
