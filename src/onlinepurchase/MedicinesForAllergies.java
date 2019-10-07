/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchase;

/**
 *
 * @author 2ndyrGroupB
 */
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
