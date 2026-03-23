package day18.inter;

public class Test2 {
    public static void main(String[] args) {
        dog d = new dog(1,"song");
        d.swimming();
        d.eat();

        frog f = new frog(2,"liu");
        f.eat();
        f.swimming();

        rabbit r = new rabbit();
        r.eat();
    }
}
