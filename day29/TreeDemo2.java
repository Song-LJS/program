package day29;

import java.util.TreeSet;

public class TreeDemo2{
    public static void main(String[] args) {
        Student s1 = new Student("songlijuan",19);
    Student s2 = new Student("liujiasshuo",20);
    Student s3 = new Student("liudali",21);

    TreeSet<Student> ts = new TreeSet<>();

    ts.add(s1);
    ts.add(s2);
    ts.add(s3);

    System.out.println(ts);
    }
}
