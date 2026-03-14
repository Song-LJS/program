package day9;
public class StringDemo {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        String str = arrToString(a);
        System.out.println(str);
    }

    public static String arrToString(int[] a){
        String str = "[";
        if(a == null){
            return "";
        }

        if(a.length==0){
            return "[]";
        }

            for(int i = 0;i<a.length;i++){
                if(i == a.length-1){
                    str= str+a[i];
                }else{
                    str = str+a[i]+",";
                }
            }
        str = str+"]";
        return str;
    }

}
