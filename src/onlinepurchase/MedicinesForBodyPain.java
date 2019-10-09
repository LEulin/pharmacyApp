package onlinepurchase;

public class MedicinesForBodyPain extends Medicine{

    public MedicinesForBodyPain() {
        this(new MedicinesForBodyPain());
    }
    
    public MedicinesForBodyPain(MedicinesForBodyPain med){
        this(med.getID(),med.getBrandname(),med.getGenericname(),med.getType(),med.getPrice(),med.getQuantity());
    }

    public MedicinesForBodyPain(int ID, String brandname, String genericname, String type, double price, int quantity) {
        super(ID, brandname, genericname, type, price, quantity);
    }
    
}
