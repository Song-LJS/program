package day41;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day41\\a.txt");
        fos.write(97);
        fos.close();
    }
}