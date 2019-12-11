package com.example.lab3.model;

import com.example.lab3.model.Ticket;

public class Check extends Ticket {
    private String check;
    private String type;

    public Check(int ID, String check, String type) {
        this.ID = ID;
        this.check = check;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Check{" + "ID=" + ID + ", check=" + check + ", type=" + type + "}" + "\n";
    }
}
