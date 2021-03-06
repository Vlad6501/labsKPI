package com.example.lab3.model;

import java.util.Date;
import static com.example.lab3.generator.IdGenerator.generateUniqueId;

public class StudentTicket extends Ticket{
    private Date expirationDate;
    private int number;

    public StudentTicket() {
        this.ID = generateUniqueId();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "StudentTicket{" +
                "ID=" + ID +
                ", expirationDate=" + expirationDate +
                ", number=" + number +
                '}' + "\n";
    }
}
