package com.company.java8;
import java.util.ArrayList;

public class ForEach {
public static void main(String args[]){

    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

    for(int i: intArray){
        System.out.println(i);
    }

    ArrayList<Integer> sno = new ArrayList<Integer>();

    sno.add(101);
    sno.add(102);
    sno.add(103);

    sno.forEach(x->System.out.println(x));

}
}
