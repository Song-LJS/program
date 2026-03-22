package day17;

public class Dog extends Animal{

    public Dog(int age, String color) {
        super(age, color);
    }
    
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色狗两只前腿死死的抱住"+something+"猛吃");
    }

    public void lookhome(){
        System.out.println("猫在抓老鼠");
    }
}
