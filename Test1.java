package day24;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("输入一个整数：");
            String str = sc.nextLine();
            if(!fun(str)){
                System.out.println("数字范围不再1~100，请重新输入：");
                continue;
            }else{
                list.add(Integer.valueOf(str));
            }

            if(!result(list)){
                break;
            }
        }

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static boolean fun(String str){
        int num = Integer.parseInt(str);
        if(num>=1 && num<=100){
            return true;
        }
        return false;
    } 

    public static boolean result(ArrayList<Integer> list){
        int sum = 0;
        for(int i = 0;i<list.size();i++){
            sum+=list.get(i);
        }
        if(sum>200){
            return false;
        }
        return true;
    }
}
