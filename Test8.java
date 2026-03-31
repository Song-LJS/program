package day25;

public class Test8 {
    public static void main(String[] args) {
        int[] a = {2,4,5,3,1};

        for(int j = 0;j<a.length-1;j++){
            for(int i = j+1;i<a.length;i++){
                if(a[j]>a[i]){
                    int n = a[j];
                    a[j] = a[i];
                    a[i] = n;
                }
            }
        }
        
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
}
