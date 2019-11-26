/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author davidkpeng
 */
public class EmployeeInfo {
    private int empNumber;
    private String firstName;
    private String lastName;
    private int gender;
    private int workLocation;
    private double deductionsRate;
    private String photoPath;

    protected EmployeeInfo(int eN, String fN, String lN, int g, int wL, double dR){
        this.empNumber = eN;
        this.firstName = fN;
        this.lastName = lN;
        if ((g > 2) || (g < 0)){
            g = 2;
        }
        this.gender = g;
        if ((wL > 2) || (wL < 0)){
            wL = 0;
        }
        this.workLocation = wL;
        this.deductionsRate = dR;
    }

    protected EmployeeInfo(int eN, String fN, String lN){
        this.empNumber = eN;
        this.firstName = fN;
        this.lastName = lN;
        this.gender = 0;
        this.workLocation = 0;
        this.deductionsRate = 0;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGender() {
        if ((gender > 2) || (gender < 0)){
            gender = 2;
        }
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(int workLocation) {
        if ((workLocation> 2) || (workLocation < 0)){
            workLocation = 0;
        }
        this.workLocation = workLocation;
    }

    public double getDeductionsRate() {
        return deductionsRate;
    }

    public void setDeductionsRate(double deductionsRate) {
        this.deductionsRate = deductionsRate;
    }
    
    public String getPhotoPath(){
        return photoPath;
    }
    
    public void setPhotoPath(String photoPath){
        this.photoPath = photoPath;
    }
}

