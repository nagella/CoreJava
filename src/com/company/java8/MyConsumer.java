package com.company.java8;

import java.util.function.Consumer;

//Consumer implementation that can be reused
public class MyConsumer implements Consumer<Integer> {
    public void accept(Integer i) {
        System.out.println(i);

    }
}
