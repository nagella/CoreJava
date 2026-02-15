package com.company.fidelity;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class EmpDemo {
    static List<Employee> employees = Arrays.asList(new VerizonEmployee(1, "Mahesh", 120000, 2000), new FidelityEmployee(1, "Ramesh", 11000, 120));

    public static void main(String[] args) {
        Thread thread = new Thread(()-> employees.stream().forEach(System.out::println));
        thread.start();
    }
}
