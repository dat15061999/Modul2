package TestMap;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;
    public Student(){};

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Student student =new Student("Trung",21,"28 Nguyen Tri Phuong");
        Student student1 =new Student("Bao",21,"28 Nguyen Tri Phuong");
        Student student2 =new Student("Lam",21,"28 Nguyen Tri Phuong");

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}

