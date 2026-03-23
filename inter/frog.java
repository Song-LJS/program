package day18.inter;

public class frog extends animal implements swim{

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
    public void swimming(){
        System.out.println("青蛙在蛙泳");
    }
}
