package onlinepurchase;

public abstract class Customer extends User implements CustomerOperation {

    private Account account;
    
    public Customer(int id,String userName, String password, int age) {
        super(id,userName,password,age);
    }

    public Customer() {
    }

    public Customer(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //method to purchase
    @Override
    public boolean purchaseMedicine(Medicine name) {

        return true;
    }

    //methods for view available medicines
    @Override
    public void viewAvailableMedicinesForCough(MedicinesForCough med) {

        
    }

    @Override
    public void viewAvailableMedicinesForHeadache(MedicinesForHeadache med) {

        
    }

    @Override
    public void viewAvailableMedicinesForBodyPain(MedicinesForBodyPain med) {

       
    }

    /**
     *
     * @param med
     * @return
     */
    @Override
    public void viewAvailableMedicinesForAllergies(MedicinesForAllergies med) {

    }
    
    public void orderItem(Pharmacy a, User e){
        
    
    }

}
