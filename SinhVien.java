public class SinhVien {
    private String name;
    private double point;

    public SinhVien(String name, double point) {
        this.name = name;
        this.point = point;
    }

    public SinhVien() {
        this.name = "dat";
        this.point = 2;
    }


    public void hienthithongtin() {
        System.out.println(name + " : " + point);
    }

    public double tinhDTB(double math, double liture) {
        return (math + liture) / 2;
    }
//    Get vaf set

    public String getName() {
        return name;
    }

    public double getPoint() {
        return point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }

    private boolean checkpoint() {
        return this.point >= 24;

    }

    public void checkHL() {
        if (checkpoint())
            System.out.println("Diem hop le");
        else
            System.out.println("Diem khong hop le");
    }

}
