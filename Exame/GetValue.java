package Exame;

import java.util.Scanner;

public class GetValue {
    static Scanner input = new Scanner(System.in);
    static int choose;

    public static String getString(String str) {
        System.out.println(str);
        return input.nextLine();
    }

    public static int getInt(String str) {
        try {
            System.out.println(str);
            choose = input.nextInt();
            if (choose < 0) {
                throw new NumberFormatException("NUMBER INVALID");
            }
            return choose;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
            return getInt(GetValue.getString("Nhap lai number"));
    }
}
