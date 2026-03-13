package day8;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] g = new Goods[3];
        Goods g1 = new Goods("24012358","沐浴露",52.52,12);
        Goods g2 = new Goods("12345667","洗发膏",23.44,32);
        Goods g3 = new Goods("32454532","发膜",324.32,43);
        
        g[0] = g1;
        g[1] = g2;
        g[2] = g3;
        
        for(int i = 0;i<g.length;i++){
            System.out.println(g[i].getName());
        }
    }
}
