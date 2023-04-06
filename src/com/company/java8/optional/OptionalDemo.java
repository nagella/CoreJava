package com.company.java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        String name = "Nagella";
        Optional<String> opt = Optional.of(name);
        System.out.println(opt.isPresent());

        //String nullaBle = null;
        Optional<String> optNullable = Optional.ofNullable(name);
        System.out.println(optNullable.isPresent());

    }
}
