public class SinhVien2 {
    private int roll;
    private String name;
    private static  String college = "BBDIT";

     SinhVien2(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    static  void change() {
         college = "CodeGym";
    }
    void display() {
        System.out.println(roll + " " +name + " " + college);
    }
}
