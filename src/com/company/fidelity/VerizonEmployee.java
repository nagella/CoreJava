package com.company.fidelity;

public class VerizonEmployee extends Employee {
    int bonus;
    public VerizonEmployee(int id, String name, double sal, int bonus) {
        super(id, name, sal);
        this.bonus = bonus;
    }
}
