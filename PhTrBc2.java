public class PhTrBc2 {
    public double a;
    public double b;
    public double c;

    public PhTrBc2(double a, double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return ((b*b) -  (4*a*c));
    }
    public double getRoot1(){
        double x1 = 0 ;
        double delta = getDiscriminant();
        return x1 = (-b+Math.sqrt(delta))/ (2*a);
    }
    public double getRoot2(){
        double x2 = 0 ;
        double delta = getDiscriminant();
        return x2 = (-b-Math.sqrt(delta))/ (2*a);
    }
    public  double getRoot3() {
        double x =0 ;
        return x = (-b/(2*a));
    }
    public void thongbao(){
        System.out.println("");
    }
}
