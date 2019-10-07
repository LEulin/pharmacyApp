/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eulinle_sd2082
 */
public class Pharmacy {

    private String name;
    List<MedicinesForCough> medForCough = new ArrayList<>();
    List<MedicinesForHeadache> medForHeadache = new ArrayList<>();
    List<MedicinesForBodyPain> medForBodyPain = new ArrayList<>();
    List<MedicinesForAllergies> medForAllergies = new ArrayList<>();
    Pharmacist pharma = new Pharmacist("Lealyn","Eulin");
    ArrayList<Orders> orderList = new ArrayList<Orders>();
    ArrayList<User> userList = new ArrayList<User>();

    public Pharmacy() {
    }

    public Pharmacy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pharmacist getPharma() {
        return pharma;
    }

    public List<MedicinesForCough> getMedForCough() {
        return medForCough;
    }

    public List<MedicinesForHeadache> getMedForHeadache() {
        return medForHeadache;
    }

    public List<MedicinesForBodyPain> getMedForBodyPain() {
        return medForBodyPain;
    }

    public List<MedicinesForAllergies> getMedForAllergies() {
        return medForAllergies;
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    
    
}
