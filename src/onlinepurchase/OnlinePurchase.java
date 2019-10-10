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

        while (true) {
            System.out.println("1. Login\n2. Register");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            if (choice == 1) {
                User a = user.Login(phar, user);
                if (a == phar.getPharma() == true) {
                    System.out.println("Logged in as Pharmacist!");
                    while (true) {
                        System.out.println("1. Add Medicine\n2. Remove Medicine\n3. View Medicines\n4. View Orders\n5. Log out");
                        System.out.print("Enter choice: ");
                        int option = input.nextInt();
                        if (option == 1) {
                            System.out.println("1. Allergies\n2. Headache\n3. Cough\n4. Body Pain");
                            int inputs = input.nextInt();
                            if (inputs == 1) {
                                phar.getPharma().addMedicineForAllergies(phar, med);
                            } else if (inputs == 2) {
                                phar.getPharma().addMedicineForHeadache(phar, med);
                            } else if (inputs == 3) {
                                phar.getPharma().addMedicineForCough(phar, med);
                            } else if (inputs == 4) {
                                phar.getPharma().addMedicineForBodypain(phar, med);
                            } else {
                                System.out.println("Invalid choice!");
                            }
                        } else if (option == 2) {
                            System.out.println("1. Allergies\n2. Headache\n3. Cough\n4. Body Pain");
                            int inputs = input.nextInt();
                            if (inputs == 1) {
                                phar.getPharma().removeMedicineForAllergies(phar);
                            } else if (inputs == 2) {
                                phar.getPharma().removeMedicineForHeadache(phar);
                            } else if (inputs == 3) {
                                phar.getPharma().removeMedicineForCough(phar);
                            } else if (inputs == 4) {
                                phar.getPharma().removeMedicineForBodyPain(phar);
                            } else {
                                System.out.println("Invalid choice!");
                            }
                        } else if (option == 3) {
                            phar.getPharma().allMedicines(phar);
                        } else if (option == 4) {
                            phar.getPharma().viewAllOrders(phar);
                        } else if (option == 5) {
                            User lealyn = phar.getPharma().Logout(a);
                                break;
                            
                        } else {
                            System.out.println("Invalid Input!");
                        }

                    }

                } else {
                    while (true) {
                        System.out.println("1. View Medicines\n2. Purchase\n3. Payment\n4. View Orders\n5. Log Out");
                        int choose = input.nextInt();
                        if (choose == 1) {

                        } else if (choose == 2) {
                        } else if (choose == 3) {
                        } else if (choose == 4) {
                        } else if (choose == 5) {
                        } else {
                            System.out.println("Invalid Input!");
                        }

                    }
                }

            } else if (choice == 2) {
                user.Register(phar, user);
            } else {
                System.out.println("Incorrect choice!");
            }

        }

    }
}
