//https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
package com.hydcms.java8.function;

import java.util.function.Function;
/**
In Java 8, Function is a functional interface;
Function takes an argument (object of type T) and returns an object (object of type R).
The argument and output can be a different type.

 **/
public class FunctionDemo {

    public static void main(String args[]){

        // finding string length
        Function<String,Integer> function= x-> x.length();
        Integer length= function.apply("Maheswar Nagella");
        System.out.println("Length of the given String : "+length);

        // multiply
        Function<Integer,Integer> f1= x->x*4;
        System.out.println("Input 15 and Output 15*4 :"+ f1.apply(15));
        System.out.println("Shortcut to print \"System.out.println()\" in intellij is : sout");

        // concact
        Function<String,String> middleName= x->x+" Reddy";
        Function<String,String> lastName = x->x+ " Nagella";
        String fullName = middleName.andThen(lastName).apply("Maheswar");
        System.out.println("Full Name : " + fullName);

    }
}
