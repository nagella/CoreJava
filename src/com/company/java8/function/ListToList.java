package com.company.java8.function;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ListToList {
    public static void main(String[] args) {

        ListToList ll= new ListToList();
        List<String> list= Arrays.asList("Hyderbad","Banglore","Chennai","Vizag");
        list.forEach(System.out::println);
        List<String> result = ll.convert2List(list,ll::sha256);
        result.forEach(System.out::println);
    }
    public <T,R> List<R> convert2List(List<T> list, Function<T,R> function){

        List<R> myList = new ArrayList<>();
        for(T t:list){
            myList.add(function.apply(t));
        }
        return myList;
    }
    public String sha256(String string){
        return DigestUtils.sha256Hex(string);
    }
}
