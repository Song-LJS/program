package day10;

public class StringDemo9 {
    public static void main(String[] args) {
        String str = "hello liu jia suo iloveyou";
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count = 0;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
