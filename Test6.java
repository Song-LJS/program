package day6;
import java.util.Random;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        int[] a = fun();
        int[] b = userNumber();
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for(int i = 0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }

    }

    //

    public static int[] userNumber(){
        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<a.length-1;){
            System.out.println("请输入第"+(i+1)+"个号码球");
            int n = sc.nextInt();
            if(n>=1&&n<=33&&flag(a,n)){
                a[i] = n;
                i++;
            }else{
                System.out.println("请重新输入:");
            }
        }
        int count = 0;
        while(count==0){
        System.out.println("请输入第7个号码球");
        int b = sc.nextInt();
        if(b>=1&&b<=16){
            a[a.length-1] = b;
            count++;
        }else{
            System.out.println("请重新输入");
        }
    }
        return a;
    }

    //生成红蓝色球
    public static int[] fun(){
        int[] a = new int[7];
        Random r = new Random();
        for(int i = 0;i<a.length-1;){
            int number = r.nextInt(33)+1;
            if(flag(a,number)){
                a[i] = number;
                i++;
            }
        }

        a[6] = r.nextInt(16)+1;

        return a;
    }

    //判断红球是否重复
    public static boolean flag(int[] a,int n){
        for(int i = 0;i<a.length;i++){
            if(a[i]==n)
                return false;
        }
        return true;
    }
}
