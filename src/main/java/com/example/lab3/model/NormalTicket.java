package com.example.lab3.model;

import java.math.BigDecimal;
import static com.example.lab3.generator.IdGenerator.generateUniqueId;

public class NormalTicket extends Ticket{
    private BigDecimal money;

    public NormalTicket() {
        this.ID = generateUniqueId();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "NormalTicket{" +
                "ID=" + ID +
                ", money=" + money +
                '}' + "\n";
    }
}
