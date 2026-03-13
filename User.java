package day8;

public class User{
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    public User(){}

    public User(String username,String password,String email,String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public void setusername(String username){
        this.username = username;
    }

    public String getusername(){
        return username;
    }

    public void setpassword(String password){
        this.password = password;
    }

    public String getpassword(){
        return password;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String getemail(){
        return email;
    }

    public void setgender(String gender){
        this.gender = gender;
    }

    public String getgender(){
        return gender;
    }

    public void setage(int age){
        this.age = age;
    }

    public int getage(){
        return age;
    }
}