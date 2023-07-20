package StackTest;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        String words = "Con be hu hong nay hay bi lao nhao";
        String[] word = words.split("\\s+");
        TreeMap<String, Integer> listTree = new TreeMap<>();
        for (String item : word) {
            String lowercaseWord = item.toLowerCase();
            if (listTree.containsKey(lowercaseWord)) {
                int count = listTree.get(lowercaseWord);
                listTree.put(lowercaseWord, count + 1);
            }
            listTree.put(lowercaseWord, 1);
        }
        System.out.println(listTree);

    }
}