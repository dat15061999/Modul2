package ExerciseArraylist;

import java.util.Scanner;

public class GetValue {
    static Scanner input = new Scanner(System.in);
    public static String readString(String str) {
        System.out.println(str);
        return input.nextLine();
    }
}
