package day9;
import java.util.Scanner;
public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        change(str);
    }

    public static void change(String str){
        String str2 = new String();
        for(int i = str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            str2 += c;
        }
        System.out.println(str2);
    }
}
