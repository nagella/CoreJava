package com.hydcms.inheritance;

public class Overload {

    public void perform(Object obj){
        System.out.println("With obj as input");
    }

    public void perform(Integer input){
        System.out.println("With Integer as input");
    }
    public void printMessage(){

        System.out.println("Welcome to Printing Machine!");

    }
//Cannot resolve method 'println(void)'
    public static void main(String[] args) {
        Overload ol= new Overload();
        ol.perform(null);
        ol.printMessage();

    }
}
