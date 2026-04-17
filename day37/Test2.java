package day37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        //收集到list集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "宋丽娟-女-19","刘家硕-女-20","宋鑫-男-16","张颖雪-女-20");

        List<String> newlist = list.stream()
                     .filter(s->"男".equals(s.split("-")[1]))
                     .collect(Collectors.toList());

        System.out.println(newlist);

        Set<String> newlist2 = list.stream()
                .filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());

        Map<String,Integer> newlist3 = list.stream()
                .collect(Collectors.toMap(s->s.split("-")[0], s->Integer.parseInt(s.split("-")[2])));
                System.out.println(newlist3);
}
}
