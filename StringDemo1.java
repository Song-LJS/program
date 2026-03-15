package day10;
import java.util.Scanner;
public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb  = new StringBuilder();
        System.out.println("输入字符串：");
        sb.append(sc.nextInt());
        String str = sb.toString();
        String str1 = sb.reverse().toString();
        if(str.equals(str1)){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
        
    }
}
