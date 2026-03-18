package day13;

public class TestDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        String s = ArrayUtil.printArr(a);
        System.out.println(s);

        double[] b = {1.2,2.3,5.4,32.2};
        double n = ArrayUtil.getAerage(b);
        System.out.println(n);
    }
}
