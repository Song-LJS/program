package day31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {
       public static void main(String[] args) {
        HashMap<Student,String> m = new HashMap<>();

        Student s1 = new Student(19,"宋丽娟");
        Student s2 = new Student(20,"刘家硕");
        Student s3 = new Student(20,"张颖雪");

        m.put(s1, "贵州");
        m.put(s2, "辽宁");
        m.put(s3, "贵州");

        Set<Student> keys = m.keySet();
        for(Student s : keys){
            String value = m.get(s);
            System.out.println(s+"="+value);
        }

        System.out.println("--------------------------------------");

        Set<Entry<Student, String>> entrySet = m.entrySet();
        for(Entry<Student, String> entry : entrySet){
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("--------------------------------------");
        
        Iterator<Entry<Student, String>> it = entrySet.iterator();
        while(it.hasNext()){
            Entry<Student,String> entry = it.next();
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
