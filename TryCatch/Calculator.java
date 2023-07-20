package TryCatch;

import ExerciseArraylist.GetValue;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator newNumber = new Calculator();
        newNumber.calculator(getValue("Nhap x : "),getValue("Nhap y : "));
    }
    public static  int getValue ( String str) {
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        int value = input.nextInt();
        return value;
    }
    public void calculator(int x, int y) {
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Gia tri x + y = " + a);
            System.out.println("Gia tri x - y = " + b);
            System.out.println("Gia tri x * y = " + c);
            System.out.println("Gia tri x / y = " + d);
        }catch (Exception e) {
            System.err.println("Nhap sai so");
        }

    }
}
