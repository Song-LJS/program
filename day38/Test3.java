package day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张颖雪,20","宋鑫,16","刘家硕,20","宋丽娟,19");

        List<Student> newlist = list.stream().map(Student::new)
        .collect(Collectors.toList());

        System.out.println(newlist);
    }
}
