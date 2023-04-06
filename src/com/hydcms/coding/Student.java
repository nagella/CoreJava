package com.hydcms.coding;

public class Student implements Comparable<Student>{

    String name;
    int rollno;
    int age;

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getAge() {
        return age;
    }

    Student(int rollno,String name, int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

 /*   @Override
    public int compareTo(Student o) {
      if(age> o.age){
          return 1;
      }else if( age <o.age){
          return -1;
      }else{
          return 0;
      }
    }*/

}
