package Queries;

import Collections.CreditCardCollections;
import Collections.OwnershipCollections;
import Entities.CreditCard;
import Entities.Customer;
import Entities.Ownership;

public class CustomerCardInfo {

    public void customerToCardInfo(Customer c){
        Ownership o = OwnershipCollections.cardTable.get(c);
        String cardNumber = o.getCardNumber();
        CreditCard targetCard = CreditCardCollections.cardTable.get(cardNumber);
        System.out.println("Card Number: " + targetCard.getNumber() + " Balance: " + targetCard.getCurrentBalance() +
                " Limit: " + targetCard.getCreditLimit());
    }

    public void cardToCardInfo(String cardNumber) {
        CreditCard targetCard = CreditCardCollections.cardTable.get(cardNumber);
        System.out.println("Card Number: " + targetCard.getNumber() + " Balance: " + targetCard.getCurrentBalance() +
                " Limit: " + targetCard.getCreditLimit());
    }
}
