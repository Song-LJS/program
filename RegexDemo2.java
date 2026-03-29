package day23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String str = "Java自从95年间以来，经历了很多版本，目前企业中用得最多的是Java8和Java11，"+
        "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信Java17也会逐渐登上历史舞台";

        Pattern p = Pattern.compile("Java\\d{0,2}");

        Matcher m = p.matcher(str);

        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
