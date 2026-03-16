package day11;
import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

    list.add("song");
    list.add("li");
    list.add("juan");

    System.out.print("[");
    for(int i =0;i<list.size();i++){
        if(i == list.size()-1){
            System.out.print(list.get(i));
        }else{
            System.out.print(list.get(i)+",");
        }
    }
    System.out.print("]");
    System.out.println(list);
   }

}
