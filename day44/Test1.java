package day44;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        String str2 = new String(bytes1);
        System.out.println(str2);
    }
}