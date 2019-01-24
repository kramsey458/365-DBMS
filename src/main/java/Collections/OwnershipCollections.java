package Collections;

import Entities.CreditCard;
import Entities.Customer;
import Entities.Ownership;

import java.util.HashMap;

public class OwnershipCollections {

    public static HashMap<Customer, Ownership> cardTable; //customer id => cc ownership

    public OwnershipCollections() {
        this.cardTable = new HashMap<Customer, Ownership>();
    }
}
