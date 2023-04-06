package com.company.arraylist;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        ArrayList<String> al= new ArrayList<>();
            al.add("Vijay");
            al.add("Tara");
            al.add("kavi");
            al.add("Venkatesh");
            al.add("Siva");
            al.add("Kodi");
            al.add("kavi");
            al.add("Tara");
            al.add("Vijay");
            al.add("kavi");

       //Remove Duplicates from Array - using java8
        System.out.println("Remove Duplicates Strings from Array - using Java8");
        List<String> uniqueList = al.stream().distinct().collect(Collectors.toList());
        uniqueList.forEach(System.out::println);

        ArrayList<Integer> intArrayList= new ArrayList<>();
            intArrayList.add(23);
            intArrayList.add(34);
            intArrayList.add(56);
            intArrayList.add(23);
            intArrayList.add(67);
            intArrayList.add(23);
            intArrayList.add(23);
            intArrayList.add(234);
            intArrayList.add(23);
            intArrayList.add(45);

        //Remove Duplicate integers from Array -using Java8
        System.out.println("Remove Duplciate integers from Array -using Java8");
        List<Integer> uniInt= intArrayList.stream().distinct().collect(Collectors.toList());
        uniInt.forEach(System.out::println);

        //Remove the duplicate integers using plain java without preserving order
        List<Integer> listWithDuplicates = Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0);
        List<Integer> listWithOutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));

        System.out.println("Remove the duplicate integers using plain java without preserving order");
        listWithOutDuplicates.forEach(System.out::println);

        //Remove the duplicate integers by preserving order
        List<Integer> intList = Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0,4,67,87,89,23,32,12,4,2,6,8,9,3,5,5,12,12,5,8,89);
        List<Integer> withOutDup = new ArrayList<>(new LinkedHashSet<>(intList));

        System.out.println("Remove the duplicate integers by preserving order");
        withOutDup.forEach(System.out::println);

        //Remove the duplicates using Plain Java - clear and addAll
        System.out.println("Remove the duplicates using Plain Java");
        List<String> originalList = new ArrayList<>();
            originalList.add("A");
            originalList.add("B");
            originalList.add("C");
            originalList.add("C");
            originalList.add("B");
            originalList.add("A");

            Set<String> set= new LinkedHashSet<>();
            set.addAll(originalList);
            originalList.clear();
            originalList.addAll(set);
            originalList.forEach(System.out::println);
    }
}
