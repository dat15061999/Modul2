package Danhsach2;

import Danhsach.MyList;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers.indexOf(2));
    }
}
