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
 * @author 2ndyrGroupB
 */
public class User {
    
    private static List<MedicinesForCough> medCough = new ArrayList<MedicinesForCough>();
    private static List<MedicinesForHeadache> medHeadache = new ArrayList<MedicinesForHeadache>();
    private static List<MedicinesForBodyPain> medBodyPain = new ArrayList<MedicinesForBodyPain>();
    private static List<MedicinesForAllergies> medAllergies = new ArrayList<MedicinesForAllergies>();

    public User() {
    }

    public static List<MedicinesForCough> getMedCough() {
        return medCough;
    }

    public static void setMedCough(List<MedicinesForCough> medCough) {
        User.medCough = medCough;
    }

    public static List<MedicinesForHeadache> getMedHeadache() {
        return medHeadache;
    }

    public static void setMedHeadache(List<MedicinesForHeadache> medHeadache) {
        User.medHeadache = medHeadache;
    }

    public static List<MedicinesForBodyPain> getMedBodyPain() {
        return medBodyPain;
    }

    public static void setMedBodyPain(List<MedicinesForBodyPain> medBodyPain) {
        User.medBodyPain = medBodyPain;
    }

    public static List<MedicinesForAllergies> getMedAllergies() {
        return medAllergies;
    }

    public static void setMedAllergies(List<MedicinesForAllergies> medAllergies) {
        User.medAllergies = medAllergies;
    }
    
}
