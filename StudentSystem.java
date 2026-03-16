package day11;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while(true){
            System.out.println("-------------欢迎来到宋丽娟小课堂-------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请做出你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose  =  sc.next();
            switch(choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;//或者System.exit(0)可以停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        String address;
        int age;
        fun:while(true){
            System.out.println("输入学生的id：");
        id = sc.next();
        for(int i = 0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                System.out.println("该id已存在");
                continue fun;
            }
        }
        System.out.println("输入学生的姓名：");
        name = sc.next();
        System.out.println("输入学生的年龄：");
        age = sc.nextInt();
        System.out.println("输入学生的家庭住址：");
        address = sc.next();
        break;
        }
        
        Student stu = new Student(name,age,id,address);
        list.add(stu);
        System.out.println("添加成功！");
    }

    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("添加学生");
        
    }

    public static void updateStudent(ArrayList<Student> list){
        System.out.println("添加学生");
        
    }

    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息,请添加后查询");
            return;
        }

        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+
        list.get(i).getAge()+"\t"+list.get(i).getAddress()+"\t");
        }
    }
}
