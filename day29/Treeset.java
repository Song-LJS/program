package day29;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(4);
        ts.add(3);
        ts.add(1);

        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }

        for(int t : ts){
            System.out.println(t);
        }

        ts.forEach(i->System.out.println(ts));
    }

}
