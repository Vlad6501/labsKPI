package com.example.lab3.controller;

import com.example.lab3.model.NormalTicket;
import com.example.lab3.model.SchoolTicket;
import com.example.lab3.model.StudentTicket;
import com.example.lab3.model.Ticket;
import com.example.lab3.view.Constants;

import javax.xml.bind.SchemaOutputResolver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static com.example.lab3.controller.AddTicketController.checkAddTicket;
import static com.example.lab3.controller.QuestionYesNoController.questionYesNo;
import static com.example.lab3.controller.TerminalController.check;

public class AdminController {
    private String name;
    List<Ticket> ticketList = new ArrayList<Ticket>(0);

    public AdminController(String name) {
        this.name = name;
    }

    public void createTicket(){
        if(questionYesNo(Constants.CREATE_TICKET)){
            addTicket();
            createTicket();
        }
    }

    public void deleteTicket(){
        if(questionYesNo(Constants.DELETE_TICKET)){
            removeTicket();
            deleteTicket();
        }
    }

    public void addTicket(){
        String checkTicket = checkAddTicket();
        if(checkTicket.equals(Constants.SCHOOL)){
            Ticket ticket = new SchoolTicket();
            if(questionYesNo(Constants.MONTH_CHECK)){
                Date checkDate = new Date();
                ticket.setExpirationDate(checkDate);
                ticket.setNumber(0);
            }
            else {
                System.out.printf(Constants.HOW_TRIPS);
                Scanner scanner = new Scanner(System.in);
                int checkSchoolTicketNumber = scanner.nextInt();
                ticket.setNumber(checkSchoolTicketNumber);
                ticket.setExpirationDate(null);
            }
            ticketList.add(ticket);
            return;
        }

        if(checkTicket.equals(Constants.STUDENT)){
            Ticket ticket = new StudentTicket();
            if(questionYesNo(Constants.MONTH_CHECK)){
                Date checkDate = new Date();
                ticket.setExpirationDate(checkDate);
                ticket.setNumber(0);
            }
            else {
                System.out.printf(Constants.HOW_TRIPS);
                Scanner scanner = new Scanner(System.in);
                int checkSchoolTicketNumber = scanner.nextInt();
                ticket.setNumber(checkSchoolTicketNumber);
                ticket.setExpirationDate(null);
            }
            ticketList.add(ticket);
            return;
        }
        if(checkTicket.equals(Constants.NORMAL)){
            Ticket ticket = new NormalTicket();
            System.out.printf(Constants.HOW_MONEY);
            Scanner scanner = new Scanner(System.in);
            BigDecimal checkNormalTicket = scanner.nextBigDecimal();
            checkNormalTicket.setScale(2, BigDecimal.ROUND_HALF_UP);
            ticket.setMoney(checkNormalTicket);
            ticketList.add(ticket);
            return;
        }
    }

    public void removeTicket(){
        System.out.printf(Constants.WHICH_TICKET_DELETE);
        Scanner scanner = new Scanner(System.in);
        Integer checkRemoveTicket = scanner.nextInt();
        for(Ticket t : ticketList){
            if(t.getID() == checkRemoveTicket){
                ticketList.remove(t);
                System.out.printf(Constants.REMOVE);
                return;
            }

        }
        System.out.printf(Constants.NO_TICKET);
    }

    public void goAll(){
        for(Ticket t : ticketList){
            boolean stop = true;
            while (stop){
                boolean ch = questionYesNo(Constants.GO_TICKET);
                if(!ch){
                    stop = false;
                    System.out.printf("Next ticket."+ "\n");
                }
                if(ch){
                    check(t);
                }
            }
        }
    }

    public void allList(){
        for(int i=0;i<ticketList.size();i++){
            System.out.print(ticketList.get(i));
        }
    }
}
