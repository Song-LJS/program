package day10;
import java.util.Random;
public class StringDemo6 {
    public static void main(String[] args) {
        String str = "sdfgh";
        
        char[] arr = str.toCharArray();

        String NewStr = change(arr);
        System.out.println(NewStr);
    }

    public static String change(char[] a){
        Random r = new Random();
        int n = r.nextInt(a.length);
        for(int i = 0;i<a.length;i++){
            char t = a[i];
            a[i] = a[n];
            a[n] = t;
        }
        String str = new String(a);
        return str;
    }
}
