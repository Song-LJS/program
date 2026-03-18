package day13;
import java.util.ArrayList;
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student(18,"女","songlijuan");
        Student s2 = new Student(19,"女","liujiasuo");
        Student s3 = new Student(20,"女","songya");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int max = AgeUtil.MaxAge(list);
        System.out.println(max);
    }
}
