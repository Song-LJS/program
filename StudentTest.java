package day9;

public class StudentTest {
    public static void main(String[] args) {
        
        Student[] arr = new Student[3];
        Student stu1 = new Student(18,"1","宋丽娟");
        Student stu2 = new Student(19,"2","刘家硕");
        //Student stu3 = new Student(20,"3","刘大力");

        arr[0] = stu1;
        arr[1] = stu2;
        //arr[2] = stu3;

        Student stu4 = new Student(21,"4","宋亚");
        
        String id = stu4.getId();
        if(flag(arr,id)){
            System.out.println("该用户已存在");
        }else{
            int count = getLength(arr);
            if(arr.length == count){
                //建立新的数组
                Student[] arr2 = new Student[arr.length+1];
                for(int i = 0;i<arr.length;i++){
                    arr2[i] = arr[i];
                }
                arr2[count] = stu4;
                printf(arr2,count);
            }else{
                arr[count] = stu4;
                printf(arr,count);
            }
        }

    }

    //查找id
    public static int findId(Student[] a,String id){
        int n = -1;
        for(int i = 0;i<a.length;i++){
            if("id".equals(a.getId())){
                n = i;
                return n;
            }
        }
        return n;
    }

    //遍历
    public static void printf(Student[] a,int count){
        for(int i = 0;i<=count;i++){
            System.out.println(a[i].getAge()+" "+a[i].getId()+" "+a[i].getName());
        }
    }

    //计算数组中现有元素的个数
    public static int getLength(Student[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //检查id的唯一性
    public static boolean flag(Student[] arr,String id){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != null){
            if("id".equals(arr[i].getId())){
                return true;
            }
        }
        }
        return false;
    }
}
