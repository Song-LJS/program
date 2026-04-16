package day36;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Arrays.stream(arr).forEach(s->System.out.println(s));
    }
}
