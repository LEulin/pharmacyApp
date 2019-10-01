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
public interface CustomerTransaction {
    
    public boolean purchaseMedicine(String med_name);
    public void viewAvailableMedicines();
    public boolean availDiscount();
    public void payment();
    public void viewPurchasedMedicines();
}
