package day10;
import java.util.Random;
public class StringDemo5 {
    public static void main(String[] args) {
        String str = "sfghse";
        Random r = new Random();
        str = change(str);
        System.out.println(str);
    }

    public static String change(String str){
        String a = new String();
        for(int i = 0;i<str.length();i++){
            Random r = new Random();
        int n = r.nextInt(str.length())+1;
        System.out.println(n);
        a = str.substring(n) + str.substring(0,n);
        }
        return a;
    }
}
