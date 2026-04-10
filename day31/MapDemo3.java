package day31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
         String[] a = {"A","B","C","D"};
    ArrayList<String> list = new ArrayList<>();
    Random r = new Random();
    for(int i = 0;i<80;i++){
        int index = r.nextInt(a.length);
        list.add(a[index]);
    }

    HashMap<String,Integer> m = new HashMap<>();
    for(String name : list){
        if(m.containsKey(name)){
            int count = m.get(name);
            count++;
            m.put(name, count);
        }else{
            m.put(name, 1);
        }
    }

    System.out.println(m);

    int max = 0;
    Set<Entry<String, Integer>> entrySet = m.entrySet();
    for (Entry<String, Integer> entry : entrySet){
        int count = entry.getValue();
        if(count>max){
            max = count;
        }
    }

    for (Entry<String, Integer> entry : entrySet){
        int count = entry.getValue();
        if(count == max){
            System.out.println(entry.getKey());
        }
    }
    }
}
