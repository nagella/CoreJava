package com.company.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateIntegers {
    public static void main(String args[]){

        List<Integer> list = Arrays.asList(20,30,19,30,20,45,34,56,78,98,82,34,56,98,434,25,61,91,37,45,45,45,45,45);
        Set<Integer> set = new HashSet<>();

        list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
    }
}
