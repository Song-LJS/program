package day25;

public class Test6 {
    public static void main(String[] args) {
        int[] a = {16,5,9,12,21,18,
                   32,23,37,26,45,34,
                   50,48,61,52,73,66};
        Block b1 = new Block(0,5,21);
        Block b2 = new Block(6,11,45);
        Block b3 = new Block(12,17,73);

        Block[] B = {b1,b2,b3};

        int n = 1;

        int Index = fun(a,B,n);
        if(Index>=0){
            System.out.println("该数字索引为"+Index);
        }else{
            System.out.println("该数字不存在");
        }
    }

    public static int fun(int[] a,Block[] B,int n){
        if(findIndex(B, n) == -1){
            return -1;
        }
        int Index = findIndex(B,n);
        for(int i = B[Index].getMinIndex();i<=B[Index].getMaxIndex();i++){
            if(a[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static int findIndex(Block[] B,int n){
        for(int i = 0;i<B.length;i++){
            if(n<=B[i].getMax()){
                return i;
            }
        }
        return -1;
    }

static class Block{
    private int minIndex;
    private int maxIndex;
    private int Max;
    
    public Block() {
    }

    public Block(int minIndex, int maxIndex, int max) {
        this.minIndex = minIndex;
        this.maxIndex = maxIndex;
        Max = max;
    }

    public int getMinIndex() {
        return minIndex;
    }

    public void setMinIndex(int minIndex) {
        this.minIndex = minIndex;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }

    
    
}
}
