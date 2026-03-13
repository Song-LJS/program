package day8;

public class GirlTest {
    public static void main(String[] args) {
        GirlF[] arr = new GirlF[4];
        GirlF g1 = new GirlF(17,"女","追剧","刘家硕");
        GirlF g2 = new GirlF(19,"女","吃美食","刘大力");
        GirlF g3 = new GirlF(34,"女","打蛋仔","刘家硕一米八");
        GirlF g4 = new GirlF(18,"女","读书","刘某人");

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            GirlF gf = arr[i];
            sum+=gf.getAge();
        }

        double avg = sum/arr.length;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            GirlF gf = arr[i];
            if(arr[i].getAge()<avg){
                count++;
                System.out.println(gf.getAge()+" "+gf.getName()+
                " "+gf.getGender()+" "+gf.getHobby());
            }
        }
        System.out.println(count);
    }
}
