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
public interface PharmacistTransaction {
    public boolean addMedicine(Medicine m);
    public boolean removeMedicine(Medicine m);
    public void displayAvailableMedicines();
    public void viewCustomerPurchased();
}
