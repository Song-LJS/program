package day22;
import java.util.Scanner;
public class MathDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入n:");
        double n = sc.nextDouble();
        while(true){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.println(n+"不是质数");
                return;
            }
        }
        System.out.println(n+"是质数");
        return;
    }
    }
}
