package com.company.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String args[]) {

    /*
     * Integer class implements Comparable
     * Interface so we can use the sort method
     */

   int [] intArray = new int []{10,4,22,45,12,98,45,99,34,23};
   Arrays.sort(intArray);
   System.out.println(Arrays.toString(intArray));

    /*
     * String class implements Comparable
     * Interface so we can use the sort method
     */
    String[] names= new String[]{"Mahesh","Aanya","Thrinank","Priyanka","Dax","Daisy","Chritha"};
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));

    // However if you want to sort the objects of custom class ex student then you need to implement the Comparable interface in our custom class.

    ArrayList<Student> al = new ArrayList<Student>();
    al.add(new Student(101, "Vijay", 23));
    al.add(new Student(106, "Ajay", 27));
    al.add(new Student(105, "Jai", 21));

    Collections.sort(al);
    for (Student st : al) {
        System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
    }
    }
}
