package com.company.fidelity;

public class FidelityEmployee extends Employee{
    int numOfStocks ;

    public FidelityEmployee(int id, String name, double sal, int numOfStocks) {
        super(id, name, sal);
        this.numOfStocks = numOfStocks;
    }
}
