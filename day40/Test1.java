package day40;

import java.io.File;

public class Test1{
   public static void main(String[] args) {
     String str = "D:\\Code\\Java学习";
    File f1 = new File(str);
    System.out.println(f1);

    String parent =  "D:\\Code\\";
    String child = "Java学习";
    File f2 = new File(parent,child);
    System.out.println(f2);

    File parent2 = new File("D:\\Code\\");
    String child2 = "Java学习";
    File f4 = new File(parent2,child2);
    System.out.println(f4);
   }
}