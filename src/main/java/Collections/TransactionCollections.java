package Collections;

import Entities.CreditCard;
import Entities.Transaction;

import java.util.Date;
import java.util.TreeMap;

public class TransactionCollections {

    public static TreeMap<Date, Transaction> transactionTreeMap;

    public TransactionCollections() {
        transactionTreeMap = new TreeMap<Date, Transaction>();
    }

    public void createTransaction(Transaction t) {
        Integer cost = t.getCost();
        String card = t.getCardNumber();
        CreditCard customerCard = CreditCardCollections.cardTable.get(card);
        customerCard.setCurrentBalance(customerCard.getCurrentBalance() + cost);
        transactionTreeMap.put(new Date(), t);
    }
}
