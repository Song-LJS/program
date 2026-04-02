package day27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("song");
        coll.add("li");
        coll.add("juan");

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
