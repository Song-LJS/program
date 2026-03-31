package day25;

public class Test7 {
    public static void main(String[] args) {
        int[] a = {2,4,5,3,1};

        for(int j = 0;j<a.length-1;j++){
            for(int i = 0;i<a.length-1-j;i++){
                if(a[i]>a[i+1]){
                    int t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                }
            }
        }

        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
