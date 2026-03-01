package bai1;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> danhSachNhap = new ArrayList<>();
        danhSachNhap.add("Nguyễn Văn A - Yên Bái");
        danhSachNhap.add("Trần Thị B - Thái Bình");
        danhSachNhap.add("Nguyễn Văn A - Yên Bái");
        danhSachNhap.add("Lê Văn C - Hưng Yên");
        danhSachNhap.add("Trần Thị B - Thái Bình");

        LinkedHashSet<String> list = new LinkedHashSet<>();
        for (String name : danhSachNhap) {
            System.out.println("Đang thêm:" + name);
            boolean daThem = list.add(name);
            if (daThem) {
                System.out.println("Đã thêm");
            } else {
                System.out.println("Tên đã tồn tại");
            }
        }

        System.out.println(" Danh sách bệnh nhân gọi khám");

        int count = 0;
        for (String benhNhan : list) {
            System.out.println(count + benhNhan);
            count++;
        }

    }
}