package day42;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day41\\a.txt");
        FileOutputStream fos = new FileOutputStream("day42\\a.txt");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }

        fos.close();
        fis.close();
    }
}
