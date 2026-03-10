package day6;
import java.util.Random;
public class Test4 {
    public static void main(String[] args) {
        int[] a = {2,588,888,1000,10000};
        Random r = new Random();
        for(int i = 5;i>=0;i--){
            int n = r.nextInt(i);
            System.out.println(a[n]+"元的奖金被抽出");
            for(int j = n;j<i-1;j++){
                a[j] = a[j+1];
            }
        }
    }
}
