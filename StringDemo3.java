package day10;
import java.util.Scanner;
public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        //检验字符串是否符合要求
        while (true) { 
            int count = 0;
            System.out.println("输入字符串：");
            str = sc.next();
            if(str.length()>9){
                continue;
            }
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                    count++;
                    break;
                }
            }
            if(count ==0){
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            int number = c - '0';
            String str1 = change(number);
            sb.append(str1);
        }

        System.out.println(sb);
    }

    //转换成罗马数字
    public static String change(int n){
        String[] str = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return str[n];
    }
}
