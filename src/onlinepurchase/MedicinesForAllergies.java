package onlinepurchase;

public class MedicinesForAllergies extends Medicine{

    public MedicinesForAllergies() {
        this(new MedicinesForAllergies());
    }
    
    public MedicinesForAllergies(MedicinesForAllergies med){
        this(med.getID(),med.getBrandname(),med.getGenericname(),med.getType(),med.getPrice(),med.getQuantity());
    }

    public MedicinesForAllergies(int ID, String brandname, String genericname, String type, double price, int quantity) {
        super(ID, brandname, genericname, type, price, quantity);
    }

}
