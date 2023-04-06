package com.company.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {

        // Intger Array
        Integer[] array= new Integer[]{1,3,4,8,3,1,5,2,94,5,3,2,7,9,4,3,1};
        List<Integer> inArray=  Arrays.asList(array);
        Set<Integer> inSet= inArray.stream().map(x->x).collect(Collectors.toSet());
        inSet.forEach(System.out::println);

        //order of the elements are n
        List<Integer> intList= inArray.stream().distinct().collect(Collectors.toList());
        System.out.println(intList);

        //String Array
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        List<String> distinctItems = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctItems);
    }
}
