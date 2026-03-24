package day19;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameJFrame extends JFrame{
    
    public GameJFrame(){
        initJFrame();

        initJMenu();
        this.setVisible(true);
    }

    public void initJFrame(){
        this.setSize(603,680);
        this.setTitle("拼图小游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
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
}
