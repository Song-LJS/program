package day5;

public class Test1 {
    public static void main(String[] args){
        long n1 = 23423;
        long n2 = 5354342;
        compare(n1,n2);
    }

    public static void compare(short n1,short n2){
        System.out.println("short");
        System.out.println(n1==n2);
    }

    public static void compare(byte n1,byte n2){
        System.out.println("byte");
        System.out.println(n1==n2);
    }

    public static void compare(long n1,long n2){
        System.out.println("long");
        System.out.println(n1==n2);
    }

    public static void compare(int n1,int n2){
        System.out.println("int");
        System.out.println(n1==n2);
    }
}
