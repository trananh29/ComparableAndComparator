import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students1= new ArrayList<>();
        Student student01= new Student("Anh",18,"Ha Noi");
        Student student02= new Student("Em",19,"Ha Tay");
        Student student03= new Student("Chi",22,"Ha Dong");
        students1.add(student01);
        students1.add(student02);
        students1.add(student03);
        Collections.sort(students1);
        for (Student s1: students1) {
            System.out.println(s1);
        }
//        AgeComparator ageComparator=new AgeComparator();
//        Collections.sort(students1,ageComparator);
//        for (Student s1: students1) {
//            System.out.println(s1);
//        }
        Collections.sort(students1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge()>o2.getAge()) return 1;
                else if (o1.getAge()==o2.getAge()) return 0;
                else return -1;
            }
        });
        for (Student s2: students1) {
            System.out.println(s2);
        }
    }
}
