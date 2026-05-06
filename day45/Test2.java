package day45;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("day45\\a.txt",true);

        //fw.write("你好呀世界",1,3);

        char[] chars = {'我','想','越','来','越','好'};
        fw.write(chars);
        fw.close();
    }
}
