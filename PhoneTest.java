package day8;

public class PhoneTest {
    public static void main(String[] args) {
        
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("小米","白色",1);
        Phone p2 = new Phone("华为","黑色",1);
        Phone p3 = new Phone("红米","蓝色",1);
        double sum = 0;
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        
        for(int i = 0;i<arr.length;i++){
            sum += arr[i].getPrice();
        }
        double avg = sum/arr.length;
        System.out.println(avg);
    }
}
