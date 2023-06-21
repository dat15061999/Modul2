package Danhsach;

public class Student implements Comparable <Student>{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
