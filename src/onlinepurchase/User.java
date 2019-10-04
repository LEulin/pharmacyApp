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
public abstract class User implements UserOperation {

    Scanner input = new Scanner(System.in);

    public User() {
    }

    public void Register(Account account) {
        System.out.println("======Do not have any account yet?======");
        System.out.println("-------Register First-------");
        System.out.println("Enter Name: ");
        String n = input.nextLine();
        account.setName(n);
        System.out.println("Enter Username: ");
        String un = input.nextLine();
        account.setUsername(un);
        System.out.println("Enter Password: ");
        String p = input.nextLine();
        account.setPassword(p);
        System.out.println("Enter Age: ");
        String a = input.nextLine();
        account.setAge(Integer.valueOf(a));
    }

    public void Login(Account account) {
        while (true) {
            System.out.println("-------Login--------");
            System.out.println("Enter Username: ");
            String ua1 = input.nextLine();
            account.setUsername(ua1);
            System.out.println("Enter Password: ");
            String p1 = input.nextLine();
            account.setPassword(p1);
            if (ua1.equals(account.getUsername()) && p1.equals(account.getPassword())) {
                Pharmacy gen = new Pharmacy("Generics Pharmacy");
                System.out.println("-------Welcome to " + gen.getName() + "--------");
            }
        }
    }
}
