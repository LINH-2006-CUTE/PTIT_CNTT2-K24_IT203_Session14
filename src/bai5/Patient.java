package bai5;

import java.util.Scanner;
import java.util.Comparator;
import java.util.TreeSet;

// 1. Định nghĩa Class Patient
class Patient {
    String name;
    int severity; // 1: Nguy kịch, 2: Nặng, 3: Nhẹ
    int arrivalTime; // Thời gian đến (ví dụ: 800 = 8:00)

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        String severityLevel;
        switch (severity) {
            case 1: severityLevel = "Nguy kịch"; break;
            case 2: severityLevel = "Nặng"; break;
            case 3: severityLevel = "Nhẹ"; break;
            default: severityLevel = "Không xác định";
        }
        // Định dạng thời gian cho dễ đọc
        return String.format("%s (Mức %d - %s, đến lúc %02d:%02d)",
                name, severity, severityLevel, arrivalTime / 100, arrivalTime % 100);
    }
}
