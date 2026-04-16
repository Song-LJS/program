package day36;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("宋丽娟", "贵州");
        hm.put("刘家硕", "辽宁");

        Set<Entry<String, String>> entrySet = hm.entrySet();

        entrySet.stream().forEach(s->System.out.println(s));
        
    }
}
