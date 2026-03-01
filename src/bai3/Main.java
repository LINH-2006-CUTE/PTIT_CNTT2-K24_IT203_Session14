package bai3;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Set<String> setA_newMedicine = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> setB_allergies = new HashSet<>(Arrays.asList("Penicillin", "Aspirin", "Pollen"));
        System.out.println("Thành phần thuốc mới: " + setA_newMedicine);
        System.out.println("Chất dị ứng: " + setB_allergies);
        Set<String> intersectionSet = new HashSet<>(setA_newMedicine);
        intersectionSet.retainAll(setB_allergies);

        System.out.println("Các chất trùng nhau" + intersectionSet);

        if (!intersectionSet.isEmpty()) {
            System.out.println("Thuốc không an toàn vì dị ứng" + intersectionSet);
        } else {
            System.out.println("Không có thành phần dị ứng");
        }
        Set<String> safeIngredientsSet = new HashSet<>(setA_newMedicine);
        safeIngredientsSet.removeAll(setB_allergies);
        System.out.println("Các thành phần an toàn:" + safeIngredientsSet);
        System.out.println("Thành phần an toàn " + safeIngredientsSet);
    }
}