package Demerging;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    static class Employees {
        private String name;
        private String gender;
        public Employees (String name,String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }

    public static void main(String[] args) {
        Employees[] employee = {
                new Employees("Dang Thi Dieu","Nu"),
                new Employees("Cao Van Van","Nam"),
                new Employees("Ho Van Hoang","Nam"),
                new Employees("Dang Thi Dieu","Nu"),
                new Employees("Le Van Nam","Nam"),
                new Employees("Dang Thi Dieu","Nu")
        };
        Queue<Employees> employeeMale = new LinkedList<>();
        Queue<Employees> employeeFeeMale = new LinkedList<>();
        for (Employees item: employee) {
            if (item.gender.equals("Nu")) {
                employeeFeeMale.add(item);
            }
            else if (item.gender.equals("Nam")) {
                employeeMale.add(item);
            }
        }
        System.out.println("Danh sach nu");
        while (!employeeFeeMale.isEmpty()) {
            Employees nvnu = employeeFeeMale.poll();
            System.out.println(nvnu.getName());
        }
        System.out.println("Danh sach nam");
        while (!employeeMale.isEmpty()) {
            Employees nvnam = employeeMale.poll();
            System.out.println(nvnam.getName());
        }
    }
}
