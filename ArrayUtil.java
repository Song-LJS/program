package day13;

public class ArrayUtil {
    
    private ArrayUtil(){}

    public static String printArr(int[] a){
        StringBuilder sb = new StringBuilder("[");
        for(int i= 0;i<a.length;i++){
            if(i==a.length-1){
                sb.append(a[i]);
            }else{
                sb.append(a[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAerage(double[] b){
        double sum =0;
        for(int i = 0;i<b.length;i++){
            sum+=b[i];
        }
        return sum/b.length;
    }
}
