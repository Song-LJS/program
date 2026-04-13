package day33;

import java.util.ArrayList;
import java.util.Collections;

public class ColletionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,2,3,4,5,6);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
