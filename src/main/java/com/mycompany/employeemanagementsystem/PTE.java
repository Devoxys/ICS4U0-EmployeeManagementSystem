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
public class PTE extends EmployeeInfo {
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    protected PTE(int eN, String fN, String lN, int g, int wL, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, g, wL, dR);
        this.hourlyWage = hW;
        this.hoursPerWeek = hPW;
        this.weeksPerYear = wPY;
    }

    protected PTE(int eN, String fN, String lN, double hW, double hPW, double wPY) {
        super(eN, fN, lN);
        this.hourlyWage = hW;
        this.hoursPerWeek = hPW;
        this.weeksPerYear = wPY;
    }

    public double calcAnnualNetIncome(){
        return this.hourlyWage*this.hoursPerWeek*this.weeksPerYear*(1-this.getDeductionsRate());
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getWeeksPerYear() {
        return weeksPerYear;
    }

    public void setWeeksPerYear(double weeksPerYear) {
        this.weeksPerYear = weeksPerYear;
    }
}
