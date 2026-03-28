package day22;


public class RegexDemo1{
    public static void main(String[] args) {
        String regex1 = "1[3-9]\\d{9}";
    System.out.println("13379620926".matches(regex1));
    }
}