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
    
    public void payment(Pharmacy a, User e){
        Customer c = ((Customer)e);
        c.viewMyOrders(a, e);
        System.out.print("Enter Order ID to pay: ");
        int orderid = input.nextInt();
        for(int i = 0; i<a.getOrderList().size();i++){
            if(a.getOrderList().get(i).getId() == orderid && a.getOrderList().get(i).getUserId() == c.getId()){
                double amount = a.getOrderList().get(i).getPrice();
                System.out.println("You're payment is: "+amount);
                System.out.print("Enter payment: ");
                double cash = input.nextDouble();
                if((cash-amount) == 0){
                    System.out.println("Your money is exact!\nThank you for paying!");
                    for(int j = 0; j<a.getMedForAllergies().size();j++){
                        if(a.getOrderList().get(i).getMedName().equals(a.getMedForAllergies().get(j).getBrandname())){
                            MedicinesForAllergies med = a.getMedForAllergies().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){                                                                                           
                                a.getOrderList().remove(a.getOrderList().get(i));
                                a.getMedForAllergies().remove(med); 
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
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
                            MedicinesForHeadache med = a.getMedForHeadache().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){
                                a.getOrderList().remove(a.getOrderList().get(i));
                                a.getMedForHeadache().remove(med);
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
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
                            MedicinesForBodyPain med = a.getMedForBodyPain().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){
                                a.getMedForBodyPain().remove(med);
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
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
                            MedicinesForCough med = a.getMedForCough().get(j);
                            if(med.getQuantity() == a.getOrderList().get(i).getQty()){
                                a.getMedForCough().remove(med);
                                a.getOrderList().remove(a.getOrderList().get(i));
                                System.out.println("Medicine is now out of stock!");
                            }
                            else if(med.getQuantity() > a.getOrderList().get(i).getQty()){
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
        System.out.println("1. Headache\n2. Allergies\n3. Body Pain\n4. Cough");
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
                    }else if(qty == a.medForHeadache.get(i).getQuantity()){
                        a.medForHeadache.remove(i);
                        for(int x = 0 ; x<a.medForHeadache.size() ; x++){
                            a.medForHeadache.get(x).setID(x + 1);
                        }
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForHeadache().get(i).getID(),a.getMedForHeadache().get(i).getBrandname(),qty,a.getMedForHeadache().get(i).getPrice()*qty);
                        a.getMedForHeadache().get(i).setQuantity(a.getMedForHeadache().get(i).getQuantity() - qty);
                        System.out.println(a.getMedForHeadache().get(i).getQuantity());
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }               
                } 
                count++;
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
                    }else if(qty == a.medForAllergies.get(i).getQuantity()){
                        a.medForAllergies.remove(i);
                        for(int x = 0 ; x<a.medForAllergies.size() ; x++){
                            a.medForAllergies.get(x).setID(x + 1);
                        }
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForAllergies().get(i).getID(),a.getMedForAllergies().get(i).getBrandname(),qty,a.getMedForAllergies().get(i).getPrice()*qty);
                        a.getMedForAllergies().get(i).setQuantity(a.getMedForAllergies().get(i).getQuantity() - qty);
                        System.out.println(a.getMedForAllergies().get(i).getQuantity());
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }              
                }
                count++;
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
                    }else if(qty == a.medForBodyPain.get(i).getQuantity()){
                        a.medForBodyPain.remove(i);
                        for(int x = 0 ; x<a.medForBodyPain.size() ; x++){
                            a.medForBodyPain.get(x).setID(x + 1);
                        }
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForBodyPain().get(i).getID(),a.getMedForBodyPain().get(i).getBrandname(),qty,a.getMedForBodyPain().get(i).getPrice()*qty);
                        a.getMedForBodyPain().get(i).setQuantity(a.getMedForBodyPain().get(i).getQuantity() - qty);
                        System.out.println(a.getMedForBodyPain().get(i).getQuantity());
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }               
                }
                count++;
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
                    }else if(qty == a.medForCough.get(i).getQuantity()){
                        a.medForCough.remove(i);
                        for(int x = 0 ; x<a.medForCough.size() ; x++){
                            a.medForCough.get(x).setID(x + 1);
                        }
                    }
                    else {
                        b = new Orders(size,e.getId(),a.getMedForCough().get(i).getID(),a.getMedForCough().get(i).getBrandname(),qty,a.getMedForCough().get(i).getPrice()*qty);
                        a.getMedForCough().get(i).setQuantity(a.getMedForCough().get(i).getQuantity() - qty);
                        System.out.println(a.getMedForCough().get(i).getQuantity());
                        a.getOrderList().add(b);
                        System.out.println("Successfully ordered!");
                    }
                }
                count++;
            }
            
        }
        else {
            System.out.println("Invalid choice!");
        }
        
        
        
    }
}
