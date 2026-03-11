package day7;

public class Girl {
    private String sex;
    private int age;
    private double height;
    private String name;

   public void setAge(int a){
    if(a>=18&&a<=30){
        age = a;
    }else{
        System.out.println("非法数据");
    }
   }

   public int getAge(){
    return age;
   }

   public void setName(String n){
    name = n;
   }

   public String getName(){
    return name;
   }
   
    public static void angry(){
        System.out.println("女朋友生气了");
    }

    public static void sleep(){
        System.out.println("女朋友睡觉了");
    }
}
