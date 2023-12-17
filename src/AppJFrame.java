/**
 * -*- coding: utf-8 -*-
 * @time 2022/11/11 13:08
 * @author GMCY
 * @software IDEA
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class AppJFrame extends JFrame implements MouseListener {
    //========= 初始数据 ================================================================================================//
    AppJFrame Mainframe = this;
    static Point origin = new Point();
    Model model = new Model();
    String download_file = String.valueOf(new File(System.getProperty("user.dir") + "\\src\\resoure\\genshin.jpg"));
    ImageIcon trayImg = new ImageIcon(download_file);

    //========= 加载窗口 =====================================================================================================//
    public AppJFrame() {
        initJFrame();
        initJButton();
        initJLabel();
        this.setVisible(true);
    }



    //========= 主要窗口 =====================================================================================================//
    public void initJFrame() {
        // 1.设置窗口大小
        this.setSize(1280, 730);
        // 2.设置组件可自定义位置
        this.setLayout(null);
        // 3.设置为置顶
        this.setAlwaysOnTop(true);
        // 4.打开时居于桌面中间
        this.setLocationRelativeTo(null);
        // 5.设置窗体无外框
        this.setUndecorated(true);
        // 6.设置背景图片
        this.setIconImage(trayImg.getImage());

    }



    //========= Label ======================================================================================================//
    // 1.声明
    JLabel jLabelBg = new JLabel();           // 背景
    JLabel jLabelStatusBar = new JLabel();    // 状态栏
    JLabel jLabelName = new JLabel();         // 名称
    JLabel jLabelVer = new JLabel();          // 版本
    public void initJLabel() {
        // 2.设置文本
        jLabelName.setText("原神");
        jLabelVer.setText("3.2.0");
        // 3.设置背景
        jLabelBg.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\bg2.png"));
        // 4.设置位置与大小
        jLabelBg.setBounds(0, 0, 1290, 730);
        jLabelStatusBar.setBounds(0, 0, 1290, 42);
        jLabelName.setBounds(10, 0, 40, 42);
        jLabelVer.setBounds(50, 0, 50, 42);
        // 5.修饰
        model.JLabel_embellish_1(jLabelName);
        model.JLabel_embellish_2(jLabelVer);
        model.JLabel_embellish_3(jLabelStatusBar);
        // 6.设置监听
        jLabelStatusBar.addMouseListener(this);

        model.JFrame_press(Mainframe, jLabelStatusBar, origin);
        // 加载到窗口
        this.getContentPane().add(jLabelName);
        this.getContentPane().add(jLabelVer);
        this.getContentPane().add(jLabelStatusBar);
        this.getContentPane().add(jLabelBg);
    }



    //========= 按钮相关 =====================================================================================================//
    // 1.声明
    JButton jButtonExit = new JButton();        // 退出
    JButton jButtonMin = new JButton();         // 最小化
    JButton jButtonSet = new JButton();         // 设置
    JButton jButtonStart = new JButton();       // 开始游戏
    JButton jButtonStartSet = new JButton();    // 开始游戏的设置
    public void initJButton() {
        // 2.设置文本
        jButtonExit.setText("×");
        jButtonMin.setText("-");
        // jButtonSet.setText("O");
        jButtonSet.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\Set.png"));
        jButtonStart.setText("开始游戏");
        jButtonStartSet.setText("≡");
        // 3.设置位置与大小
        jButtonExit.setBounds(1240,0, 40,42);
        jButtonMin.setBounds(1200, 0, 40,42);
        jButtonSet.setBounds(1160, 0, 40,42);
        jButtonStart.setBounds(900, 600, 200,70);
        jButtonStartSet.setBounds(1101, 600, 50,70);
        // 4.修饰
        model.JButton_embellish_a1(jButtonExit);
        model.JButton_embellish_a1(jButtonMin);
        jButtonMin.setFont(new Font("黑体", Font.BOLD, 30));
        model.JButton_embellish_a1(jButtonSet);
        model.JButton_embellish_a3(jButtonStart);
        model.JButton_embellish_a3(jButtonStartSet);
        // 5.设置监听
        jButtonExit.addMouseListener(this);
        jButtonMin.addMouseListener(this);
        jButtonSet.addMouseListener(this);
        jButtonStart.addMouseListener(this);
        jButtonStartSet.addMouseListener(this);
        // 加载到窗口
        this.getContentPane().add(jButtonExit);
        this.getContentPane().add(jButtonMin);
        this.getContentPane().add(jButtonSet);
        this.getContentPane().add(jButtonStart);
        this.getContentPane().add(jButtonStartSet);

        this.getContentPane().repaint();
    }

    //========= 鼠标事件 =====================================================================================================//
    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButtonExit) {
            System.out.println("exit");
            System.exit(0);
        }
        else if (obj == jButtonMin) {
            this.setExtendedState(JFrame.ICONIFIED);
        }
        else if (obj == jButtonSet) {
            jButtonSet.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\Set.png"));
            new AppJDialog();

        }
        else if (obj == jButtonStart) {
            System.out.println("开始游戏");
        }
        else if (obj == jButtonStartSet) {
            System.out.println("≡");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButtonStart) {
            model.JButton_embellish_a4(jButtonStart);
        }
        else if (obj == jButtonStartSet) {
            model.JButton_embellish_a4(jButtonStartSet);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButtonStart) {
            model.JButton_embellish_a3(jButtonStart);
        }
        else if (obj == jButtonStartSet) {
            model.JButton_embellish_a3(jButtonStartSet);
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButtonExit) {
            model.JButton_embellish_a2(jButtonExit);
            jButtonExit.setBackground(new Color(244, 91, 49, 255));
        }
        else if (obj == jButtonMin) {
            model.JButton_embellish_a2(jButtonMin);
            jButtonMin.setFont(new Font("黑体", Font.BOLD, 30));
        }
        else if (obj == jButtonSet) {
            jButtonSet.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\Set_2.png"));

        }

        this.getContentPane().repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButtonExit) {
            model.JButton_embellish_a1(jButtonExit);
        }
        else if (obj == jButtonMin) {
            model.JButton_embellish_a1(jButtonMin);
            jButtonMin.setFont(new Font("黑体", Font.BOLD, 30));
        }
        else if (obj == jButtonSet) {
            jButtonSet.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\Set.png"));

        }
    }
}
