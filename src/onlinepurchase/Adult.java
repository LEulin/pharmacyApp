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
public class Adult extends Customer{

    public Adult() {
    }

    public Adult(Account account) {
        super(account);
    }
    
    public Adult(int Id, String username, String password, int age){
        super(Id,username,password,age);
    }
    
    public void payment(){
        
    }

    @Override
    public void viewPurchasedMedicines(Pharmacy a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
