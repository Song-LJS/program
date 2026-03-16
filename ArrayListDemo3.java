package day11;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        for(int i = 0;i<2;i++){
            Student stu = new Student();
            System.out.println("输入学生的姓名：");
            String name = sc.next();
            System.out.println("输入学生的年龄：");
            int age = sc.nextInt();
            
            stu.setName(name);
            stu.setAge(age);

            list.add(stu);
        }

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i).getName()+" "+list.get(i).getAge());
        }
    }
}
