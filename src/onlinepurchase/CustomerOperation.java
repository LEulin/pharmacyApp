package onlinepurchase;

public interface CustomerOperation {
    
    public boolean purchaseMedicine(Medicine name);
    
    public void viewAvailableMedicinesForCough(MedicinesForCough med);
    public void viewAvailableMedicinesForHeadache(MedicinesForHeadache med);
    public void viewAvailableMedicinesForBodyPain(MedicinesForBodyPain med);
    public void viewAvailableMedicinesForAllergies(MedicinesForAllergies med);
    
    public void viewPurchasedMedicines(Pharmacy a);
}
