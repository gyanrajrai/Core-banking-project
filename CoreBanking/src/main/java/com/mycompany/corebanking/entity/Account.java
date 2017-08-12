/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.corebanking.entity;

import java.util.Date;

/**
 *
 * @author Admin_GYAN
 */
public class Account {

    private int Id;
    private String Name, description;
    private float interest;
    private int  MinimumBalance;
    private Date addedDate, ModifiedDate;
    private boolean Status;

    public Account(int Id, String Name, String description, float interest, int MinimumBalance, boolean Status) {
        this.Id = Id;
        this.Name = Name;
        this.description = description;
        this.interest = interest;
        this.MinimumBalance = MinimumBalance;
        this.Status = Status;
    }

    

    public Account() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getMinimumBalance() {
        return MinimumBalance;
    }

    public void setMinimumBalance(int MinimumBalance) {
        this.MinimumBalance = MinimumBalance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(Date ModifiedDate) {
        this.ModifiedDate = ModifiedDate;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

}
