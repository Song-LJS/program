package day8;

public class GirlF {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public GirlF() {
    }

    public GirlF(int age, String gender, String hobby, String name) {
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
