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
public interface PharmacistOperation {
    public boolean addMedicineForCough(MedicinesForCough med);
    public boolean addMedicineForHeadache(MedicinesForHeadache med);
    public boolean addMedicineForBodypain(MedicinesForBodyPain med);
    public boolean addMedicineForAllergies(MedicinesForAllergies med);
    
    public boolean removeMedicineForCough(MedicinesForCough med);
    public boolean removeMedicineForHeadache(MedicinesForHeadache med);
    public boolean removeMedicineForBodyPain(MedicinesForBodyPain med);
    public boolean removeMedicineForAllergies(MedicinesForAllergies med);
    
    public void displayAvailableMedicinesForCough();
    public void displayAvailableMedicinesForHeadache();
    public void displayAvailableMedicinesForBodypain();
    public void displayAvailableMedicinesForAllergies();
}
