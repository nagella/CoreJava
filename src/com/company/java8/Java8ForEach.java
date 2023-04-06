package com.company.java8;
import java.util.*;

import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {

    public static void main(String args[]){
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            myList.add(i);
        }
        //traversing using Iterator
        Iterator<Integer> iterator= myList.iterator();
        while (iterator.hasNext()){
            Integer j= iterator.next();
            if(j !=0) {
                System.out.println(j);
            }
        }
        //traversing through forEach method of Iterable with anonymous class
        System.out.println("Iterable with anonymous class:");
        myList.forEach( new Consumer<Integer>() {
            public void accept(Integer i){
                System.out.println(i);
            }
        });
        //traversing with Consumer interface implementation
        MyConsumer mc= new MyConsumer();
        System.out.println("MyConsumer Class:");
        myList.forEach(mc);
}
}
