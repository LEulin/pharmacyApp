package onlinepurchase;

import java.util.Scanner;

public class OnlinePurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pharmacy phar = new Pharmacy();
        User user = new User();
        Medicine med = new Medicine();
        Scanner input = new Scanner(System.in);
        
        user.addAllInfo(phar);
        
        while(true){
            System.out.println("1. Login\n2. Register");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            if(choice == 1){
                User a = user.Login(phar, user);
                if(a == phar.getPharma() == true){
                    System.out.println("Logged in as Pharmacist!");
                    while(true){
                        System.out.println("1. Add Medicine\n2. Remove Medicine\n3. View Medicines\n4. View Orders\n5. Log out");
                        System.out.print("Enter choice: ");
                        int option = input.nextInt();
                        if(option == 1){
                            System.out.println("1. Allergies\n2. Headache\n3. Cough\n4. Body Pain");
                            int inputs = input.nextInt();
                            if(inputs == 1){
                                phar.getPharma().addMedicineForAllergies(phar, med);
                            }
                            else if(inputs == 2){
                                phar.getPharma().addMedicineForHeadache(phar, med);
                            }
                            else if(inputs == 3){
                                phar.getPharma().addMedicineForCough(phar, med);
                            }
                            else if(inputs == 4){
                                phar.getPharma().addMedicineForBodypain(phar, med);
                            }
                            else {
                                System.out.println("Invalid choice!");
                            }  
                        }
                        else if(option == 2){
                            System.out.println("1. Allergies\n2. Headache\n3. Cough\n4. Body Pain");
                            int inputs = input.nextInt();
                            if(inputs == 1){
                                phar.getPharma().removeMedicineForAllergies(phar);
                            }
                            else if(inputs == 2){
                                phar.getPharma().removeMedicineForHeadache(phar);
                            }
                            else if(inputs == 3){
                                phar.getPharma().removeMedicineForCough(phar);
                            }
                            else if(inputs == 4){
                                phar.getPharma().removeMedicineForBodyPain(phar);
                            }
                            else {
                                System.out.println("Invalid choice!");
                            }                           
                        }
                        else if(option == 3) {
                            phar.getPharma().allMedicines(phar);
                        }
                        else if(option == 4) {
                            phar.getPharma().viewAllOrders(phar);
                        }
                        else if(option == 5){
                            User lealyn = phar.getPharma().Logout(a);
                            if(lealyn == null){
                                break;
                            }
                        }
                        else {
                            System.out.println("Invalid Input!");
                        }
                    
                    }
                    
                }
                else {
                    while(true){
                        System.out.println("1. View Medicines\n2. Purchase\n3. Payment\n4. View Orders\n5. Log Out");
                        int choose = input.nextInt();
                        if(choose == 1){
                            
                        
                        }
                        else if(choose == 2){}
                        else if(choose == 3){}
                        else if(choose == 4){}
                        else if(choose == 5){}
                        else {
                            System.out.println("Invalid Input!");
                        }
                    
                    
                    }
                }
                
            }
            else if(choice == 2) {
                user.Register(phar, user);
            }
            else {
                System.out.println("Incorrect choice!");
            }
        
        }
             
//        MedicinesForCough ambroxol = new MedicinesForCough(1, "Ambroxol", "Mucosolvan     ", "Capsule", 10.56, 50);
//        Pharmacy.getMedForCough().add(ambroxol);
//        MedicinesForCough vicks = new MedicinesForCough(2, "Vicks", "Dextromethorphan", "Vaporub", 25.0, 50);
//        Pharmacy.getMedForCough().add(vicks);
//        MedicinesForCough robitussin = new MedicinesForCough(3, "Robitussin", "Dextromethorphan", "Syrup", 50.5, 10);
//        Pharmacy.getMedForCough().add(robitussin);
//        
//        MedicinesForHeadache biogesic = new MedicinesForHeadache(1, "Biogesic", "Paracetamol", "Tablet", 25.0, 30);
//        Pharmacy.getMedForHeadache().add(biogesic);
//        MedicinesForHeadache medicol = new MedicinesForHeadache(2, "Medicol", "Ibuprofen", "Capsule", 10.0, 60);
//        Pharmacy.getMedForHeadache().add(medicol);
//        MedicinesForHeadache migranal = new MedicinesForHeadache(3, "Migranal", "Dihydroergotamine", "Tablet", 12.0, 80);
//        Pharmacy.getMedForHeadache().add(migranal);
//        
//        MedicinesForBodyPain alaxan = new MedicinesForBodyPain(1, "AlaxanFR", "Ibuprofen", "Capsule", 15.0, 50);
//        Pharmacy.getMedForBodyPain().add(alaxan);
//        MedicinesForBodyPain celexa = new MedicinesForBodyPain(2, "Celexa", "Citalopram", "Tablet", 12.0, 60);
//        Pharmacy.getMedForBodyPain().add(celexa);
//        MedicinesForBodyPain aspirin = new MedicinesForBodyPain(3, "Aspirin Free Anacin", "Acetaminophen", "Capsule", 19.0, 80);
//        Pharmacy.getMedForBodyPain().add(aspirin);
//        
//        MedicinesForAllergies cetirizine = new MedicinesForAllergies(1, "Cetirizine", "Zyrtec", "Capsule", 6.50, 50);
//        Pharmacy.getMedForAllergies().add(cetirizine);
//        MedicinesForAllergies antazoline = new MedicinesForAllergies(2, "Antazoline", "Vasocon A", "Capsule", 20.3, 50);
//        Pharmacy.getMedForAllergies().add(antazoline);
//        MedicinesForAllergies oxy = new MedicinesForAllergies(3, "Oxymetazoline", "Afrin", "Tablet", 13.7, 50);
//        Pharmacy.getMedForAllergies().add(oxy);
        
        
    }
}
