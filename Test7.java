package day26;

public class Test7 {
    public static void main(String[] args) {
        int t = fun(20);
        System.out.println(t);
    }

    public static int fun(int n){
        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        if(n == 3){
            return 4;
        }

        return fun(n-1)+fun(n-2)+fun(n-3);
    }
}
