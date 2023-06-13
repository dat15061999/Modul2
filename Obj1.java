public class Obj1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienthithongtin();
        sv2.hienthithongtin();
        SinhVien sv3 = new SinhVien("Tram",8.0);
        sv3.hienthithongtin();
        sv3.setName("Black");
        sv3.setPoint(24);
        sv3.hienthithongtin();
        double dtbsv3 = sv3.tinhDTB(8,8);
        System.out.println(dtbsv3);
        System.out.println(sv3);
        sv3.checkHL();

    }
}
