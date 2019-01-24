package Entities;

import java.util.Date;

public class Transaction {
    private Date date;
    private String customerId;
    private String cardNumber;
    private String vendorId;
    private Integer cost;

    public Transaction(Date date, String customerId, String cardNumber, String vendorId, Integer cost) {
        this.date = date;
        this.customerId = customerId;
        this.cardNumber = cardNumber;
        this.vendorId = vendorId;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", customerId='" + customerId + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", vendorId='" + vendorId + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
