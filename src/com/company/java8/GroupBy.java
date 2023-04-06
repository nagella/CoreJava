package com.company.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<Employee> ();
        createEmployee(employeeList);

        Map<String, List<Employee>> empMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));
        empMap.forEach((key,value)->System.out.println("City"+key+" Value "+value));

    }

    private static void createEmployee(List<Employee> employeeList) {

        Employee e1= new Employee();
        e1.setName("Mahesh");
        e1.setCity("Edison");
        e1.setCity("303964");

        Employee e2= new Employee();
        e2.setName("Siva");
        e2.setCity("Edison");
        e2.setCity("303965");

        Employee e3= new Employee();
        e3.setName("Satheesh");
        e3.setCity("Edison");
        e3.setCity("303966");

        Employee e4= new Employee();
        e4.setName("Naveen");
        e4.setCity("Piscataway");
        e4.setCity("303967");

        Employee e5= new Employee();
        e5.setName("Harish");
        e5.setCity("Piscataway");
        e5.setCity("303968");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

    }
}
