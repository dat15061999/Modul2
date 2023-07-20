package TestMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Hello",1);
        hashMap.put("Con",1);
        hashMap.put("To",1);
        hashMap.put("Hay",1);
        hashMap.put("Sua",1);
        hashMap.put("Doc",1);
        hashMap.put("Lam",1);
        hashMap.put("Gi",1);
        System.out.println(hashMap + "\n");
        Map<String,Integer> linkMap = new TreeMap<>();
        System.out.println(linkMap);
    }
}
