package day6;

public class Test2 {
    public static void main(String[] args) {
    //5 6 7 8 9取余前
    //0 1 2 3 4取余后

    //0 1 2 3 4
    //5 6 7 8 9
    int number = 8346;
    int t = number;
    int count = 0;
    while(number != 0){
        number/=10;
        count++;
    }
    int[] a = new int[count];
    for(int i = 0;i<a.length;i++){
        a[i] = t%10;
        t/=10;
    } 
    int n = 0;
    for(int i = 0;i<a.length;i++){
    if(a[i] >=5 && a[i]<10){
        n = n*10 + a[i]-5;
    }else{
        n = n*10 + a[i]+5;
    }
    }
    System.out.println(n);
    }
}
