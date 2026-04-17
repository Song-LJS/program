package day37;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "宋丽娟","张颖雪","刘家硕","宋鑫");
        Object[] arr = list.stream().toArray();
        System.out.println(arr);

        list.stream().toArray(value->new String[value]);
    }
}
