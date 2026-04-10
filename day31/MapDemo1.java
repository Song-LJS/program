package day31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("宋丽娟", "天才");
        m.put("刘家硕", "大聪明");
        m.put("张颖雪", "老实人");

        Set<Entry<String, String>> entrySet = m.entrySet();
        for(Entry<String, String> entry : entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" +value);
        }

        Iterator<Entry<String, String>> it = entrySet.iterator();
        while(it.hasNext()){
            Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

        entrySet.forEach((entry)->System.out.println(entry.getKey()+"="+entry.getValue()));
    }
}
