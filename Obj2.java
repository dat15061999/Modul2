public class Obj2 {
    public static void main(String[] args) {
        PhTrBc2 nghiem = new PhTrBc2(1,3,2);
        System.out.println(nghiem.getA());
        System.out.println(nghiem.getB());
        System.out.println(nghiem.getC());
        double delta = nghiem.getDiscriminant();
        if (delta>0) System.out.println("Nghiem X1 la " + nghiem.getRoot1() + " va nghiem X2 la " + nghiem.getRoot2());
        else if (delta == 0) System.out.println("Pt co nghiem kep la x = " +nghiem.getRoot3());
        else System.out.println("Pht vo nghiem");
    }
}
