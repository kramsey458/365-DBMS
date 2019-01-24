package Queries;

import Collections.CustomerCollections;
import Entities.Customer;

public class LocateCustomer {

    public String locateById(String id) {
        Customer customer = CustomerCollections.customerTable.get(id);
        return customer.getName();
    }

    public String locateBySSN(String ssn) {
        String id = CustomerCollections.ssnToId.get(ssn);
        Customer customer = CustomerCollections.customerTable.get(id);
        return customer.getName();
    }
}
