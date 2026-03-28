package day22;

public class MathDemo3 {
    public static void main(String[] args) {
        int t = 0;
        for(int i = 10;i<100;i++){
            if(fun(i)){
                t++;
            }
        }
        System.out.println(t);
    }

    public static boolean fun(int i){
        int t = i;
        int ge = i%10;
        int sum =0;
        while(i!=0){
            sum+=Math.pow(ge, 2);
            i/=10;
        }
        if(sum == t){
            return true;
        }
        return false;
    }
}
