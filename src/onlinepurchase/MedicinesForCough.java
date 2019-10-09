package onlinepurchase;

public class MedicinesForCough extends Medicine{

    public MedicinesForCough() {
        this(new MedicinesForCough());
    }
    
    public MedicinesForCough(MedicinesForCough med){
        this(med.getID(),med.getBrandname(),med.getGenericname(),med.getType(),med.getPrice(),med.getQuantity());
    }

    public MedicinesForCough(int ID, String brandname, String genericname, String type, double price, int quantity) {
        super(ID, brandname, genericname, type, price, quantity);
    }
    
    
}
