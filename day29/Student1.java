package day29;

public class Student1 implements Comparable<Student1>{
    private String name;
    private int age;
    private int math;
    private int chinese;
    private int english;
    public Student1() {
    }

    public Student1(String name, int age, int math, int chinese, int english) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public int compareTo(Student1 o){
        int sum1 = this.getChinese()+this.getEnglish()+this.getMath();
        int sum2 = o.getChinese()+o.getEnglish()+o.getMath();
        int i = sum1 - sum2;
        i = i==0?this.getChinese()-o.getChinese():i;
        i = i==0?this.getMath()-o.getMath():i;
        i = i==0?this.getEnglish()-o.getEnglish():i;
        i = i==0?this.getAge()-o.getAge():i;
        i = i==0?this.getName().compareTo(o.getName()):i;
        return i;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student1{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", math=").append(math);
        sb.append(", chinese=").append(chinese);
        sb.append(", english=").append(english);
        sb.append('}');
        return sb.toString();
    }
}
