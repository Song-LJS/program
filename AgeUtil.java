package day13;
import java.util.ArrayList;
public class AgeUtil {
    
    private AgeUtil(){}

    public static int MaxAge(ArrayList<Student> list){
        int age = list.get(0).getAge();
        for(int i = 1;i<list.size();i++){
            age = age>list.get(i).getAge()?age:list.get(i).getAge();
        }
        return age;
    }
}
