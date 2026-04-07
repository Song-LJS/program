package day28;

public class Test1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("song");
        list.add("li");
        list.add("juan");

        String str = list.toString();
        System.out.println(str);
    }
}
