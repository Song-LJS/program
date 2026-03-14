package day9;
import java.util.Scanner;
public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
    while(true){
        System.out.println("输入金额：");
        money = sc.nextInt();
        if(money>=0 && money<=9999999){
            break;
        }else{
            System.out.println("金额无效");
        }
    }

    String str = "";
    while(true){
        int n = money%10;
        if(money!=0){
            str = change(n)+str;
            money/=10;
        }else{
            break;
        }
    }
    System.out.println(str);

    int count = 7-str.length();
    for(int i = 0;i<count;i++){
        str = "零"+str;
    }
    System.out.println(str);

    String[] b = {"佰","拾","万","仟","佰","拾","元"};

    String result = "";
    for(int i = 0;i<str.length();i++){
        char c = str.charAt(i);
        result = result+c+b[i];
    }
    System.out.println(result);
    }
    
    public static String change(int n){
        String[] str = {"零","壹","贰","叁","肆","伍","六","柒","捌","玖"};
        return str[n];
    }
}
