package day23;

public class RegexDemo1 {
    public static void main(String[] args) {
        String regex1 = "\\w{4,16}";
        System.out.println("sWFJDF_123".matches(regex1));

        String regex2 = "[1-9]\\d{16}(\\d|[Xx])";
        System.out.println("52272520060629006x".matches(regex2));

        String regex3 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])([12]\\d|0[1-9]|3[01])\\d{3}[\\d(?i)x]";
        System.out.println("522725200606290061".matches(regex3));
    }
}
