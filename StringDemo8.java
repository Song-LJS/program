package day10;

public class StringDemo8 {
    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "100";
        int num11 = StrtoInt(num1);
        int num22 = StrtoInt(num2);
        int num3 = num11*num22;
        //String str = fun(num3);
        String str = "" + num3;
        System.out.println(str);
    }

    public static int StrtoInt(String a){
        char[] c = a.toCharArray();
        int n = 0;
        for(int i = 0;i<a.length();i++){
            n = n*10 + (c[i]-48);
        }
        System.out.println(n);
        return n;
    }

    public static String fun(int n){
        String str = "";
        while(n!=0){
            str = (n%10)+str;
            n/=10;
        }
        return str;
    }
}
