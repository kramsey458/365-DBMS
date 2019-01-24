package Collections;

import Entities.*;

import java.util.HashMap;

public class CreditCardCollections {

    public static HashMap<String, CreditCard> cardTable; //credit card # => card contents
    private CCGen cardNumber = new CCGen();

    public CreditCardCollections() {
        this.cardTable = new HashMap<String, CreditCard>();
    }

    public Boolean createNewCardForCustomer(Customer existing){
        String ccNum = cardNumber.generate("1234", 20);
        CreditCard newCard = new CreditCard(ccNum, Type.VISA, 1000000.0, 0.0, false);
        cardTable.put(ccNum, newCard);
        Ownership newOwnership = new Ownership(existing.getId(),newCard.getNumber(), true);
        OwnershipCollections.cardTable.put(existing, newOwnership);
        return true;
    }

    public Boolean issueDuplicateCardForCustomer(Customer targetCust, CreditCard duplicateCard) {
        Ownership newOwnership = new Ownership(targetCust.getId(), duplicateCard.getNumber(), true);
        OwnershipCollections.cardTable.put(targetCust, newOwnership);
        return true;
    }

    public void cancelCard(Customer target) {
        Ownership targetOwner = OwnershipCollections.cardTable.get(target);
        targetOwner.setCurrent(false);
    }

    public void activateCard(String cardNumber) {
        CreditCard card = cardTable.get(cardNumber);
        card.setActive(true);
    }


}
