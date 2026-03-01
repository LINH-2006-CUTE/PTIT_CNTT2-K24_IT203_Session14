package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        List<String> dailyReports = new ArrayList<>();
        dailyReports.add("Cúm A");
        dailyReports.add("Sốt xuất huyết");
        dailyReports.add("Cúm A");
        dailyReports.add("Covid-19");
        dailyReports.add("Cúm A");
        Map<String, Integer> diseaseCount = new TreeMap<>();
        System.out.println("Danh sách báo cáo đầu vào: " + dailyReports);
        for (String diseaseName : dailyReports) {
            if (diseaseCount.containsKey(diseaseName)) {
                int currentCount = diseaseCount.get(diseaseName);
                diseaseCount.put(diseaseName, currentCount + 1);
            } else {
                diseaseCount.put(diseaseName, 1);
            }
        }
        System.out.println("Báo cáo được sắp xếp theo tên bệnh (Alphabet) để gửi lên Sở Y tế");
        for (Map.Entry<String, Integer> entry : diseaseCount.entrySet()) {
            String disease = entry.getKey();
            int count = entry.getValue();
            System.out.println("" + disease + count);
        }
    }
}