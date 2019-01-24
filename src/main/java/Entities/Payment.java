package Entities;

import java.util.Date;

public class Payment {
    private Date date;
    private Double payment;
    private String cardNumber;

    public Payment(Date date, Double payment, String cardNumber) {
        this.date = date;
        this.payment = payment;
        this.cardNumber = cardNumber;
    }
}
