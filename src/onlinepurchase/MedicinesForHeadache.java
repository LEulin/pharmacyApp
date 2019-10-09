package onlinepurchase;

public class MedicinesForHeadache extends Medicine{

    public MedicinesForHeadache() {
        this(new MedicinesForHeadache());
    }
    
    public MedicinesForHeadache(MedicinesForHeadache med){
        this(med.getID(),med.getBrandname(),med.getGenericname(),med.getType(),med.getPrice(),med.getQuantity());
    }

    public MedicinesForHeadache(int ID, String brandname, String genericname, String type, double price, int quantity) {
        super(ID, brandname, genericname, type, price, quantity);
    }
    
}
