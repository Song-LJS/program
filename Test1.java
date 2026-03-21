package day16;

public class Test1 {
    public static void main(String[] args) {
        Maintainer m = new Maintainer("12","song");
        m.work();
        String id = m.getId();
        System.out.println(id);

        Buyer b = new Buyer();
        b.work();

        Tutor t = new Tutor();
        t.work();
    }
    
}
