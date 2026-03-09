package day5;
import java.util.Random;
public class Test8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[6];
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt(101);
            System.out.print(a[i]+" ");
            sum+=a[i];
        }
        System.out.println(" ");
        int avg = (sum-max(a)-min(a))/4;
        System.out.println("得分为"+avg);
    }

    public static int max(int[] a){
        int max = a[0];
        for(int i = 1;i<a.length;i++){
            max = max>a[i]?max:a[i];
        }
        return max;
    }

    public static int min(int[] a){
        int min = a[0];
        for(int i = 1;i<a.length;i++){
            min = min<a[i]?min:a[i];
        }
        return min;
    }
}
