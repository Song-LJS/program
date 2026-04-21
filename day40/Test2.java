package day40;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Code\\Java学习\\aaa");
        f.mkdirs();

        File f2 = new File(f,"a.txt");
        boolean b = f2.createNewFile();

        if(b){
            System.out.println("创建成功");
        }else{
        System.out.println("创建失败");
        }
}
}