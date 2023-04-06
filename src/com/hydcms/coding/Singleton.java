package com.hydcms.coding;

public class Singleton {

    private static Singleton ston=null;
    private Singleton(){}

    public static Singleton getInstance(){
        if(null == ston){
            System.out.println("Singleton instace is null,so creating instance first time");
            ston = new Singleton();
        }else{
            printMessage();
        }
        return ston;
    }
    private static void printMessage(){
        System.out.println("Singleton instance is already created");

    }
}

class SingletonDemo{

    public static void main(String args[]){
        Singleton sDemo1= Singleton.getInstance();
        Singleton sDemo2= Singleton.getInstance();
        Singleton sDemo3= Singleton.getInstance();

        System.out.println("sDemo1 hashcode "+sDemo1.hashCode());
        System.out.println("sDemo2 hashcode "+sDemo2.hashCode());
        System.out.println("sDemo3 hashcode "+sDemo3.hashCode());

    }
}
