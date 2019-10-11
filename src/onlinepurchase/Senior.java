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
    
    public void paymentWithDiscout(Pharmacy a, User e){
        Customer c = ((Customer)e);
        c.viewMyOrders(a, e);
        System.out.print("Enter Order ID to pay: ");
        int orderid = input.nextInt();
        for(int i = 0; i<a.getOrderList().size();i++){
            if(a.getOrderList().get(i).getId() == orderid && a.getOrderList().get(i).getUserId() == c.getId()){
                double amount = a.getOrderList().get(i).getPrice()*.8;
                System.out.println("You're payment is now discounted by 20% and the amount now is: "+amount);
                System.out.print("Enter payment: ");
                double cash = input.nextDouble();
                if((cash-amount) == 0){
                    System.out.println("Your money is exact!\nThank you for paying!");
                    for(int j = 0; j<a.getMedForAllergies().size();j++){
                        if(a.getOrderList().get(i).getMedName().equals(a.getMedForAllergies().get(j).getBrandname())){
                            Medicine med = a.getMedForAllergies().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){
                                a.getMedForAllergies().remove(med);
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
                                med.setQuantity(med.getQuantity() - a.getOrderList().get(i).getQty());
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now updated!");
                            }
                            else {
                                System.out.println("Insufficient stock!");
                            }                     
                        }
                    }
                    for(int j = 0; j<a.getMedForHeadache().size();j++){
                        if(a.getOrderList().get(i).getMedName().equals(a.getMedForHeadache().get(j).getBrandname())){
                            Medicine med = a.getMedForHeadache().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){
                                a.getMedForHeadache().remove(med);
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
                                med.setQuantity(med.getQuantity() - a.getOrderList().get(j).getQty());
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now updated!");
                            }
                            else {
                                System.out.println("Insufficient stock!");
                            }                     
                        }
                    }
                    for(int j = 0; j<a.getMedForBodyPain().size();j++){
                        if(a.getOrderList().get(i).getMedName().equals(a.getMedForBodyPain().get(j).getBrandname())){
                            Medicine med = a.getMedForBodyPain().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){
                                a.getMedForBodyPain().remove(med);
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
                                med.setQuantity(med.getQuantity() - a.getOrderList().get(j).getQty());
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now updated!");
                            }
                            else {
                                System.out.println("Insufficient stock!");
                            }                     
                        }
                    }
                    for(int j = 0; j<a.getMedForCough().size();j++){
                        if(a.getOrderList().get(i).getMedName().equals(a.getMedForCough().get(j).getBrandname())){
                            Medicine med = a.getMedForCough().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){
                                a.getMedForCough().remove(med);
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
                                med.setQuantity(med.getQuantity() - a.getOrderList().get(j).getQty());
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now updated!");
                            }
                            else {
                                System.out.println("Insufficient stock!");
                            }                     
                        }
                    }
                    
                    
                }
                else if((cash-amount)>0){
                    System.out.println("Thank you for paying! \nYour change is: "+(cash-amount));
                    a.getOrderList().remove(a.getOrderList().get(i));
                
                }
                else {
                    System.out.println("Money is insufficient!");
                }
            }
        }
        
    }

    @Override
    public void viewPurchasedMedicines(Pharmacy a, User e) {
        System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %20s %10s %10s", "Order ID", "|", "User ID", "|", "Medicine ID", "|", "Medicine Name", "|", "Quantity", "|", "Price\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < a.getOrderList().size(); i++) {
            if(a.getOrderList().get(i).getUserId() == e.getId()){
                System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %20s %10s %10s \n", a.getOrderList().get(i).getId(), "|", a.getOrderList().get(i).getUserId(), "|", a.getOrderList().get(i).getMedId(), "|", a.getOrderList().get(i).getMedName(), "|", a.getOrderList().get(i).getQty(), "|", a.getOrderList().get(i).getPrice());
            }           
        }
    }

    @Override
    public void purchaseMedicine(Pharmacy a, User e) {
        int size = a.getOrderList().size()+1;
        Orders b = new Orders();
        e.allMedicines(a);
        System.out.println("1. Headache\n2. Allerges\n3. Body Pain\n4. Cough");
        System.out.print("Enter medicine type to purchase: ");
        int choice = input.nextInt();
        if(choice == 1){
            int count = 0;
            System.out.print("Choose medicine by ID: ");
            int choose = input.nextInt();
            for(int i = 0; i<a.getMedForHeadache().size();i++){
                if(choose == a.getMedForHeadache().get(i).getID()){
                    System.out.print("Enter quantity: ");
                    int qty = input.nextInt();
                    if(qty > a.getMedForHeadache().get(i).getQuantity()){
                        System.out.println("Insufficient stock to order!");
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForHeadache().get(i).getID(),a.getMedForHeadache().get(i).getBrandname(),qty,a.getMedForHeadache().get(i).getPrice()*qty);
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }               
                } 
                count++;
            }
            if(count == a.getMedForHeadache().size()){
                System.out.println("Error! No existing order!");
            }
        }
        else if(choice == 2){
            int count = 0;
            System.out.print("Choose medicine by ID: ");
            int choose = input.nextInt();
            for(int i = 0; i<a.getMedForAllergies().size();i++){
                if(choose == a.getMedForAllergies().get(i).getID()){
                    System.out.print("Enter quantity: ");
                    int qty = input.nextInt();
                    if(qty > a.getMedForAllergies().get(i).getQuantity()){
                        System.out.println("Insufficient stock to order!");
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForAllergies().get(i).getID(),a.getMedForAllergies().get(i).getBrandname(),qty,a.getMedForAllergies().get(i).getPrice()*qty);
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }              
                }
                count++;
            }
            if(count == a.getMedForAllergies().size()){
                System.out.println("Error! No existing order!");
            }
        }
        else if(choice == 3){
            int count = 0;
            System.out.print("Choose medicine by ID: ");
            int choose = input.nextInt();
            for(int i = 0; i<a.getMedForBodyPain().size();i++){
                if(choose == a.getMedForBodyPain().get(i).getID()){
                    System.out.print("Enter quantity: ");
                    int qty = input.nextInt();
                    if(qty > a.getMedForBodyPain().get(i).getQuantity()){
                        System.out.println("Insufficient stock to order!");
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForBodyPain().get(i).getID(),a.getMedForBodyPain().get(i).getBrandname(),qty,a.getMedForBodyPain().get(i).getPrice()*qty);
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }               
                }
                count++;
            }
            if(count == a.getMedForBodyPain().size()){
                System.out.println("Error! No existing order!");
            }
        }
        else if(choice == 4){
            int count = 0;
            System.out.print("Choose medicine by ID: ");
            int choose = input.nextInt();
            for(int i = 0; i<a.getMedForCough().size();i++){
                if(choose == a.getMedForCough().get(i).getID()){
                    System.out.print("Enter quantity: ");
                    int qty = input.nextInt();
                    if(qty > a.getMedForCough().get(i).getQuantity()){
                        System.out.println("Insufficient stock to order!");
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForCough().get(i).getID(),a.getMedForCough().get(i).getBrandname(),qty,a.getMedForCough().get(i).getPrice()*qty);
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }
                }
                count++;
            }
            if(count == a.getMedForCough().size()){
                System.out.println("Error! No existing order!");
            }
        }
        else {
            System.out.println("Invalid choice!");
        }      
    }
}
