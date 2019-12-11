package com.example.lab3.model;

import java.util.Date;
import static com.example.lab3.generator.IdGenerator.generateUniqueId;

public class SchoolTicket extends Ticket{
    private Date expirationDate;
    private int number;

    public SchoolTicket() {
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
        return "SchoolTicket{" +
                "ID=" + ID +
                ", expirationDate=" + expirationDate +
                ", number=" + number +
                '}' + "\n";
    }
}
