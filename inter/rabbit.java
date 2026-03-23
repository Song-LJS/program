package day18.inter;

public class rabbit extends animal{

    public rabbit() {
    }

    public rabbit(int age, String name) {
        super(age, name);
    }
    
    @Override
    public void eat(){
        System.out.println("兔子在吃胡罗卜");
    }

    
}
