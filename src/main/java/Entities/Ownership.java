package Entities;

public class Ownership {
    private String owner;
    private String cardNumber;
    private Boolean current;

    public Ownership(String owner, String cardNumber, Boolean current) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.current = current;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }
}
