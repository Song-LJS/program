package day6;
import java.util.Random;
public class Test5 {
    public static void main(String[] args) {
        int[] a = {2,588,888,1000,10000};
        Random r = new Random();
        for(int i = 0;i<a.length;i++){
            int n = r.nextInt(a.length);
            int j = a[i];
            a[i] = a[n];
            a[n] = j;
        }
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]+"元的奖金被抽出");
        }
    }
}
