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
public abstract class Senior extends Customer implements CustomerOperation{

    public Senior() {
    }

    public Senior(Account account) {
        super(account);
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean availDiscount(){
        return true;
    }
    
}
