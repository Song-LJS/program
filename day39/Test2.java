package day39;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gf g = new gf();
        while (true) { 
            try {
                System.out.println("输入女朋友的名字：");
                String n = sc.nextLine();
                g.setName(n);
                System.out.println("输入女朋友的年龄：");
                String age = sc.nextLine();
                int a = Integer.parseInt(age);
                g.setAge(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("格式转换异常");
            } catch (RuntimeException e){
                System.out.println("名字或年龄输入错误");
            }
        }

        System.out.println(g.toString());
    }
}
