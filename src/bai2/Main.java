package bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> medicineCatalog = new HashMap<>();
        medicineCatalog.put("T01", "Paracetamol");
        medicineCatalog.put("T02", "Ibuprofen");
        medicineCatalog.put("T03", "Amoxicillin");
        medicineCatalog.put("T04", "Losartan");
        medicineCatalog.put("T05", "Aspirin");

        System.out.println("Tổng số thuốc trong danh mục: " + medicineCatalog.size());
        Scanner scanner = new Scanner(System.in);
        String inputCode1 = "T01";
        System.out.println("Mã thuốc" + inputCode1);
        lookupMedicine(medicineCatalog, inputCode1);
        String inputCode2 = "X99";
        System.out.println("Mã thuốc" + inputCode2);
        lookupMedicine(medicineCatalog, inputCode2);
    }


    public static void lookupMedicine(Map<String, String> catalog, String code) {
        if (catalog.containsKey(code)) {
            String medicineName = catalog.get(code);
            System.out.println("Tên thuốc: " + medicineName);
        } else {
            String errorMessage = "Thuốc không có trong danh mục BHYT";
            System.out.println("Output:" + errorMessage);
        }
    }
}