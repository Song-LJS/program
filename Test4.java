package day26;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        GirlFriend g1 = new GirlFriend(18,155.0,"songlijuan");
        GirlFriend g2 = new GirlFriend(19,166.5,"liujiashuo");
        GirlFriend g3 = new GirlFriend(18,160.3,"zhangyx");
        GirlFriend g4 = new GirlFriend(19,166.5,"meinv");

        GirlFriend[] G = {g1,g2,g3,g4};

        Arrays.sort(G, (o1,o2)->{
                if(o1.getAge() == o2.getAge()){
                    if(o1.getHeight() == o2.getHeight()){
                        return o1.getName().compareTo(o2.getName());
                    }
                    double t = o1.getHeight()-o2.getHeight();
                    if(t > 0){
                        return 1;
                    }else if(t<0){
                        return -1;
                    }else{
                        return 0;
                    }
                }
                return o1.getAge()-o2.getAge();
        });

        System.out.println(Arrays.toString(G));
    }
}
