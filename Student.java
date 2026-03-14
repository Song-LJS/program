package day9;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student() {
    }

    public Student(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
