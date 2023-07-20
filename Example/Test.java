package Example;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        System.out.println("So sanh 2 chuoi");
        System.out.println(getBoolean("daabbccd", "aabbcdc"));
        System.out.println(getList("daabbccd", "aabbcdc"));

    }

    public static boolean getBoolean(String str, String str1) {
        String[] arr= str.split("");
        String[] arr1= str1.split("");
        HashMap<String, Integer> list1 = new HashMap<>();
        HashMap<String, Integer> list2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(list1.containsKey(arr[i])){
                list1.put(arr[i],list1.get(arr[i])+1);
            } else {
                list1.put(arr[i],1);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if(list2.containsKey(arr1[i])){
                list2.put(arr1[i],list2.get(arr1[i])+1);
            }
            else {
                list2.put(arr1[i],1);
            }
        }
        boolean check = true;
        if(list1.size() == list2.size()) {
            for(String item: list1.keySet()) {
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
    public static HashMap<String,Integer> getList (String str, String str1) {
       String[] arr = str.split("");
       String[] arr1 = str1.split("");
       HashMap<String,Integer> list1 = new HashMap<>();
       HashMap<String,Integer> list2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (list1.containsKey(arr[i])) {
                list1.put(arr[i],list1.get(arr[i])+1);
            } else {
                list1.put(arr[i],1);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (list2.containsKey(arr1[i])) {
                list2.put(arr1[i],list2.get(arr1[i])+1);
            } else {
                list2.put(arr1[i],1);
            }
        }
       return list2;
    }

}
