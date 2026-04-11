package day32;

import java.util.Comparator;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });

        tm.put(1,"娃哈哈");
        tm.put(2, "优酸乳");
        tm.put(3, "王老吉");

        System.out.println(tm);
    }
}
