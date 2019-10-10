/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchase;

import java.util.Scanner;


public class Pharmacist extends User {

    private Account account;
    Scanner input = new Scanner(System.in);

    public Pharmacist() {
    }
    
    public Pharmacist(String userName, String password){
        super(userName,password);
    }

    public Pharmacist(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //methods for adding medicines
    
    public void addMedicineForCough(Pharmacy a, Medicine e) {
        int size = a.getMedForCough().size()+1;
        System.out.print("Enter Brand Name: ");
        String bName = input.nextLine();
        System.out.print("Enter Generic Name: ");
        String gName = input.nextLine();
        System.out.print("Enter price: ");
        String price = input.nextLine();
        System.out.print("Enter quantity: ");
        String qty = input.nextLine();        
        a.getMedForCough().add(new MedicinesForCough(size,bName,gName,"Cough",Double.valueOf(price),Integer.valueOf(qty)));
    }

    
    public void addMedicineForHeadache(Pharmacy a, Medicine e) {
        int size = a.getMedForHeadache().size()+1;
        System.out.print("Enter Brand Name: ");
        String bName = input.nextLine();
        System.out.print("Enter Generic Name: ");
        String gName = input.nextLine();
        System.out.print("Enter price: ");
        String price = input.nextLine();
        System.out.print("Enter quantity: ");
        String qty = input.nextLine();        
        a.getMedForHeadache().add(new MedicinesForHeadache(size,bName,gName,"Headache",Double.valueOf(price),Integer.valueOf(qty)));

    }

    
    public void addMedicineForBodypain(Pharmacy a, Medicine e) {
        int size = a.getMedForBodyPain().size()+1;
        System.out.print("Enter Brand Name: ");
        String bName = input.nextLine();
        System.out.print("Enter Generic Name: ");
        String gName = input.nextLine();
        System.out.print("Enter price: ");
        String price = input.nextLine();
        System.out.print("Enter quantity: ");
        String qty = input.nextLine();        
        a.getMedForBodyPain().add(new MedicinesForBodyPain(size,bName,gName,"Body Pain",Double.valueOf(price),Integer.valueOf(qty)));

    }

   
    public void addMedicineForAllergies(Pharmacy a, Medicine e) {
        int size = a.getMedForAllergies().size()+1;
        System.out.print("Enter Brand Name: ");
        String bName = input.nextLine();
        System.out.print("Enter Generic Name: ");
        String gName = input.nextLine();
        System.out.print("Enter price: ");
        String price = input.nextLine();
        System.out.print("Enter quantity: ");
        String qty = input.nextLine();        
        a.getMedForAllergies().add(new MedicinesForAllergies(size,bName,gName,"Allergies",Double.valueOf(price),Integer.valueOf(qty)));
    }

    //methods for removing medicines
    
    public void removeMedicineForCough(Pharmacy a) {
//        displayAvailableMedicinesForCough(a);
        System.out.print("Enter medicine ID to remove: ");
        int choice = input.nextInt();
        for(int i = 0; i < a.getMedForCough().size(); i++){
            if(a.getMedForCough().get(i).getID() == choice){
                a.getMedForCough().remove(a.getMedForCough().get(i));
            }
        }
        for(int j = 0; j<a.getMedForCough().size();j++){
            a.getMedForCough().get(j).setID(j+1);
        }
    }
    
    
    public void removeMedicineForHeadache(Pharmacy a) {
//        displayAvailableMedicinesForHeadache(a);
        System.out.print("Enter medicine ID to remove: ");
        int choice = input.nextInt();
        for(int i = 0; i < a.getMedForHeadache().size(); i++){
            if(a.getMedForHeadache().get(i).getID() == choice){
                a.getMedForHeadache().remove(a.getMedForHeadache().get(i));
            }
        }
        for(int j = 0; j<a.getMedForHeadache().size();j++){
            a.getMedForHeadache().get(j).setID(j+1);
        }

    }
    
    
    public void removeMedicineForBodyPain(Pharmacy a) {
//        displayAvailableMedicinesForBodypain(a);
        System.out.print("Enter medicine ID to remove: ");
        int choice = input.nextInt();
        for(int i = 0; i < a.getMedForBodyPain().size(); i++){
            if(a.getMedForBodyPain().get(i).getID() == choice){
                a.getMedForBodyPain().remove(a.getMedForBodyPain().get(i));
            }
        }
        for(int j = 0; j<a.getMedForBodyPain().size();j++){
            a.getMedForBodyPain().get(j).setID(j+1);
        }
    }
    
    
    public void removeMedicineForAllergies(Pharmacy a) {
//        displayAvailableMedicinesForAllergies(a);
        System.out.print("Enter medicine ID to remove: ");
        int choice = input.nextInt();
        for(int i = 0; i < a.getMedForAllergies().size(); i++){
            if(a.getMedForAllergies().get(i).getID() == choice){
                a.getMedForAllergies().remove(a.getMedForAllergies().get(i));
            }
        }
        for(int j = 0; j<a.getMedForAllergies().size();j++){
            a.getMedForAllergies().get(j).setID(j+1);
        }
    }
}
