package day38;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "宋丽娟","刘家硕","宋鑫","张颖雪");

    //list.stream().filter(new StringDemo()::stringJudege)
        //.forEach(s->System.out.println(s));

        list.stream().filter(new Test2()::stringJudege)
        .forEach(s->System.out.println(s));
    }

    public boolean stringJudege(String s){
        return s.startsWith("宋") && s.length()==3;
    }
}
