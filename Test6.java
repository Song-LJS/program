package day26;

public class Test6 {
    public static void main(String[] args) {
        int t = fun(10);
        System.out.println(t);
    }

    public static int fun(int n){
        if(n == 1){
            return 1;
        }

        return (fun(n-1)+1)*2;
    }
}
