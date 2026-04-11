package day32;

import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>();

        Student s1 = new Student(19,"宋丽娟");
        Student s2 = new Student(20,"刘家硕");
        Student s3 = new Student(20,"张颖雪");

        tm.put(s1, "贵州");
        tm.put(s2, "辽宁");
        tm.put(s3, "贵州");

        System.out.println(tm);
    }
}
