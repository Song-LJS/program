package day42;

import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day42\\a.txt");
        int b1 = fis.read();
        System.out.println(b1);

        int b2 = fis.read();
        System.out.println(b2);

        int b3 = fis.read();
        System.out.println(b3);

        int b4 = fis.read();
        System.out.println(b4);

        fis.close();
    }
}
