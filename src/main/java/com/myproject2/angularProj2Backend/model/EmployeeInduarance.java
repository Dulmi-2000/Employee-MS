package com.myproject2.angularProj2Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class EmployeeInduarance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

       private int id;
       private String firstName;
       private String lastName;
       private String designation;
       private String insuranceBalance;
       private String rbtProgress;
       private String avatar;

    public EmployeeInduarance() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getInsuranceBalance() {
        return insuranceBalance;
    }

    public void setInsuranceBalance(String insuranceBalance) {
        this.insuranceBalance = insuranceBalance;
    }

    public String getRbtProgress() {
        return rbtProgress;
    }

    public void setRbtProgress(String rbtProgress) {
        this.rbtProgress = rbtProgress;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public EmployeeInduarance(int id, String firstName, String lastName, String designation, String insuranceBalance, String rbtProgress, String avatar) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.insuranceBalance = insuranceBalance;
        this.rbtProgress = rbtProgress;
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "EmployeeInduarance{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", insuranceBalance='" + insuranceBalance + '\'' +
                ", rbtProgress='" + rbtProgress + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}

