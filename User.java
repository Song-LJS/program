package day12;

public class User {
    private String name;
    private String password;
    private String sfnumber;
    private String number;

    public User() {
    }

    public User(String name, String number, String password, String sfnumber) {
        this.name = name;
        this.number = number;
        this.password = password;
        this.sfnumber = sfnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSfnumber() {
        return sfnumber;
    }

    public void setSfnumber(String sfnumber) {
        this.sfnumber = sfnumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
