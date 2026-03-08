package day4;

public class Test4 {
    public static void main(String[] args){
        int[] a = {33,5,22,44,55};
        int n = a[0];
        for(int i = 1;i<a.length;i++){
            n = n>a[i]?n:a[i];
        }
        System.out.println(n);
    }
}
