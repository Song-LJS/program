package day18;

public class frog extends Animal{

    public frog() {
    }

    public frog(int age, String name) {
        super(age, name);
    }
    
    @Override
    public void eat(){
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void drink(){
        System.out.println("青蛙在喝水");
    }
}
