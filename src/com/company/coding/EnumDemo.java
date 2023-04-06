package com.company.coding;

public class EnumDemo {

    public static void main(String args[]) {

        SingletonEnum se=  SingletonEnum.INSTACE;
        SingletonEnum se1=  SingletonEnum.INSTACE;
        SingletonEnum se2=  SingletonEnum.INSTACE;

        System.out.println("se :"+se.hashCode());
        System.out.println("se1 :"+se.hashCode());
        System.out.println("se2 :"+se.hashCode());

    }
}
