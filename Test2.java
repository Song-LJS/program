package day27;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class Test2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("song");
        list.add("li");
        list.add("juan");

        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
