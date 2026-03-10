package day6;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入原密码：");
        int a = 1985;
        int[] b = new int[4];
        for(int i = 0;i<b.length;i++){
            b[i] = (a%10+5)%10;
            a/=10;
        }
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }
}
