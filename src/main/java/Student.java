import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;
//cons
    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //gt


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

    @Override
    public java.lang.String toString() {
        return  "Student name  " + this.getName()+ " age " + this.getAge() + "  address  "+ this.getAddress();
    }

    @Override
    public int compareTo(Student o1) {
        return this.getName().compareTo(o1.getName());
    }

}
