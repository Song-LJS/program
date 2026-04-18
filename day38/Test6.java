package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(19,"songlijuan"));
        list.add(new Student(20,"liujiashuo"));

        String[] arr = list.stream().map(Student::getName)
        .toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
