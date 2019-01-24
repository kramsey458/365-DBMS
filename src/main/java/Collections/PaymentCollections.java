package Collections;

import Entities.CreditCard;
import Entities.Payment;

import java.util.Date;
import java.util.HashMap;

public class PaymentCollections {

    static HashMap<String, Payment> paymentTable;


    public void payoffCard(String cardNumber, Double amount) {
        CreditCard card = CreditCardCollections.cardTable.get(cardNumber);
        card.setCurrentBalance(card.getCurrentBalance() - amount);
        Payment p = new Payment(new Date(), amount,  cardNumber);
    }
}
