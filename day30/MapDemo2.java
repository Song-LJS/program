package day30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("宋丽娟", "刘家硕");
        m.put("犹小艳", "狗棕叶");
        m.put("李冬雪", "宋威龙");

        Set<String> keys = m.keySet();
        /*for(String key : keys){
            String value = m.get(key);
            System.out.println(key+ "=" +value);
        }

        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String str = it.next();
            String value2 = m.get(str);
            System.out.println(str + "=" +value2);
        }*/

        m.forEach((key,value)->System.out.println(key + "=" + value));
    }
}
