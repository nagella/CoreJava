package com.hydcms.coding;

public class FinterfaceDemo {

    public static void main(String args[]){
        Finterface fi = (a,b)->a*b;
        System.out.println(fi.multiply(20,30));
    }
}
