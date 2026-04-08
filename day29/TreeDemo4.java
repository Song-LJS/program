package day29;

import java.util.TreeSet;

public class TreeDemo4 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("songlijuan",19,34,54,22);
        Student1 s2 = new Student1("songya",19,54,23,66);
        Student1 s3 = new Student1("liujiashuo",20,66,65,99);
        Student1 s4 = new Student1("liudali",22,54,68,83);
        Student1 s5 = new Student1("zhangyixue",19,23,56,92);

        TreeSet<Student1> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student1 i:ts){
            System.out.println(i);
        }
    }
}
