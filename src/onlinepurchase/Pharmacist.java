/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchase;

/**
 *
 * @author eulinle_sd2022
 */
public abstract class Pharmacist extends User implements PharmacistOperation {

    private Account account;

    public Pharmacist() {
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
    @Override
    public boolean addMedicineForCough(MedicinesForCough med) {
        Pharmacy.getMedForCough().add(med);
        return true;
    }

    @Override
    public boolean addMedicineForHeadache(MedicinesForHeadache med) {
        Pharmacy.getMedForHeadache().add(med);
        return true;
    }

    @Override
    public boolean addMedicineForBodypain(MedicinesForBodyPain med) {
        Pharmacy.getMedForBodyPain().add(med);
        return true;
    }

    @Override
    public boolean addMedicineForAllergies(MedicinesForAllergies med) {
        Pharmacy.getMedForAllergies().add(med);
        return true;
    }

    //methods for removing medicines
    @Override
    public boolean removeMedicineForCough(MedicinesForCough med) {
        return true;
    }
    
    @Override
    public boolean removeMedicineForHeadache(MedicinesForHeadache med) {
        return true;
    }
    
    @Override
    public boolean removeMedicineForBodyPain(MedicinesForBodyPain med) {
        return true;
    }
    
    @Override
    public boolean removeMedicineForAllergies(MedicinesForAllergies med) {
        return true;
    }

    //methods for displaying medicines
    @Override
    public void displayAvailableMedicinesForCough() {
        System.out.println("Medicines for Cough\n");
        System.out.println("_______________________________________________________________________________________________");
        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
        System.out.println("_______________________________________________________________________________________________");
        for (int i = 0; i < Pharmacy.getMedForCough().size(); i++) {
            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForCough().get(i).getID(), Pharmacy.getMedForCough().get(i).getBrandname(), Pharmacy.getMedForCough().get(i).getGenericname(), Pharmacy.getMedForCough().get(i).getType(), Pharmacy.getMedForCough().get(i).getPrice(), Pharmacy.getMedForCough().get(i).getQuantity());
            System.out.println("\n-----------------------------------------------------------------------------------------------");

        }
    }

    @Override
    public void displayAvailableMedicinesForHeadache() {
        System.out.println("Medicines for Headache\n");
        System.out.println("_______________________________________________________________________________________________");
        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
        System.out.println("_______________________________________________________________________________________________");
        for (int i = 0; i < Pharmacy.getMedForHeadache().size(); i++) {
            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForHeadache().get(i).getID(), Pharmacy.getMedForHeadache().get(i).getBrandname(), Pharmacy.getMedForHeadache().get(i).getGenericname(), Pharmacy.getMedForHeadache().get(i).getType(), Pharmacy.getMedForHeadache().get(i).getQuantity());
            System.out.println("\n-----------------------------------------------------------------------------------------------");
        }
    }

    @Override
    public void displayAvailableMedicinesForBodypain() {
        System.out.println("Medicines for Bodypain\n");
        System.out.println("_______________________________________________________________________________________________");
        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
        System.out.println("_______________________________________________________________________________________________");
        for (int i = 0; i < Pharmacy.getMedForBodyPain().size(); i++) {
            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForBodyPain().get(i).getID(), Pharmacy.getMedForBodyPain().get(i).getBrandname(), Pharmacy.getMedForBodyPain().get(i).getGenericname(), Pharmacy.getMedForBodyPain().get(i).getType(), Pharmacy.getMedForBodyPain().get(i).getPrice(), Pharmacy.getMedForBodyPain().get(i).getQuantity());
            System.out.println("\n-----------------------------------------------------------------------------------------------");
        }
    }

    @Override
    public void displayAvailableMedicinesForAllergies() {
        System.out.println("Medicines for Bodypain\n");
        System.out.println("_______________________________________________________________________________________________");
        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
        System.out.println("_______________________________________________________________________________________________");
        for (int i = 0; i < Pharmacy.getMedForAllergies().size(); i++) {
            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForAllergies().get(i).getID(), Pharmacy.getMedForAllergies().get(i).getBrandname(), Pharmacy.getMedForAllergies().get(i).getGenericname(), Pharmacy.getMedForAllergies().get(i).getType(), Pharmacy.getMedForAllergies().get(i).getPrice(), Pharmacy.getMedForAllergies().get(i).getQuantity());
            System.out.println("\n-----------------------------------------------------------------------------------------------");
        }
    }

}
