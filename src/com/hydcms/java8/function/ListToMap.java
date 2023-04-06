package com.hydcms.java8.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ListToMap {
    public static void main(String[] args) {
        ListToMap l2m= new ListToMap();
        List<String> list= Arrays.asList("New Jersey","New York","Marry Land","Virginia");


        Map<String,Integer> map1=  l2m.convertListToMap(list, x -> x.length());
        System.out.println(map1);
        Map<String,Integer> map2 = l2m.convertListToMap(list,l2m::getLength);
        System.out.println(map2);

        System.out.println("**********Identity Function ***********");
        list.stream().map(Function.identity()).forEach(System.out::println);
    }

    public <T,R> Map<T,R> convertListToMap(List<T> list, Function<T,R> function){
        Map<T,R> map= new HashMap<>();
        for(T t:list){
            map.put(t,function.apply(t));
        }
        return map;
    }
    public Integer getLength(String slengh){
        return slengh.length();
    }
}
