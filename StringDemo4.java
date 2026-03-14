package day9;
import java.util.Scanner;
public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        while (true) { 
            System.out.println("输入你的电话号码：");
        number = sc.next();
        if(number.length() == 11){
            break;
        }else{
            System.out.println("号码错误！");
        }
        }
        String n = change(number);
        System.out.println(n);
    }

    public static String change(String number){
        String str = "";
        for(int i = 0;i<number.length();i++) { 
            if(i>=0&&i<=2){
                char c = number.charAt(i);
                str = str + c;
            }else if(i<7){
                str = str + "*";
            }else{
                char c = number.charAt(i);
                str = str + c;
            }
        }
        return str;
    }
}
