package day26;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {6,1,2,7,9,3,4,5,10,8};
        fun(a,0,a.length-1);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void fun(int[] a,int i,int j){
        int start  = i;
        int end = j;

        if(start > end){
            return;
        }

        int baseNumber = a[i];

        while(start != end){
            while (true) {
                if(start >= end || a[end]<baseNumber){
                    break;
                }   
                end--;
            }

             while (true) { 
                if(start >= end||a[start]>baseNumber){
                    break;
                } 
                start++;
            }

            int t = a[start];
            a[start] = a[end];
            a[end] = t;
        }

        int n = a[i];
        a[i] = a[start];
        a[start] = n;

        fun(a,i,start-1);
        fun(a,start+1,j);
    }
}
