package bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class HospitalManagement {
    public static void main(String[] args) {
        List<Object[]> inputData = new ArrayList<>();
        inputData.add(new Object[]{"Lan", "Tim mach"});
        inputData.add(new Object[]{"Hung", "Noi tiet"});
        inputData.add(new Object[]{"Mai", "Tim mach"});
        List<PatientEx6> allPatients = new ArrayList<>();
        for (Object[] data : inputData) {
            allPatients.add(new PatientEx6((String)data[0], 30, (String)data[1]));
        }

        Map<String, List<PatientEx6>> departmentRecords = new HashMap<>();
        for (PatientEx6 patient : allPatients) {
            String deptKey = patient.department;

            if (!departmentRecords.containsKey(deptKey)) {
                List<PatientEx6> newList = new ArrayList<>();
                newList.add(patient);
                departmentRecords.put(deptKey, newList);
            } else {
                departmentRecords.get(deptKey).add(patient);
            }
        }

        System.out.println("Khoa đông nhất::");
        String busiestDepartment = "";
        int maxCount = 0;
        for (Map.Entry<String, List<PatientEx6>> entry : departmentRecords.entrySet()) {
            String currentDept = entry.getKey();
            int currentCount = entry.getValue().size();

            if (currentCount > maxCount) {
                maxCount = currentCount;
                busiestDepartment = currentDept;
            }
        }

        System.out.println("Output Analysis: Khoa" + busiestDepartment + "đang đông nhất");
    }
}