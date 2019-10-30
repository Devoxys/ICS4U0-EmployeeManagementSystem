/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author davidkpeng
 */
public class FTE extends EmployeeInfo {
    private double annualSalary;

    public FTE(int eN, String fN, String lN, int g, int wL, double dR, double aS) {
        super(eN, fN, lN, g, wL, dR);
        this.annualSalary = aS;
    }

    public FTE(int eN, String fN, String lN, double aS) {
        super(eN, fN, lN);
        this.annualSalary = aS;
    }

    public double calcAnnualNetIncome(){
        return this.annualSalary*(1-this.getDeductionsRate());
    }

    @Override
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}

