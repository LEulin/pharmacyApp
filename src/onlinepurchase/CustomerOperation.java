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
public interface CustomerOperation {
    
    public boolean purchaseMedicine(Medicine name);
    
    public void viewAvailableMedicinesForCough(MedicinesForCough med);
    public void viewAvailableMedicinesForHeadache(MedicinesForHeadache med);
    public void viewAvailableMedicinesForBodyPain(MedicinesForBodyPain med);
    public void viewAvailableMedicinesForAllergies(MedicinesForAllergies med);
    
    public void viewPurchasedMedicines(Pharmacy a);
}
