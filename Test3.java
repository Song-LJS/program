package day26;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String[] str = {"song","li","juan","woaini","liujiashuo"};

        Arrays.sort(str,(o1,o2) ->
                o1.length() - o2.length()
        );

        System.out.println(Arrays.toString(str));
    }

}
