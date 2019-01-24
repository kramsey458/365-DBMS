package Queries;

import Collections.TransactionCollections;
import Entities.Transaction;

import java.util.Date;
import java.util.Map;

public class LocateTransactions {

    public void findTransactions(Date startDate, Date endDate) {
        for (Map.Entry<Date, Transaction> entry : TransactionCollections.transactionTreeMap.entrySet()) {
            Transaction val = entry.getValue();
            Date key = entry.getKey();
            if (key.before(endDate) && key.after(startDate)){
                System.out.println(val.toString());
            }
        }
    }
}
