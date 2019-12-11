package com.example.lab3.controller;

import com.example.lab3.model.*;
import com.example.lab3.view.Constants;

import java.math.BigDecimal;
import java.util.*;

import static com.example.lab3.controller.QuestionYesNoController.questionYesNo;


public class TerminalController {
    private String name;
    private static BigDecimal price;
    static List<Check> register = new ArrayList<Check>(0);

    public TerminalController(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        price.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static void check(Ticket tk){
        if(tk.getClass() == NormalTicket.class){
            if(tk.getMoney().subtract(price).compareTo(BigDecimal.ZERO) >= 0){
                tk.setMoney(tk.getMoney().subtract(price));
                Check tik = new Check(tk.getID(), Constants.GO, Constants.NORMAL_TICKET);
                register.add(tik);
                System.out.println(tk.go());
                return;
            }
            else {
                Check tik = new Check(tk.getID(), Constants.ERROR, Constants.NORMAL_TICKET);
                register.add(tik);
                System.out.println(tk.error());
                return;
            }
        }
        if(tk.getClass() == SchoolTicket.class){
            Date checkDateTerminal = new Date();
            if(tk.getExpirationDate()!= null && tk.getNumber() == 0 && (checkDateTerminal.after(tk.getExpirationDate()))){
                Check tik = new Check(tk.getID(), Constants.GO, Constants.SCHOOL_TICKET);
                register.add(tik);
                System.out.println(tk.go());
                return;
            }
            if(tk.getNumber() > 0 && tk.getExpirationDate() == null){
                tk.setNumber(tk.getNumber() - 1);
                Check tik = new Check(tk.getID(), Constants.GO, Constants.SCHOOL_TICKET);
                register.add(tik);
                System.out.println(tk.go());
                return;
            }
            else{
                Check tik = new Check(tk.getID(), Constants.ERROR, Constants.SCHOOL_TICKET);
                register.add(tik);
                System.out.println(tk.error());
                return;
            }
        }
        if(tk.getClass() == StudentTicket.class){
            Date checkDateTerminal = new Date();
            if(tk.getExpirationDate()!= null && tk.getNumber() == 0 && (checkDateTerminal.after(tk.getExpirationDate()))){
                Check tik = new Check(tk.getID(), Constants.GO, Constants.STUDENT_TICKET);
                register.add(tik);
                System.out.println(tk.go());
                return;
            }
            if(tk.getNumber() > 0 && tk.getExpirationDate() == null){
                tk.setNumber(tk.getNumber() - 1);
                Check tik = new Check(tk.getID(), Constants.GO, Constants.STUDENT_TICKET);
                register.add(tik);
                System.out.println(tk.go());
                return;
            }
            else{
                Check tik = new Check(tk.getID(), Constants.ERROR, Constants.STUDENT_TICKET);
                register.add(tik);
                System.out.println(tk.error());
                return;
            }
        }
    }
    public void checkList(){
        for(int i=0;i<register.size();i++){
            System.out.print(register.get(i));
        }
    }
}
