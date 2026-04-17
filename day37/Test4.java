package day37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"songlijuan,19","liujiasuo,20","songxin,16","zhangyingxue,20");

        Map<String,Integer> newlist = list.stream()
        .filter(s->Integer.parseInt(s.split(",")[1])>=20)
        .collect(Collectors.toMap(s->s.split(",")[0], s->Integer.parseInt(s.split(",")[1])));

        System.out.println(newlist);
    }
}
