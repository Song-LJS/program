package day29;

import java.util.LinkedHashSet;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("songlijuan",19);
        Student s2 = new Student("liujiashuo",20);
        Student s3 = new Student("liudali",20);
        Student s4 = new Student("songlijuan",19);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
    }
}
