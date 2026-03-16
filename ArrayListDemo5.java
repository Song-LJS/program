package day11;
import java.util.ArrayList;
public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("xiaomi",1000);
        Phone p2 = new Phone("pingguo",8000);
        Phone p3 = new Phone("cuizi",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> list2 = fun(list);
        for(int i = 0;i<list2.size();i++){
            System.out.println(list2.get(i).getBrand()+" "+list2.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> fun(ArrayList<Phone> list){
        ArrayList<Phone> list2 = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getPrice()<3000){
                list2.add(list.get(i));
            }
        }
        return list2;
    }
}
