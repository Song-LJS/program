package day15;

public class manager extends employees{
    private String money;

    public manager(){}

    public manager(String id, String name, int salary, String money) {
        super(id, name, salary);
        this.money = money;
    }

    @Override
    public void work(){
        System.out.println("管理他人");
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}