package bai5;

import java.util.Scanner;
import java.util.TreeSet;

public static void main(String[] args) {
    TreeSet<Patient> triageQueue = new TreeSet<>(new TriageComparator());
    Patient patientA = new Patient("Bệnh nhân A", 3, 800);
    Patient patientB = new Patient("Bệnh nhân B", 1, 815);
    Patient patientC = new Patient("Bệnh nhân C", 1, 805);
    triageQueue.add(patientA);
    triageQueue.add(patientB);
    triageQueue.add(patientC);

    System.out.println("Hàng cấp cứu xếp theo thứ tự ưu tienn");

    int sequence = 1;
    for (Patient patient : triageQueue) {
        System.out.println(sequence + ". " + patient);
        sequence++;
    }
}
