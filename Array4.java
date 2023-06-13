import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        changeCelius();
    }
    public static void changeCelius(){
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celius.");
        System.out.println("2. Celius to Fahrenheit.");
        System.out.println("0. Exit.");
        System.out.println("Enter your choice :");
        int number = new Scanner(System.in).nextInt();
        switch (number) {
            case 1:
                System.out.println("Fahrenheit need change is ");
                double fahren = new Scanner(System.in).nextFloat();
                double celius = (5.0/9)*(fahren-32) ;
                System.out.println("Celius is "+celius);
                changeCelius();
                break;
            case 2:
                System.out.println("Celius need change is ");
                 celius = new Scanner(System.in).nextFloat();
                 fahren = (9.0/5) * celius +32 ;
                System.out.println("Fahrenheit is "+fahren);
                changeCelius();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
