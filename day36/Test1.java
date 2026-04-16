package day36;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("宋丽娟");
        list.add("宋诗情");
        list.add("宋鑫");
        list.add("刘家硕");
        list.add("张永奎");
        list.add("宋泽学");
        list.add("宋婷");

        list.stream().filter(name->name.startsWith("宋")).filter(name->name.length()==3).forEach(name->System.out.println(name));
    }
}
