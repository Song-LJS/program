package day26;

public class Test5 {
    public static void main(String[] args) {
        int sum = fun(3);
        System.out.println(sum);
    }

    public static int fun(int n){
        if(n == 1 || n==2){
            return 1;
        }
        
        return fun(n-1)+fun(n-2);
    }
}
