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
public abstract class Customer extends User implements CustomerOperation {

    private Account account;

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
    //method to pay
    @Override
    public void payment() {

    }

    //methods for view available medicines
    @Override
    public boolean viewAvailableMedicinesForCough(MedicinesForCough med) {

        return true;
    }

    @Override
    public boolean viewAvailableMedicinesForHeadache(MedicinesForHeadache med) {

        return true;
    }

    /**
     *
     * @param med
     * @return
     */
    @Override
    public boolean viewAvailableMedicinesForBodyPain(MedicinesForBodyPain med) {

        return true;
    }

    /**
     *
     * @param med
     * @return
     */
    @Override
    public boolean viewAvailableMedicinesForAllergies(MedicinesForAllergies med) {

        return true;
    }

}
