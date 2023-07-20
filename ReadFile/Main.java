package ReadFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Pham van a ",21,8.6);
        Student s2 = new Student("Pham van b ",22,8.2);
        Student s3 = new Student("Pham van c ",20,9.0);
        Student s4 = new Student("Pham van d ",19,8.4);
        List<Student> lists = new ArrayList<>();
        lists.add(s1);
        lists.add(s2);
        lists.add(s3);
        lists.add(s4);
        try{
            FileWriter  fw = new FileWriter("E:\\Modul2\\ReadFile\\data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student o: lists) {
            bw.write(o.toString());
            bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
