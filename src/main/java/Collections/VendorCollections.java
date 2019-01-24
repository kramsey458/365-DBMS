package Collections;

import Entities.CreditCard;
import Entities.Vendor;

import java.util.HashMap;

public class VendorCollections {

    static HashMap<Integer, Vendor> vendorTable; //credit card # => card contents

    public VendorCollections() {
        this.vendorTable = new HashMap<Integer, Vendor>();
    }

    public void addNewVendor(Vendor v) {
        vendorTable.put(v.getId(), v);
    }

}
