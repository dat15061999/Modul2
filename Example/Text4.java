package Example;

import java.util.Arrays;
import java.util.HashMap;

public class Text4 {
    public static void main(String[] args) {
        String str = "ddbbbaaa";
        String str1 = "aaabbbcc";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(compareTo(str,str1));
    }
    public static boolean compareTo(String str,String str1) {
        boolean check = true;
        HashMap<String,Integer> list1 = new HashMap<>();
        HashMap<String,Integer> list2 = new HashMap<>();
        String [] arr1 = str.split("");
        String [] arr2 = str1.split("");

        for (int i = 0; i < arr1.length; i++) {
            if (list1.containsKey(arr1[i])) {
                list1.put(arr1[i],list1.get(arr1[1])+1);
            }
            list1.put(arr1[i],1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (list2.containsKey(arr2[i])) {
                list2.put(arr2[i],list1.get(arr2[1])+1);
            }
            list2.put(arr2[i],1);
        }
        if (list1.size() == list2.size()) {
            for (String item : list1.keySet()) {
                if(!list1.get(item).equals(list2.get(item))) {
                    check = false;
                    break;
                }
            }
        } else {
            check = false;
        }

        return check;
    }
}
