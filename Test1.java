package day4;

public class Test1 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0;i < a.length;i++){
            System.out.println(a[i]);
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
