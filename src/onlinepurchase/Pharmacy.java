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
    private static List<MedicinesForCough> medForCough = new ArrayList<>();
    private static List<MedicinesForHeadache> medForHeadache = new ArrayList<>();
    private static List<MedicinesForBodyPain> medForBodyPain = new ArrayList<>();
    private static List<MedicinesForAllergies> medForAllergies = new ArrayList<>();

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

    public static List<MedicinesForCough> getMedForCough() {
        return medForCough;
    }

    public static void setMedForCough(List<MedicinesForCough> medForCough) {
        Pharmacy.medForCough = medForCough;
    }

    public static List<MedicinesForHeadache> getMedForHeadache() {
        return medForHeadache;
    }

    public static void setMedForHeadache(List<MedicinesForHeadache> medForHeadache) {
        Pharmacy.medForHeadache = medForHeadache;
    }

    public static List<MedicinesForBodyPain> getMedForBodyPain() {
        return medForBodyPain;
    }

    public static void setMedForBodyPain(List<MedicinesForBodyPain> medForBodyPain) {
        Pharmacy.medForBodyPain = medForBodyPain;
    }

    public static List<MedicinesForAllergies> getMedForAllergies() {
        return medForAllergies;
    }

    public static void setMedForAllergies(List<MedicinesForAllergies> medForAllergies) {
        Pharmacy.medForAllergies = medForAllergies;
    }
    
}
