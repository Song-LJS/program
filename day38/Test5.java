package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "宋丽娟,19","刘家硕,20");

        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
