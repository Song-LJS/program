package day10;

public class StringDemo4 {
    public static void main(String[] args) {
        String a = "asdfg";
        String b = "dfgas";
        if(a.length() != b.length()){
            System.out.println(false);
        }else{
            boolean flag = compare(a,b);
            System.out.println(flag);
        }
    }

    public static boolean compare(String a,String b){
        for(int i = 0;i<a.length();i++){
            char c = a.charAt(0);
        String str = a.substring(1);
        StringBuilder sb = new StringBuilder(str);
        a = sb.append(c).toString();
        if(sb.toString().equals(b)){
            return true;
        }
        }
        return false;
    }
}
