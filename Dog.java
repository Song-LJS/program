package day18;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }
    
    @Override
    public void eat(){
        System.out.println("狗在吃骨头");
    }

    @Override
    public void drink(){
        System.out.println("狗在喝水");
    }
}
