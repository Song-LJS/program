package day5;
import java.util.Random;
public class Test7 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] a = new char[52];
        for(int i =0;i<a.length;i++){
            if(i<=25){
                a[i] = (char)(65+i);
            }else{
                a[i] = (char)(97+i-26);
            }
        }
        fun(a);
    }

    public static void fun(char[] a){
        String b = "";
        Random r = new Random();
        for(int i = 0;i<4;i++){
            b = b + a[r.nextInt(52)];
        }
        b = b+r.nextInt(10);
        System.out.println(b);
    }
}
