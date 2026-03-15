package day10;
import java.util.Random;
public class StringDemo7 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        for(int i = 0;i<26;i++){
            arr[i] = (char)(65 + i);
            arr[i+26] = (char)(97+i);
        }
        
        String str = change(arr);
        System.out.println(str);
    }

    public static String change(char[] a){
        String str = "";
        Random r = new Random();
        for(int i = 0;i<4;i++){
            str = str+a[r.nextInt(a.length)];
        }
        str = str + r.nextInt(10);
        char[] c = str.toCharArray();
        str = fun(c);
        return str;
    }

    public static String fun(char[] b){
        Random r = new Random();
        int n = r.nextInt(b.length);
        for(int i = 0;i<b.length;i++){
            char t = b[i];
            b[i] = b[n];
            b[n] = t;
        }
        String str = new String(b);
        return str;
    }
}
