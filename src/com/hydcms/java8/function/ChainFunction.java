package com.hydcms.java8.function;

import java.util.function.Function;

public class ChainFunction {

    public static void main(String args[]){

        Function<String,Integer> f1= x->x.length();
        Function<Integer,Integer> f2= x->x*2;
        Function<Integer,Integer> f3= x->x*100;
        Integer cfLength= f1.andThen(f2).andThen(f3).apply("Maheswar Nagella");
        System.out.println("Chain Function Output -> "+cfLength);
    }
}
