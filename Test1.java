package day7;

public class Test1 {
    public static void main(String[] args) {
        int[][] a = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int[] free = new int[4];
        int freeCount = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                freeCount += a[i][j];
                free[i] += a[i][j];
            }
        }
        System.out.println(freeCount);
        for(int i = 0;i<free.length;i++){
            System.out.print(free[i]+" ");
        }
    }
}
