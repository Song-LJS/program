package day11;
import java.util.ArrayList;
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User(1,"songlijuan",12345);
        User u2 = new User(2,"liujiasuo",520);
        
        list.add(u1);
        list.add(u2);

        System.out.println(fun(list,2));
    }

    public static boolean fun(ArrayList<User> list,int id){
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
}
