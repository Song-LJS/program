package day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s1.parse(str);

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = s2.format(date);
        System.out.println(str2);
    }
}
