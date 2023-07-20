package TestMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1,Student o2) {
        if( o1.getAge() > o2.getAge()) {
            return 1;
        }else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Dat",30,"HT");
        Student student1 = new Student("Minh",12,"HT");
        Student student2 = new Student("Thai",20,"HT");
        Student student3 = new Student("Anh",24,"HT");
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student);
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        Collections.sort(listStudents);
        for (Student list: listStudents) {
            System.out.println(list.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(listStudents,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : listStudents){
            System.out.println(st.toString());
        }
    }

    }


