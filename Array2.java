import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String[] students = {"Linh","Huong","Huyen","Trang","Huy","Hien"};
        if (checkName(students)) {
            System.out.println(" Have in list");
        } else {
        System.out.println("Not Found");}
    }

    public static boolean checkName(String[] arrays) {
        System.out.println("Nhap ten ban mun kiem tra");
        String name = new Scanner(System.in).nextLine();
        Boolean checkName = false;
        for ( String student: arrays ) {
            if (name.equals(student)){
                checkName=true;
            }
        }
        return checkName;

    }
}
