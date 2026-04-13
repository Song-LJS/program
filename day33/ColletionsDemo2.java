package day33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ColletionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> boy = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();

        Collections.addAll(boy, "宋鑫","宋泽学","宋威龙","习近平");
        Collections.addAll(girl, "赵丽颖","刘家硕","宋丽娟");

        Random r = new Random();
        int n = 1+r.nextInt(10);

        String str = fun(n,boy,girl);
        System.out.println(str);
    }

    public static String fun(int n,ArrayList<String> boy,ArrayList<String> girl){
        if(n>=1&&n<=7){
            Collections.shuffle(boy);
            return boy.get(1);
        }else{
            Collections.shuffle(girl);
            return girl.get(1);
        }
    }
}
