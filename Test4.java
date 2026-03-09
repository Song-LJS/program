package day5;

public class Test4 {
    public static void main(String[] args) {
        int[] a = {21,43,6,34};
        if(find(a,6)){
            System.out.println("该数字存在");
        }else{
            System.out.println("该数字不存在");
        }
    }

    public static boolean find(int[] a,int n){
        for(int i =0;i<a.length;i++){
            if(a[i]==n){
                return true;
            }
        }
        return false;
    }
}
