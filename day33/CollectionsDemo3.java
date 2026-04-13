package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "黑马","菠萝吹雪","张颖雪","宋鑫","刘家硕","宋丽娟");

        String[] str = new String[list.size()];
        while(true){
            while (true) { 
            Collections.shuffle(list);
            String s = list.get(0);
            if(fun(s,str)){
                continue;
            }else{
                adds(s, str);
                System.out.println(s);
            }

             if(str[list.size()-1]!=null){
                System.out.println("开始下一轮点名！");
                Arrays.fill(str,null);
                break;
            }
            }
        }
    }

     public static boolean fun(String s,String[] str){
            for(int i = 0;i<str.length;i++){
                if(s.equals(str[i])){
                    return true;
                }
            }
            return false;
        }

        public static void adds(String s,String[] str){
            for(int i = 0;i<str.length;i++){
                if(str[i] == null){
                    str[i] = s;
                    return;
                }
            }
        }
}
