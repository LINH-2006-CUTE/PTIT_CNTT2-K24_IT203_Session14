package demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // MAP lưu cặp key-value  (KEY- khóa là 1 SET<key>), giống CLASS
        // MAP tương tự SET khi không trùng lặp

        // 4 lớp triển khai
        //HashMap
        //LinkedHashMap
        //TreeMap
        //EnumMap (danh sách các hầng số)

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "bưởi");
        dictionary.remove("apple");

        String value = dictionary.get("apple");
        dictionary.containsKey("apple");
        dictionary.containsKey("táo");


        // duyệt collection
        // 3 cách duyệt:


        // theo key
        for (String key : dictionary.keySet()) {
            // làm việc được với key
        }


        // theo values
        for (String values : dictionary.values()) {
            // làm việc với values
        }


        // theo cả key và values
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            // lam viec
            String key = entry.getKey();
            String values = entry.getValue();
        }

    }
}


