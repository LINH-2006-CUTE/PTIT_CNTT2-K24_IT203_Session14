package demo.set;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
// Set kế thừa collection
        // set không lưu trữ phần tử trùng lặp

        // 4 lớp triển khai
        // HashSet(không xác định thứ tự lưu)
        //LinkedHashSet
        //TreeSet (cây nhị phân, được sắp xếp)
        // EnumSet (nhẹ và nhanh (khi tìm kiếm))


        // Các phương thức làm việc
        Set<Integer> set=  new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println(set); // in ra danh sách Tăng Dần mặc định

    }
}