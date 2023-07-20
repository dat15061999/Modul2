package BinarySearch2;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindMaxArray {
        public static void main(String[] args) {
                String str = getCheckout("abcadssdarek");
                System.out.println(str);

        }
        public  static  String getCheckout(String str) {
                StringBuilder strings = new StringBuilder();
                strings.append(str.charAt(0));
                for (int i = 0; i < str.length(); i++) {
                        if(str.charAt(i) > strings.charAt(strings.length()-1)) {
                                strings.append(str.charAt(i));
                        }
                }
                return strings.toString();
        }
//        public static String getIndex(String str) {
//                List<String> list1 = new ArrayList<>();
//        }


}
