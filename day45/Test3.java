package day45;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException{
        File src = new File("day44\\a.txt");
        File dest = new File("day45\\a.txt");

        copydir(src,dest);
    }

    private static void copydir(File src,File dest) throws IOException{
        dest.mkdirs();

        File[] files = src.listFiles();
        for(File file : files){
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }

                fos.close();
                fis.close();
            }else{
                copydir(file, new File(dest,file.getName()));
            }
        }
    }
}
