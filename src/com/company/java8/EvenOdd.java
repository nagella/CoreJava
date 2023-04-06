package com.company.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                asList(1, 4, 8, 40, 11, 22, 33, 99);

        List<Integer> evenList = numbers.stream().filter(n-> n%2 ==0 ).collect(Collectors.toList());
        System.out.println("Even Numbers List: ");
        evenList.forEach(System.out::println);

        List<Integer> oddList = numbers.stream().filter(n-> n%2 !=0 ).collect(Collectors.toList());

        System.out.println("Odd Numbers List: ");
        oddList.forEach(System.out::println);

        int[] numbers2 = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
        System.out.println(" Array Even Numbers List: ");

        Arrays.stream(numbers2).filter(o -> o % 2 == 0).
                forEach(System.out::println);
        System.out.println("Array Odd Numbers List: ");
        Arrays.stream(numbers2).filter(o -> o % 2 != 0).
                forEach(System.out::println);

        Integer [] numbers3= { 1, 4, 8, 40, 11, 22, 33, 99};

        Set<Integer> numSet= new HashSet(Arrays.asList(numbers3));
        Set<Integer> oddNumbers = numSet.stream().
                filter(o -> o % 2 != 0).
                collect(Collectors.toSet());

        System.out.println("Odd Number Set: ");
        System.out.println(oddNumbers);


        Set<Integer> evenNumber = numSet.stream().
                filter(o -> o % 2 == 0).
                collect(Collectors.toSet());
        System.out.println("Even Number Set: ");
        System.out.println(evenNumber);

        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        Set<Integer> targetSet = new HashSet<Integer>();
        Collections.addAll(targetSet,sourceArray);

        System.out.println("Collections.addAll(targetSet,sourceArray)");
        System.out.println(targetSet);

    }
}
