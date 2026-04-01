package day26;

import day18.inter.swim;

public class Test2 {
    public static void main(String[] args) {
        method(new Swim() {
            @Override
            public void swimming(){
                System.out.println("正在游泳");
            }
        });
    }

        public static void method(Swim s){
            s.swimming();
        }
    }

    interface Swim{
        public abstract void swimming();
    }
