package day30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("宋丽娟", "刘家硕");
        m.put("犹小艳", "狗棕叶");
        m.put("李冬雪", "宋威龙");

        String putresult = m.put("李冬雪", "张凌赫");
        System.out.println(putresult);

        String removeresult = m.remove("李冬雪");
        System.out.println(removeresult);

        //m.clear();

        boolean kresult = m.containsKey("李冬雪");
        System.out.println(kresult);

        boolean vresult = m.containsValue("刘家硕");
        System.out.println(vresult);

        boolean result = m.isEmpty();
        System.out.println(result);
        System.out.println(m);
    }
}
