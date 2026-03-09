package day5;
import java.util.Random;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] a = new int[r.nextInt(10)+1];
        System.out.println("请输入"+a.length+"个数：");
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        printfArr(a);
    }

    public static void printfArr(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
