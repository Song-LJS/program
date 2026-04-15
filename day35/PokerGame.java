package day35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer,String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] s1 = {"♣","♥","♦","♠"};
        String[] s2 = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        Integer n = 1;
        for(String number:s1){
            for(String color:s2){
                hm.put(n, color+number);
                list.add(n);
                n++;
            }
        }

        hm.put(n, "小王");
        list.add(n);
        n++;
        hm.put(n, "大王");
        list.add(n);
    }

    public PokerGame() {
        Collections.shuffle(list);

        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for(int i = 0;i<list.size();i++){
            if(i<=2){
                lord.add(list.get(i));
            }

            if(i % 3 == 0){
                player1.add(list.get(i));
            }else if(i%3==1){
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }

        look("宋丽娟", player1);
        look("底牌", lord);
        look("刘家硕", player2);
        look("张颖雪", player3);
    }

    public static void look(String name,TreeSet<Integer> ts){
        System.out.print(name + "： ");
        for(Integer n:ts){
            System.out.print(hm.get(n)+" ");
        }
        System.out.println(" ");
    }
}
