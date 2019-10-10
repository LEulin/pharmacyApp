package onlinepurchase;

public interface CustomerOperation {
    
    public void purchaseMedicine(Pharmacy a, User e);
    public void viewAvailableMedicinesForCough(MedicinesForCough med);
    public void viewAvailableMedicinesForHeadache(MedicinesForHeadache med);
    public void viewAvailableMedicinesForBodyPain(MedicinesForBodyPain med);
    public void viewAvailableMedicinesForAllergies(MedicinesForAllergies med);
    
    public void viewPurchasedMedicines(Pharmacy a, User e);
}
