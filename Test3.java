package day5;

public class Test3 {
    public static void main(String[] args) {
        int[] a = {12,436,7656,3,43};
        int max = compare(a);
        System.out.println("最大值是" + max);
    }

    public static int compare(int[] a){
        int max = a[0];
        for(int i = 1;i<a.length;i++){
            max = max>a[i]?max:a[i];
        }
        return max;
    }
}
