package day34;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame{
    static ArrayList<String> list = new ArrayList<>();

    static{
        String[] s1 = {"♣","♥","♦","♠"};
        String[] s2 = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for(int i = 0;i<s1.length;i++){
            for(int j = 0;j<s2.length;j++){
                String c = s1[i];
                String n = s2[j];
                list.add(c+n);
            }
        }

        list.add("小王");
        list.add("大王");
    }

    public PokerGame() {
        Collections.shuffle(list);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for(int i = 0;i<list.size();i++){
            if(i<=2){
                lord.add(list.get(i));
                continue;
            }

            if(i%3 == 0){
                player1.add(list.get(i));
            }else if(i%3 == 1){
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }

        look("宋丽娟", player1);
    }

    public static void look(String name,ArrayList<String> list){
        System.out.print(name+":");
        for(String a : list){
            System.out.print(a+" ");
        }

        System.out.println(" ");
    }

}