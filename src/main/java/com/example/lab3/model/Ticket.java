package com.example.lab3.model;


import com.example.lab3.view.Constants;

import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    protected int ID;

    public Ticket() {
    }

    public int getID() {
        return ID;
    }

    public Date getExpirationDate() {
        return null;
    }

    public void setExpirationDate(Date expirationDate) {
    }

    public int getNumber() {
        return 0;
    }

    public void setNumber(int number) {
    }

    public BigDecimal getMoney() {
        return null;
    }

    public void setMoney(BigDecimal money) {
    }

    public String go(){
        return getID() + ": " + Constants.GO;
    }

    public String error(){
        return getID() + ": " + Constants.ERROR;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ID=" + ID +
                '}';
    }
}
