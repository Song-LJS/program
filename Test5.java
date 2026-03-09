package day5;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,4,23,5656,3,3,23,43};
        System.out.println("输入第一个索引：");
        int from = sc.nextInt();
        System.out.println("输入第二个索引：");
        int to = sc.nextInt();

        int[] b = fun(a,from,to);
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }

    public static int[] fun(int[] a,int from,int to){
        int[] b = new int[to-from+1];
        for(int i = from,j = 0;j<b.length;i++,j++){
            b[j] = a[i];
        }
        return b;
    }
}
