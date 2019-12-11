package com.example.lab3;

import com.example.lab3.controller.AdminController;
import com.example.lab3.controller.TerminalController;
import com.example.lab3.model.Ticket;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Lab_3 {
    public static void main(String[] args){
        AdminController a1 = new AdminController("a1");
        TerminalController t1 = new TerminalController("t1", new BigDecimal(8));
        a1.createTicket();
        a1.goAll();
        a1.deleteTicket();
        t1.checkList();
        a1.allList();
    }
}