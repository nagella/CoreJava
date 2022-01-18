package com.nagella.core.arrays;
public class ArraySort {

    public static void main(String args[]){

        int array[] = new int[]{22,45,89,11,06,98};

        int temp=0;
        for(int i=0; i < array.length;i++){
            for(int j=i;j < array.length;j++)
            {
                if( array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int a: array){
            System.out.println(a);
        }
    }
}
