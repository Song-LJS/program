package day5;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("机票原价是：");
        double free = sc.nextDouble();
        System.out.println("输入现在的月份：");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("输入做的舱级：");
        String grade = sc.nextLine();
        System.out.println("打折后的费用是"+fun(free,month,grade));
    }

    public static double fun(double free,int month,String grade){
        System.out.println(grade);
        if(month>=5&&month<=10){
            if("头等舱".equals(grade)){
                return free*0.9;
            }else{
                return free*0.85;
            }
        }else{
            if("头等舱".equals(grade)){
                return free*0.7;
            }else{
                return free*0.65;
            }
        }
    }
}
