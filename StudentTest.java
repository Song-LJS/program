package day11;
import java.util.ArrayList;
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(18,"songlijuan");
        Student s2 = new Student(19,"liujiasuo");
        
        list.add(s1);
        list.add(s2);

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i).getName()+" "+list.get(i).getAge());
        }
    }
}
