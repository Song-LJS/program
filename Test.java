package day17;

public class Test {
    public static void main(String[] args) {
        Dog a = new Dog(1,"黑");
        Person p = new Person(23,"宋丽娟");
        p.keepPet(a, "骨头");
        Cat b = new Cat(2, "白");
        p.keepPet(b, "小鱼干");
    }
}
