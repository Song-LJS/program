package day22;

public class MathDemo2 {
    public static void main(String[] args) {
        int temp = 0;
        for(int i = 100;i<1000;i++){
            if(fun(i)){
                temp++;
            }
        }
        System.out.println(temp);
    }

    public static boolean fun(int  i){
        int t= i;
        int ge;
        int count = 0;
        while(i!=0){
            ge = i%10;
            count += Math.pow(ge, 3);
            i/=10;
        }
        if(count == t){
            return true;
        }else{
            return false;
        }
    }
}
