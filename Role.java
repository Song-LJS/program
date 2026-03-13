package day8;
import java.util.Random;

public class Role{
    private String name;
    private int blood;

    public Role(){}

    public Role(String name,int blood){
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }

    public int getBlood(){
        return blood;
    }

    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        int remainblood = role.getBlood() - hurt;
        remainblood = remainblood<0?0:remainblood;
        role.setBlood(remainblood);
        System.out.println(this.getName()+"打了"+role.getName()+"一拳,造成了"+hurt+"点伤害，"
        +role.getName()+"还剩下"+role.getBlood()+"点血");
    }
}