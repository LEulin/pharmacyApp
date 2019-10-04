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
    
    public boolean viewAvailableMedicinesForCough(MedicinesForCough med);
    public boolean viewAvailableMedicinesForHeadache(MedicinesForHeadache med);
    public boolean viewAvailableMedicinesForBodyPain(MedicinesForBodyPain med);
    public boolean viewAvailableMedicinesForAllergies(MedicinesForAllergies med);
    
    public boolean availDiscount();
    
    public void payment();
    
    public void viewPurchasedMedicines();
}
