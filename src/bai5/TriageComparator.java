package bai5;

import java.util.Scanner;
import java.util.Comparator;
class TriageComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {
        if (p1.severity != p2.severity) {
            return Integer.compare(p1.severity, p2.severity);
        }
        if (p1.arrivalTime != p2.arrivalTime) {
            // p1.arrivalTime - p2.arrivalTime: Nếu p1 nhỏ hơn p2 (đến sớm hơn), kết quả âm -> p1 lên trước
            return Integer.compare(p1.arrivalTime, p2.arrivalTime);
        }
        return p1.name.compareTo(p2.name);
    }
}