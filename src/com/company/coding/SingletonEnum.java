package com.company.coding;

public enum SingletonEnum {
    INSTACE;
    private SingletonEnum(){
        System.out.println("Private Constructor");
    }
}

