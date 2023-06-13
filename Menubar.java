import java.util.Scanner;

public class Menubar {
    public static void main(String[] args) {
        numbertotext();
    }

    public static void numbertotext() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        choice = input.nextInt();
        int canh = 5;
        switch (choice) {
            case 1:
                returnstar();
                break;
            case 2:
                System.out.println("Draw the square");
                for (int i = 1; i <= canh; i++) {
                    for (int j = 1; j <= canh; j++) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Draw the square");
                for (int i = 1; i <= canh - 2; i++) {
                    for (int j = 1; j <= canh; j++) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }
                break;
            case 0:
                System.exit(0);
                break;
        }
        numbertotext();

    }

    public static void returnstar() {
        int choice = -1;
        int canh =5;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle Botton-left");
        System.out.println("2. Draw the triangle Top-left");
        System.out.println("3. Draw the triangle Botton-right");
        System.out.println("4. Draw the triangle Top-right");
        System.out.println("0. Return");
        System.out.println("Enter your choice");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle Botton-left");
                for (int i = 1; i <= canh; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Draw the triangle Top-left");
                for (int i = 1; i <= canh; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Draw the triangle Top-right");
                for (int i = 1; i <= canh; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.out.println("Draw the triangle botton-right");
                for (int i = 1; i <= canh; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 5; j >= i; j--) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }

                break;
            case 0:
                numbertotext();
                break;
        }
        returnstar();
    }
}