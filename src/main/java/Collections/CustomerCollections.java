package Collections;

import Entities.Customer;

import java.util.HashMap;

public class CustomerCollections {

    public static HashMap<String, Customer> customerTable; //ID => Customer lookup
    public static HashMap<String, String> ssnToId;
    public static HashMap<String, String> idToSsn;


    public CustomerCollections() {
        this.customerTable = new HashMap<String, Customer>();
        this.ssnToId = new HashMap<String, String>();
        this.idToSsn = new HashMap<String, String>();
    }

    public Boolean insertCustomer(Customer c) {
        String ssn = c.getSsn();
        String id = c.getId();
        if (customerTable.get(id) != null) {
            return false;
        } else {
            ssnToId.put(ssn, id);
            idToSsn.put(id, ssn);
            customerTable.put(id, c);
            return true;
        }
    }
}
