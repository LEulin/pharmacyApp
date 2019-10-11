/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchase;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class User implements UserOperation {

    private String userName;
    private String password;
    private int age;
    private int id;

    Scanner input = new Scanner(System.in);

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(int id, String userName, String password, int age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void addAllInfo(Pharmacy a) {
        a.getUserList().add(new Adult(1, "LEulin", "Simple", 19));
        a.getUserList().add(new Adult(2, "Eulin", "Cute", 19));
        a.getUserList().add(new Senior(3, "Lalyn", "eulin", 62));
        a.getMedForBodyPain().add(new MedicinesForBodyPain(1, "Alaxan", "Ibuprofen + Paracetamol", "Body Pain", 8.25, 100));
        a.getMedForBodyPain().add(new MedicinesForBodyPain(2, "Rexidol", "Paracetamol Caffeine", "Body Pain", 15.50, 75));
        a.getMedForBodyPain().add(new MedicinesForBodyPain(3, "Medicol Advance ", "Ibuprofen", "Body Pain", 6.00, 100));
        a.getMedForAllergies().add(new MedicinesForAllergies(1, "Allerkid", "Cetirizine", "Allergies", 8, 50));
        a.getMedForAllergies().add(new MedicinesForAllergies(2, "Allerta", "Loratadine", "Allergies", 16, 50));
        a.getMedForAllergies().add(new MedicinesForAllergies(3, "Allerta Dermatec", "Mometasone Furoate", "Allergies", 24, 50));
        a.getMedForCough().add(new MedicinesForCough(1, "Solmux", "Carbocisteine", "Cough", 17, 50));
        a.getMedForCough().add(new MedicinesForCough(2, "Myracof", "Ambroxol", "Cough", 22, 50));
        a.getMedForCough().add(new MedicinesForCough(3, "Expel OD", "Ambroxol", "Cough", 29, 50));
        a.getMedForHeadache().add(new MedicinesForHeadache(1, "Biogesic 325", "Paracetamol", "Headache", 6, 50));
        a.getMedForHeadache().add(new MedicinesForHeadache(2, "Biogesic", "Paracetamol", "Headache", 8, 50));
        a.getMedForHeadache().add(new MedicinesForHeadache(3, "UHP Fevertab", "Paracetamol", "Headache", 5, 50));
        a.getOrderList().add(new Orders(1, 1, 1, "Body Pain", 4, 33));
        a.getOrderList().add(new Orders(2, 3, 2, "Body Pain", 6, 50));
        a.getOrderList().add(new Orders(3, 2, 11, "Headache", 6, 40));
    }

    @Override
    public void Register(Pharmacy a, User e) {
        int size = a.getUserList().size() + 1;
        System.out.print("Enter Username: ");
        String uName = input.nextLine();
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        if (age >= 18 && age <= 59) {
            a.getUserList().add(new Adult(size, uName, pass,age));
            System.out.println("Registered as an Adult!");
        } else if (age >= 60) {
            a.getUserList().add(new Senior(size, uName, pass,age));
            System.out.println("Registered as Senior Citizen!");
        } else {
            System.out.println("Too young to register!");
        }
    }

    @Override
    public User Login(Pharmacy a, User e) {
//        User b = new User();
//        System.out.print("Enter username: ");
//        String uname = input.nextLine();
//        for(int i = 0; i<a.getUserList().size();i++){
//            if(a.getUserList().get(i).getUserName().equals(uname) == true){               
//                int counts = 0;
//                while(counts!=3){
//                    System.out.print("Enter password: ");
//                    String pass = input.nextLine();
//                    if(pass.equals(a.getUserList().get(i).getPassword()) == true){
//                        System.out.println("Successfully logged in!");
//                        b = a.getUserList().get(i);
//                        return b;
//                    }
//                    else {
//                        counts++;
//                        System.out.print("Enter password again: ");
//                        pass = input.nextLine();                        
//                    }             
//                }
//                if(counts==3){
//                    Error();
//                }
//            }
//            count++;
//        }
//        count = count-1;
//        
//        if(a.getPharma().getUserName().equals(uname)){
//            int counts = 0;
//            while(counts!=3){
//                System.out.print("Enter password: ");
//                String pass = input.nextLine();
//                if(pass.equals(a.getPharma().getPassword()) == true){
//                        System.out.println("Successfully logged in!");
//                        b = a.getPharma();
//                        return b;
//                    }
//                    else {
//                        counts++;
//                        System.out.print("Enter password again: ");
//                        pass = input.nextLine();                        
//                    } 
//            }
//        }
//        count = count +1;
//        
//        if(count==a.getUserList().size()){
//            Error();
//        }
//        System.out.print("Input Username: ");
//        String name = input.nextLine();
//        int counts = 0;
//        if (a.getPharma().getUserName().equals(name) == true) {
//            int count = 0;
//            System.out.println("Username matched!");
//            while (count != 3) {
//                System.out.print("Input Password: ");
//                String pass = input.nextLine();
//                if (a.getPharma().getPassword().equals(pass) == true) {
//                    e = a.getPharma();
//                    return e;
//                }
//                count++;     
//            }
//            if (count == 3) {
//                Error();
//            }
//        } else {
//            for (int i = 0; i < a.getUserList().size(); i++) {
//                if (name.equals(a.getUserList().get(i).getUserName()) == false) {
//                    counts++;
//                    if (counts == a.getUserList().size()) {
//                        Error();
//                    }
//                } else {
//                    int count = 0;
//                    System.out.println("Username matched!");
//                    while (count != 3) {
//                        System.out.print("Input Password: ");
//                        String pass = input.nextLine();
//                        for (int j = 0; j < a.getUserList().size(); j++) {
//                            if (pass.equals(a.getUserList().get(i).getPassword()) == true) {
//                                e = a.getUserList().get(i);
//                                System.out.println("Logged in! \nWelcome " + a.getUserList().get(i).getUserName() + "!");
//                                return e;
//                            }
//                        }
//                        count++;
//                    }
//                    if (count == 3) {
//                        Error();
//                    }
//                    count=0;
//                }
//            }
//        }
//        System.out.println("Diritso basa diri!");

        System.out.print("Enter username: ");
        String uname = input.nextLine();
        if(a.getPharma().getUserName().equals(uname)){
            System.out.print("Username matched!\nInput password: ");
            String pass = input.nextLine();
            if(pass.equals(a.getPharma().getPassword())){
                System.out.println("You are now logged in as pharmacist!");
                return a.getPharma();
            }
        
        }
        else {
            int count = 0;
            for(int i = 0; i<a.getUserList().size();i++){
                if(a.getUserList().get(i).getUserName().equals(uname)){
                    System.out.print("Enter password: ");
                    String password = input.nextLine();
                    if(password.equals(a.getUserList().get(i).getPassword())){
                        System.out.println("You are now logged in as "+a.getUserList().get(i).getClass().getSimpleName()+"!");
                        return a.getUserList().get(i);
                    }
                
                }
                count++;   
            }
            if(count == a.getUserList().size()){
                Error();
            
            }
        }
        return e;
    }

    @Override
    public User Logout(User e) {
        return e;
    }

    public void Error() {
        System.out.println("Error logging in! Please try again later! ");
    }

    public void displayAvailableMedicinesForCough(Pharmacy a) {
//        System.out.println("Medicines for Cough\n");
//        System.out.println("_______________________________________________________________________________________________");
//        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
//        System.out.println("_______________________________________________________________________________________________");
//        for (int i = 0; i < Pharmacy.getMedForCough().size(); i++) {
//            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForCough().get(i).getID(), Pharmacy.getMedForCough().get(i).getBrandname(), Pharmacy.getMedForCough().get(i).getGenericname(), Pharmacy.getMedForCough().get(i).getType(), Pharmacy.getMedForCough().get(i).getPrice(), Pharmacy.getMedForCough().get(i).getQuantity());
//            System.out.println("\n-----------------------------------------------------------------------------------------------");
//
//        }
        System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %10s %5s %10s", "Medicine ID", "|", "Brand Name", "|", "Generic Name", "|", "Medicine Type", "|", "Quantity", "|", "Price\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < a.getMedForCough().size(); i++) {
            System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %10s %5s %10s \n", a.getMedForCough().get(i).getID(), "|", a.getMedForCough().get(i).getBrandname(), "|", a.getMedForCough().get(i).getGenericname(), "|", a.getMedForCough().get(i).getType(), "|", a.getMedForCough().get(i).getQuantity(), "|", a.getMedForCough().get(i).getPrice());
           
        }
    }

    public void displayAvailableMedicinesForHeadache(Pharmacy a) {
//        System.out.println("Medicines for Headache\n");
//        System.out.println("_______________________________________________________________________________________________");
//        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
//        System.out.println("_______________________________________________________________________________________________");
//        for (int i = 0; i < Pharmacy.getMedForHeadache().size(); i++) {
//            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForHeadache().get(i).getID(), Pharmacy.getMedForHeadache().get(i).getBrandname(), Pharmacy.getMedForHeadache().get(i).getGenericname(), Pharmacy.getMedForHeadache().get(i).getType(), Pharmacy.getMedForHeadache().get(i).getQuantity());
//            System.out.println("\n-----------------------------------------------------------------------------------------------");
//        }
        System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %10s %5s %10s", "Medicine ID", "|", "Brand Name", "|", "Generic Name", "|", "Medicine Type", "|", "Quantity", "|", "Price\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < a.getMedForHeadache().size(); i++) {
            System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %10s %5s %10s \n", a.getMedForHeadache().get(i).getID(), "|", a.getMedForHeadache().get(i).getBrandname(), "|", a.getMedForHeadache().get(i).getGenericname(), "|", a.getMedForHeadache().get(i).getType(), "|", a.getMedForHeadache().get(i).getQuantity(), "|", a.getMedForHeadache().get(i).getPrice());
            
        }
    }

    public void displayAvailableMedicinesForBodypain(Pharmacy a) {
//        System.out.println("Medicines for Bodypain\n");
//        System.out.println("_______________________________________________________________________________________________");
//        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
//        System.out.println("_______________________________________________________________________________________________");
//        for (int i = 0; i < Pharmacy.getMedForBodyPain().size(); i++) {
//            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForBodyPain().get(i).getID(), Pharmacy.getMedForBodyPain().get(i).getBrandname(), Pharmacy.getMedForBodyPain().get(i).getGenericname(), Pharmacy.getMedForBodyPain().get(i).getType(), Pharmacy.getMedForBodyPain().get(i).getPrice(), Pharmacy.getMedForBodyPain().get(i).getQuantity());
//            System.out.println("\n-----------------------------------------------------------------------------------------------");
//        }

        System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %10s %5s %10s", "Medicine ID", "|", "Brand Name", "|", "Generic Name", "|", "Medicine Type", "|", "Quantity", "|", "Price\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < a.getMedForBodyPain().size(); i++) {
            System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %10s %5s %10s \n", a.getMedForBodyPain().get(i).getID(), "|", a.getMedForBodyPain().get(i).getBrandname(), "|", a.getMedForBodyPain().get(i).getGenericname(), "|", a.getMedForBodyPain().get(i).getType(), "|", a.getMedForBodyPain().get(i).getQuantity(), "|", a.getMedForBodyPain().get(i).getPrice());
            
        }
    }

    public void displayAvailableMedicinesForAllergies(Pharmacy a) {
//        System.out.println("Medicines for Allergies\n");
//        System.out.println("_______________________________________________________________________________________________");
//        System.out.printf(" %-15s | %-15s  |  %-15s  |  %-10s  |  %-10s   |   %-2s", "ID", "Brandname", "Genericname", "Type", "Price", "Quantity\n");
//        System.out.println("_______________________________________________________________________________________________");
//        for (int i = 0; i < Pharmacy.getMedForAllergies().size(); i++) {
//            System.out.printf("%-16s |  %-16s  |  %-15s  |  %-10s  |  %-10f   |   %-2d", Pharmacy.getMedForAllergies().get(i).getID(), Pharmacy.getMedForAllergies().get(i).getBrandname(), Pharmacy.getMedForAllergies().get(i).getGenericname(), Pharmacy.getMedForAllergies().get(i).getType(), Pharmacy.getMedForAllergies().get(i).getPrice(), Pharmacy.getMedForAllergies().get(i).getQuantity());
//            System.out.println("\n-----------------------------------------------------------------------------------------------");
//        }

        System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %s %5s %10s", "Medicine ID", "|", "Brand Name", "|", "Generic Name", "|", "Medicine Type", "|", "Quantity", "|", "Price\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < a.getMedForAllergies().size(); i++) {           
            System.out.printf("%10s %5s %20s %5s %25s %5s %20s %5s %10s %5s %10s \n", a.getMedForAllergies().get(i).getID(), "|", a.getMedForAllergies().get(i).getBrandname(), "|", a.getMedForAllergies().get(i).getGenericname(), "|", a.getMedForAllergies().get(i).getType(), "|", a.getMedForAllergies().get(i).getQuantity(), "|", a.getMedForAllergies().get(i).getPrice());
        }
    }

    public void allMedicines(Pharmacy a) {
        displayAvailableMedicinesForAllergies(a);
        System.out.println("");
        System.out.println("");
        displayAvailableMedicinesForBodypain(a);
        System.out.println("");
        System.out.println("");
        displayAvailableMedicinesForHeadache(a);
        System.out.println("");
        System.out.println("");
        displayAvailableMedicinesForCough(a);
    }

    public void viewAllOrders(Pharmacy a) {
        System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %20s %10s %10s", "Order ID", "|", "User ID", "|", "Medicine ID", "|", "Medicine Name", "|", "Quantity", "|", "Price\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < a.getOrderList().size(); i++) {
            System.out.printf("%10s %5s %10s %5s %10s %5s %20s %5s %20s %10s %10s \n", a.getOrderList().get(i).getId(), "|", a.getOrderList().get(i).getUserId(), "|", a.getOrderList().get(i).getMedId(), "|", a.getOrderList().get(i).getMedName(), "|", a.getOrderList().get(i).getQty(), "|", a.getOrderList().get(i).getPrice());
        }
    }

//    @Override
//    public void viewAvailableMedicines() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
