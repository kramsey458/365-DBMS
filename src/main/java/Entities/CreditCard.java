package Entities;

public class CreditCard {
    private String number;
    private Type type;
    private Double creditLimit;
    private Double currentBalance;
    private Boolean active;

    public CreditCard(String number, Type type, Double creditLimit, Double currentBalance, Boolean active) {
        this.number = number;
        this.type = type;
        this.creditLimit = creditLimit;
        this.currentBalance = currentBalance;
        this.active = active;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
