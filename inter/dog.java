package day18.inter;

public class dog extends animal implements swim{

    public dog() {
    }

    public dog(int age, String name) {
        super(age, name);
    }
    
    @Override
    public void eat(){
        System.out.println("狗在吃骨头");
    }

    @Override
    public void swimming(){
        System.out.println("狗在狗刨");
    }
}
