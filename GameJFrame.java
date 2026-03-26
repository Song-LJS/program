package day19and20;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;

public class GameJFrame extends JFrame implements KeyListener{
    int[][] data = new int[4][4];
    int x = 0;
    int y = 0;
    String path = "D:\\Code\\Java学习\\day19and20\\photo\\拼图图片\\";
    
    public GameJFrame(){
        initJFrame();

        initJMenu();

        initData();

        initImage();

        this.addKeyListener(this);
        this.setVisible(true);
    }

    public void initData(){
        int[] t = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for(int i = 0;i<t.length;i++){
            int index = r.nextInt(16);
            int temp = t[i];
            t[i] = t[index];
            t[index] = temp;
        }
        for(int i = 0;i<16;i++){
            if(t[i]==0){
                x = i/4;
                y = i%4;
            }
                data[i/4][i%4] = t[i];
        }
    }

    public void initImage(){
        this.getContentPane().removeAll();

        for(int i = 0;i<=3;i++){
            for(int j = 0;j<=3;j++){
                int number = data[i][j];
                JLabel jLabel1  = new JLabel(new ImageIcon("day19and20\\photo\\拼图图片\\"+number+".jpg"));
        jLabel1.setBounds(100*j+100,100*i+110,100,100);
        jLabel1.setBorder(new BevelBorder(1));
        //this.add(jLabel);
        this.getContentPane().add(jLabel1);
            }
        }

         JLabel background = new JLabel(new ImageIcon("day19and20\\photo\\拼图图片\\image.jpg"));
        background.setBounds(40, 40, 515, 560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();
    }

    public void initJFrame(){
        this.setSize(600,680);
        this.setTitle("拼图小游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    public void initJMenu(){
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登陆");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        this.getContentPane().removeAll();
        if(code == 65){
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(100, 110, 400, 400);
            this.getContentPane().add(all);

            JLabel background = new JLabel(new ImageIcon("day19and20\\photo\\拼图图片\\image.jpg"));
        background.setBounds(40, 40, 515, 560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 37){
            if(y == 3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            System.out.println("向左移动");
            initImage();
        }else if(code == 38){
            if(x == 3){
                return;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            System.out.println("向上移动");
            initImage();
        }else if(code == 39){
            if(y == 0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            System.out.println("向右移动");
            initImage();
        }else if(code == 40){
            if(x == 0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            System.out.println("向下移动");
            initImage();
        }else if(code == 65){
            initImage();
        }
    }
}
