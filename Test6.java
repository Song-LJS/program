package day4;

public class Test6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        int n = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = n;
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
