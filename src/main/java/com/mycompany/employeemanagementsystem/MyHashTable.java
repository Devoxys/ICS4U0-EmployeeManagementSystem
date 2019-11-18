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
import java.util.ArrayList;
import java.util.Arrays;


public class MyHashTable {
    private ArrayList<EmployeeInfo>[] buckets;

    public MyHashTable(int numBuckets){
        buckets = new ArrayList[numBuckets];

        for (int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<EmployeeInfo>();
        }
    }

    public int calcBucket(int employeeNumber) {
        return employeeNumber % buckets.length;
    }

    public void addToTable(EmployeeInfo theEmployee) {
        // Add the student referenced by theStudent to the hash table.
        int b = this.calcBucket(theEmployee.getEmpNumber());
        ArrayList<EmployeeInfo> al = buckets[b];
        al.add(theEmployee);
    }


    public EmployeeInfo removeFromTable(int empNumber) {
        // Remove that student from the hash table and return the reference value for that student.
        // Return null if that student isn't in the table.
        int b = this.calcBucket(empNumber);
        ArrayList<EmployeeInfo> al = buckets[b];
        for (EmployeeInfo s: al){
            if (s.getEmpNumber() == empNumber){
                al.remove(s);
                return s;
            }
        }
        return null;
    }

    public EmployeeInfo getFromTable(int empNumber){
        // Return the reference value for that student, return null if student isn't in the table.
        int b = this.calcBucket(empNumber);
        ArrayList<EmployeeInfo> al = buckets[b];
        for (EmployeeInfo s: al){
            if (s.getEmpNumber() == empNumber){
                return s;
            }
        }
        return null;
    }

    public boolean isInTable(int empNumber) {
        // Return true if that student is in the hash table, false otherwise.
        int b = this.calcBucket(empNumber);
        ArrayList<EmployeeInfo> al = buckets[b];
        for (EmployeeInfo s: al){
            if (s.getEmpNumber() == empNumber){
                return true;
            }
        }
        return false;
    }

    public void displayTable(){
        for (int i = 0; i < buckets.length; i++){
            System.out.println("Bucket " + i);
            ArrayList<EmployeeInfo> al = buckets[i];
            if (al.size() == 0){
                System.out.println("No items in ArrayList");
            }else {
                for (EmployeeInfo s: al){
                    System.out.println(s.getEmpNumber() + " " + s.getFirstName() + " " + s.getLastName());
                }
            }
        }
    }
    
    public ArrayList<EmployeeInfo> getAllFromTable(){
        ArrayList<EmployeeInfo> allEmployeeArrayList = new ArrayList<EmployeeInfo>();
        for (int i = 0; i < buckets.length; i++){
            ArrayList<EmployeeInfo> al = buckets[i];
            for (EmployeeInfo s: al){
                allEmployeeArrayList.add(s);
            }
        }
        return allEmployeeArrayList;
    }
}
