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
public class Senior extends Customer implements CustomerOperation{

    public Senior() {
    }

    public Senior(Account account) {
        super(account);
    }
    
    public Senior(int Id, String username, String password, int age){
        super(Id,username,password,age);
    }
    
    public void payment(){
        
    }
    
    public void availDiscount(){
    }

    @Override
    public void viewPurchasedMedicines(Pharmacy a) {
        
    }
    
}
