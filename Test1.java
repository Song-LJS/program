package day27;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("song");
        coll.add("li");
        coll.add("juan");
        System.out.println(coll);

        //coll.clear();
        //System.out.println(coll);

        System.out.println(coll.remove("song"));
        System.out.println(coll);

        boolean result = coll.contains("li");
        System.out.println(result);

    }
}
