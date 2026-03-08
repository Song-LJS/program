package day4;
import java.util.Random;
public class Test5 {
    public static void main(String[] args){
        Random r = new Random();
        int[] a = new int[10];
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt(100)+1;
            System.out.print(a[i]+" ");
            sum+=a[i];
        }
        System.out.println("和为"+sum);
        int avg = sum/a.length;
        System.out.println("平均数为"+avg);
        int count = 0;
        for(int i = 0;i<a.length;i++){
            if(avg>a[i]){
                count++;
            }
        }
        System.out.println("比平均数小的数有"+count+"个");
    }
}
