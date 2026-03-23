package day18;

public class Sheep extends Animal{

    public Sheep() {
    }

    public Sheep(int age, String name) {
        super(age, name);
    }
    
    @Override
    public void eat(){
        System.out.println("山羊在吃草");
    }

    @Override
    public void drink(){
        System.out.println("山羊在喝水");
    }
}
