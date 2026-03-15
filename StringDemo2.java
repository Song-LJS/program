package day10;

public class StringDemo2 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        change(a);
    }

    public static void change(int[] a){
        StringBuilder sb = new StringBuilder("[");
        if(a.length == 0){
            sb.append("]");
        }
        for(int i = 0;i<a.length;i++){
            if(i!=a.length-1){
                sb.append(a[i]).append(',');
            }else{
                sb.append(a[i]).append("]");
            }
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
