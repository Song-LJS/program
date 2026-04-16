package day36;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "宋丽娟-19","刘家硕-20","宋鑫-16");

        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s->System.out.println(s));
    }
}
