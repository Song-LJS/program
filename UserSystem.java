package day12;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class UserSystem {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        loop:while (true) { 
             System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作 1登陆 2注册 3忘记密码");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch(choose){
            case 1-> { if(Login(list)){
                System.out.println("登陆成功");/////////////////////
                break loop;
            }else{
                System.out.println("登陆失败");
                continue;
            }
            }
            case 2-> Register(list);
            case 3-> ForgotPassword(list);
            default -> System.out.println("没有这个选项");
        }
        }
    }

    public static boolean Login(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        int f = 0;
        loop2:while (true) { 
            if(f++ == 3){
                System.out.println("三次机会已用完");
                return false;
            }
            System.out.println("输入用户名");
            String name = sc.next();
            System.out.println("输入密码");
            String password = sc.next();
            String s = new String();

            if(OnlyName(list,name)==false){
                System.out.println("用户名未注册，请先注册");
                return false;
            }
            loop3:while (true) { 
                s = sms();
            System.out.println(s);
                System.out.println("请输入验证码");
            String Sms = sc.next();
                if(s.equals(Sms)==false){
                    System.out.println("验证码不正确");
                    continue;
                }else{
                    break loop3;
                }
            }

            int n = -1;
            for(int i = 0;i<list.size();i++){
                if(list.get(i).getName().equals(name)){
                    n = i;
                    break;
                }
            }
            
            if(list.get(n).getName().equals(name) && list.get(n).getPassword().equals(password)){
                return true;
            }else{
                System.out.println("用户名或密码错误");
                continue loop2;
            }
        }
    }

    public static void Register(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        String name = new String();
        String password = new String();
        String sfnumber = new String();
        String number = new String();
        while (true) { 
            System.out.println("输入用户名：");
            name = sc.next();
            if(OnlyName(list,name)){
                System.out.println("用户名重复");
                continue;
            }else{
                if(name.length()<=3 || name.length() >= 15){
                    System.out.println("长度请在3~15之间");
                    continue;
                }else{
                    if(Team(name)){
                        break;
                    }else{
                        System.out.println("用户名组合不合规");
                    }
                }
            }
        }

        while(true){
            System.out.println("输入您的密码：");
        password = sc.next();
        System.out.println("请确认密码");
        String password2 = sc.next();
        if(password.equals(password2)){
            break;
        }else{
            System.out.println("密码错误");
        }
        }

        while(true){
            System.out.println("输入身份证号：");
            sfnumber = sc.next();
            if(sfnumber.length() != 18){
                System.out.println("输入错误,身份证号长度为18");
                continue;
            }else{
                if(sfnumber.charAt(0)=='0'){
                    System.out.println("不能以零开头");
                    continue;
                }else if(sfTest(sfnumber)){
                    System.out.println("请保证前十七位都是数字");
                    continue;
                }else{
                    char c = sfnumber.charAt(sfnumber.length()-1);
                    if((c<='0' || c>='9') && c!='x' && c!='X'){
                        System.out.println("最后一位输入有误");
                        continue;
                    }
                }
            }
            break;
        }

        while (true) { 
            System.out.println("输入手机号：");
            number = sc.next();
            if(number.length() != 11){
                System.out.println("长度必须为11位");
                continue;
            }else if(number.charAt(0) == '0'){
                System.out.println("手机号开头不能为0");
                continue;
            }else{
                if(phonenumber(number)){
                    System.out.println("手机号都要为数字");
                    continue;
                }
            }
            break;
        }

        User user = new User(name,number,password,sfnumber);
        list.add(user);
    }

    public static void ForgotPassword(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String name = sc.next();
        if(OnlyName(list,name)==false){
            System.out.println("未注册");
            return;
        }

        System.out.println("输入身份证号");
        String sfnumber = sc.next();
        System.out.println("输入电话号码");
        String number = sc.next();
        
        int n = -1;
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getName().equals(name)){
                n = i;
                break;
            }
        }

        String sfnumber2 = list.get(n).getSfnumber();
        String number2 = list.get(n).getNumber();
        if(sfnumber2.equals(sfnumber) && number2.equals(number)){
            System.out.println("输入新密码");
            String newPassword = sc.next();
            list.get(n).setPassword(newPassword);
        }else{
            System.out.println("账户信息不匹配，修改失败");
        }
    }

    //检验用户名是否存在
    public static boolean OnlyName(ArrayList<User> list,String name){
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    //检验用户名的组合以及字母个数是否合规
    public static boolean Team(String name){
        int mathNumber = 0;
        int Enumber = 0;
        for(int i = 0;i<name.length();i++){
            if((name.charAt(i)<'A' || name.charAt(i)>'Z') && (name.charAt(i)<'a' || name.charAt(i)>'z')
            && (name.charAt(i)<'0' || name.charAt(i)>'9')){
            return false;
            }
            if(name.charAt(i)>='0' && name.charAt(i)<='9'){
                mathNumber++;
            }else{
                Enumber++;
            }
        }
        if(Enumber==0){
            return false;
        }

        return true;
    }

    //检验身份证号码前十七位
    public static boolean sfTest(String sfnumber){
        for(int i = 0;i<sfnumber.length()-1;i++){
            if(sfnumber.charAt(i)>='0' && sfnumber.charAt(i)<='9'){
                return false;
            }
        }
        return true;
    }

    //检验手机号
    public static boolean phonenumber(String number){
        for(int i = 0;i<number.length();i++){
            if(number.charAt(i)<'0' || number.charAt(i)>'9'){
                        return true;
            }
        }
        return false;
    }

    //生成验证码
    public static String sms(){
        Random r = new Random();
        char[] c = new char[52];
        for(int i = 0;i<26;i++){
            c[i] = (char)(65+i);
        }
        for(int i = 26;i<52;i++){
            c[i] = (char)(97+i-26);
        }

        String s = new String();
        for(int i = 0;i<4;i++){
            s = s+c[r.nextInt(52)];
        }
        char a = (char)(48+r.nextInt(10));
        s = s+a;
        s = random(s);
        return s;
    }

    //打乱验证码的顺序
    public static String random(String s){
        Random r = new Random();
        char[] c = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            int n = r.nextInt(s.length());
            char t = c[i];
            c[i] = c[n];
            c[n] = t;
        }
        String s1 = new String(c);
        return s1;
    }
}
