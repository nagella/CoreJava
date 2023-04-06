package com.company.java8;

public class Product {

    public String name;
    public Double price;
    public boolean saleOrNot;

    public Product(String name, Double price, boolean saleOrNot) {
        this.name = name;
        this.price = price;
        this.saleOrNot = saleOrNot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isSaleOrNot() {
        return saleOrNot;
    }

    public void setSaleOrNot(boolean saleOrNot) {
        this.saleOrNot = saleOrNot;
    }
}
