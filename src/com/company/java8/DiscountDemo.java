package com.company.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DiscountDemo {

    public static void main(String[] args) {
        List<Product> listProduct= new ArrayList<Product>();
        Product p1= new Product("iPhone13",1300.00, true);
        Product p2= new Product("iPhone13",1300.00, false);
        Product p3= new Product("iPhone13",1300.00, true);

        listProduct.add(p1);
        listProduct.add(p2);
        listProduct.add(p3);

        Stream<Object> products = listProduct.stream().filter(product-> product.isSaleOrNot()).map(p->p.getPrice()*10/100);

    }
}
