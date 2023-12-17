/**
 * -*- coding: utf-8 -*-
 * @time 2022/11/11 13:08
 * @author GMCY
 * @software IDEA
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppJDialog extends JDialog implements MouseListener {
    //========= 初始数据 ================================================================================================//
    AppJDialog Mainframe = this;
    static Point origin = new Point();
    Model model = new Model();
    int Button = 0;
    int alive = 1;

    //========= 加载窗口 ================================================================================================//
    public AppJDialog() {
        initJFrame();
        initJButton();
        initScroll();
        initJLabel();

        MyThread t1 = new MyThread();
        t1.start();

        this.setVisible(true);
    }

    //========= 主要窗口 ================================================================================================//
    public void initJFrame() {
        // 1.设置窗口大小
        this.setSize(822, 525);
        // 2.设置组件可自定义位置
        this.setLayout(null);
        // 3.设置为置顶
        this.setAlwaysOnTop(true);
        // 4.打开时居于桌面中间
        this.setLocationRelativeTo(null);
        // 5.设置窗体无外框
        this.setUndecorated(true);
        this.setModal(true);

    }

    //========= Label =================================================================================================//
    // 1.声明
    JLabel jLabel_bg = new JLabel();
    JLabel jLabel_press = new JLabel();
    JLabel jLabel_name = new JLabel();
    public void initJLabel() {
        // 2.设置文本
        jLabel_name.setText("◆设置");
        // 3.设置背景图片
        jLabel_bg.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\bg_set.png"));
        // 4.设置位置与大小
        jLabel_bg.setBounds(0, 0, 822, 525);
        jLabel_press.setBounds(0, 0, 822, 24);
        jLabel_name.setBounds(30, 20, 100, 60);
        // 5.a修饰
        jLabel_name.setFont(new Font("黑体", Font.BOLD, 25));

        jLabel_bg.setOpaque(true);
        jLabel_press.setOpaque(true);
        jLabel_name.setOpaque(true);

        jLabel_name.setForeground(new Color(57, 59, 64, 255));

        jLabel_press.setBackground(new Color(0, 0, 0, 0));
        jLabel_name.setBackground(new Color(0, 0, 0, 0));
        // 6.设置监听


        model.JFrame_press(Mainframe, jLabel_press, origin);

        // 加载到窗口
        this.getContentPane().add(jLabel_name);
        this.getContentPane().add(jLabel_press);
        this.getContentPane().add(jLabel_bg);
    }



    //========= 按钮相关 ================================================================================================//
    // 1.声明
    JButton jButton_normal_set = new JButton();
    JButton jButton_game_re = new JButton();
    JButton jButton_ver = new JButton();
    JButton jButton_cancel = new JButton();
    JButton jButton_Confirm = new JButton();
    JButton jButton_exit = new JButton();
    public void initJButton() {
        // 2.设置文本
        jButton_normal_set.setText("通用设置");
        jButton_game_re.setText("游戏资源");
        jButton_ver.setText("版本信息");
        jButton_cancel.setText("取消");
        jButton_Confirm.setText("确认");
        jButton_exit.setText("×");
        // 3.设置位置与大小
        jButton_normal_set.setBounds(4, 95, 222 ,47);
        jButton_game_re.setBounds(4, 142, 222 ,47);
        jButton_ver.setBounds(4, 189, 222 ,47);
        jButton_cancel.setBounds(395, 450, 190 ,45);
        jButton_Confirm.setBounds(600, 450, 190 ,45);
        jButton_exit.setBounds(750, 30, 45 ,45);
        // 4.修饰
        model.JButton_embellish_2(jButton_normal_set);
        model.JButton_embellish_1(jButton_game_re);
        model.JButton_embellish_1(jButton_ver);
        model.JButton_embellish_4(jButton_cancel);
        model.JButton_embellish_7(jButton_Confirm);
        model.JButton_embellish_10(jButton_exit);
        // 5.设置监听
        jButton_normal_set.addMouseListener(this);
        jButton_game_re.addMouseListener(this);
        jButton_ver.addMouseListener(this);
        jButton_cancel.addMouseListener(this);
        jButton_Confirm.addMouseListener(this);
        jButton_exit.addMouseListener(this);

        // 6.加载到窗口
        this.getContentPane().add(jButton_normal_set);
        this.getContentPane().add(jButton_game_re);
        this.getContentPane().add(jButton_ver);
        this.getContentPane().add(jButton_cancel);
        this.getContentPane().add(jButton_Confirm);
        this.getContentPane().add(jButton_exit);

        this.getContentPane().repaint();
    }



    //========= table相关 ===============================================================================================//
    JButton jButton_a1 = new JButton("使用另外一个文件夹");
    JButton jButton_a2 = new JButton("启动器更新");
    JButton jButton_a3 = new JButton("查看");

    JCheckBox jCheckBox_1 = new JCheckBox("开机自动启动");
    JCheckBox jCheckBox_2 = new JCheckBox("退出游戏时弹出");

    JRadioButton jRadioButton_1 = new JRadioButton("最小化到系统盘");
    JRadioButton jRadioButton_2 = new JRadioButton("退出启动器");
    JRadioButton jRadioButton_3 = new JRadioButton(" 无限制");
    JRadioButton jRadioButton_4 = new JRadioButton();

    JLabel jLabel_Path = new JLabel();

    JScrollPane scrollPane = null;
    public void initScroll() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, 580, 1000);
        jPanel.setBackground(new Color(253, 253, 253, 255));
        jPanel.setPreferredSize(new Dimension(140,1000));

        JLabel jLabel_1 = new JLabel("启动设置");
        JLabel jLabel_2 = new JLabel("关闭设置");
        JLabel jLabel_3 = new JLabel("下载限速");
        JLabel jLabel_4 = new JLabel("安装位置");
        JLabel jLabel_5 = new JLabel("启动器版本");
        JLabel jLabel_6 = new JLabel("启动器更新日志");
        JLabel jLabel_7 = new JLabel("关于");
        JLabel jLabel_8 = new JLabel("当前版本:");
        JLabel jLabel_9 = new JLabel("2.21.1.0");
        JLabel jLabel_10 = new JLabel("用户协议");
        JLabel jLabel_11 = new JLabel("隐私政策");
        JLabel jLabel_12 = new JLabel("Copyright c 2020 miHoYo All Rights Reserved");

        jLabel_1.setBounds(30, 0, 100, 42);
        jLabel_2.setBounds(30, 150, 200, 42);
        jLabel_3.setBounds(30, 300, 200, 42);
        jLabel_4.setBounds(30, 450, 200, 42);
        jLabel_5.setBounds(30, 600, 200, 42);
        jLabel_6.setBounds(30, 750, 200, 42);
        jLabel_7.setBounds(30, 860, 200, 42);

        jLabel_8.setBounds(30, 700, 80, 42);
        jLabel_9.setBounds(110, 700, 200, 42);
        jLabel_10.setBounds(30, 900, 70, 42);
        jLabel_11.setBounds(100, 900, 70, 42);
        jLabel_12.setBounds(30, 942, 400, 42);

        model.JLabel_embellish_a1(jLabel_1);
        model.JLabel_embellish_a1(jLabel_2);
        model.JLabel_embellish_a1(jLabel_3);
        model.JLabel_embellish_a1(jLabel_4);
        model.JLabel_embellish_a1(jLabel_5);
        model.JLabel_embellish_a1(jLabel_6);
        model.JLabel_embellish_a1(jLabel_7);
        model.JLabel_embellish_b1(jLabel_8);
        model.JLabel_embellish_b1(jLabel_9);
        model.JLabel_embellish_b2(jLabel_10);
        model.JLabel_embellish_b2(jLabel_11);
        model.JLabel_embellish_b1(jLabel_12);

        jPanel.add(jLabel_1);
        jPanel.add(jLabel_2);
        jPanel.add(jLabel_3);
        jPanel.add(jLabel_4);
        jPanel.add(jLabel_5);
        jPanel.add(jLabel_6);
        jPanel.add(jLabel_7);
        jPanel.add(jLabel_8);
        jPanel.add(jLabel_9);
        jPanel.add(jLabel_10);
        jPanel.add(jLabel_11);
        jPanel.add(jLabel_12);

        jCheckBox_1.setBounds(30, 42, 200, 42);
        jCheckBox_2.setBounds(30, 84, 200, 42);

        model.JCheckBox_embellish_1(jCheckBox_1);
        model.JCheckBox_embellish_1(jCheckBox_2);


        jCheckBox_1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\check_1.png"));
        jCheckBox_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\check_2.png"));

        jCheckBox_1.addItemListener(e -> jCheckBox_1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "check_1.png" : "check_2.png"))));
        jCheckBox_2.addItemListener(e -> jCheckBox_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "check_1.png" : "check_2.png"))));

        jPanel.add(jCheckBox_1);
        jPanel.add(jCheckBox_2);

        jRadioButton_1.setBounds(30, 200, 200, 42);
        jRadioButton_2.setBounds(30, 242, 200, 42);
        jRadioButton_3.setBounds(30, 342, 200, 42);
        jRadioButton_4.setBounds(30, 384, 30, 42);

        model.JRadioButton_embellish_1(jRadioButton_1);
        model.JRadioButton_embellish_1(jRadioButton_2);
        model.JRadioButton_embellish_1(jRadioButton_3);
        model.JRadioButton_embellish_1(jRadioButton_4);

        jRadioButton_1.setIcon(new ImageIcon("\\src\\resoure\\rad_1.png"));
        jRadioButton_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\rad_2.png"));
        jRadioButton_3.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\rad_1.png"));
        jRadioButton_4.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\rad_2.png"));

        jRadioButton_1.addItemListener(e -> jRadioButton_1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_1.png" : "rad_2.png"))));
        jRadioButton_1.addItemListener(e -> jRadioButton_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_2.png" : "rad_1.png"))));
        jRadioButton_2.addItemListener(e -> jRadioButton_1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_1.png" : "rad_2.png"))));
        jRadioButton_2.addItemListener(e -> jRadioButton_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_2.png" : "rad_1.png"))));
        jRadioButton_3.addItemListener(e -> jRadioButton_3.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_1.png" : "rad_2.png"))));
        jRadioButton_3.addItemListener(e -> jRadioButton_4.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_2.png" : "rad_1.png"))));
        jRadioButton_4.addItemListener(e -> jRadioButton_3.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_1.png" : "rad_2.png"))));
        jRadioButton_4.addItemListener(e -> jRadioButton_4.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\resoure\\" +  (e.getStateChange() == ItemEvent.SELECTED ? "rad_2.png" : "rad_1.png"))));

        jPanel.add(jRadioButton_1);
        jPanel.add(jRadioButton_2);
        jPanel.add(jRadioButton_3);

        jLabel_Path.setBounds(30, 500, 500, 42);

        jLabel_Path.setText(System.getProperty("user.dir"));

        model.JLabel_embellish_path(jLabel_Path);

        jPanel.add(jLabel_Path);

        jButton_a1.setBounds(30, 550, 250, 42);
        jButton_a2.setBounds(30, 650, 250, 42);
        jButton_a3.setBounds(30, 800, 250, 42);

        model.JButton_embellish_4(jButton_a1);
        model.JButton_embellish_4(jButton_a2);
        model.JButton_embellish_4(jButton_a3);

        jButton_a1.addMouseListener(this);
        jButton_a2.addMouseListener(this);
        jButton_a3.addMouseListener(this);

        jPanel.add(jButton_a1);
        jPanel.add(jButton_a2);
        jPanel.add(jButton_a3);

        JTextField jTextField = new JTextField("4096");

        jTextField.setBounds(80, 384, 100, 42);

        jTextField.setOpaque(true);
        // jTextField.setBackground(new Color(0, 0, 0 ,0));
        jTextField.setFont(new Font("幼圆", Font.BOLD, 20));
        jTextField.setForeground(new Color(134, 139, 120, 255));

        jPanel.add(jTextField);

        jPanel.add(jRadioButton_4);

        JLabel jLabel_99 = new JLabel("KB/S (100-10240)");
        jLabel_99.setBounds(200, 384, 400, 42);

        model.JLabel_embellish_path(jLabel_99);
        jLabel_99.setBackground(new Color(253, 253, 253, 255));


        jPanel.add(jLabel_99);

        scrollPane = new JScrollPane(
                jPanel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
        );


        // 227 95 588 328
        scrollPane.setBounds(227 ,95, 580, 327);

        scrollPane.setBorder(null);

        scrollPane.setBackground(new Color(253, 253, 253, 255));



        scrollPane.getVerticalScrollBar().setUnitIncrement(30);
        scrollPane.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane.getViewport().setScrollMode(JViewport.SIMPLE_SCROLL_MODE);

        scrollPane.getVerticalScrollBar().setUI(new NewScrollBarUI());

        // 设置背景不透明
        // scrollPane.setOpaque(false);

        this.getContentPane().add(scrollPane);
        this.getContentPane().repaint();

    }

    //========= ?????? ================================================================================================//


    class MyThread extends Thread{
        @Override
        public void run() {
            while (alive == 1) {
                if (scrollPane.getVerticalScrollBar().getValue() == 0 && Button != 0) {
                    System.out.println(0);
                }
                else if (scrollPane.getVerticalScrollBar().getValue() == 450 && Button != 1) {
                    System.out.println(450);
                }
                else if (scrollPane.getVerticalScrollBar().getValue() == 600 && Button != 2) {
                    System.out.println(600);
                }
            }
        }
    }


    //========= 鼠标事件 ================================================================================================//
    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButton_normal_set) {
            model.JButton_embellish_2(jButton_normal_set);
            model.JButton_embellish_1(jButton_game_re);
            model.JButton_embellish_1(jButton_ver);
            Button = 0;
            scrollPane.getVerticalScrollBar().setValue(0);
        }
        else if (obj == jButton_game_re) {
            model.JButton_embellish_1(jButton_normal_set);
            model.JButton_embellish_2(jButton_game_re);
            model.JButton_embellish_1(jButton_ver);
            Button = 1;
            scrollPane.getVerticalScrollBar().setValue(450);
        }
        else if (obj == jButton_ver) {
            model.JButton_embellish_1(jButton_normal_set);
            model.JButton_embellish_1(jButton_game_re);
            model.JButton_embellish_2(jButton_ver);
            Button = 2;
            scrollPane.getVerticalScrollBar().setValue(600);
        }
        else if (obj == jButton_cancel) {
            this.setVisible(false);
        }
        else if (obj == jButton_exit) {
            this.setVisible(false);
            alive = 0;
        }


        this.getContentPane().repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButton_cancel) {
            model.JButton_embellish_6(jButton_cancel);
        }
        else if (obj == jButton_Confirm) {
            model.JButton_embellish_9(jButton_Confirm);
        }
        else if (obj == jButton_a1) {
            model.JButton_embellish_6(jButton_a1);
        }
        else if (obj == jButton_a2) {
            model.JButton_embellish_6(jButton_a2);
        }
        else if (obj == jButton_a3) {
            model.JButton_embellish_6(jButton_a3);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButton_cancel) {
            model.JButton_embellish_4(jButton_cancel);
        }
        else if (obj == jButton_Confirm) {
            model.JButton_embellish_7(jButton_Confirm);
        }
        else if (obj == jButton_a1) {
            model.JButton_embellish_4(jButton_a1);
        }
        else if (obj == jButton_a2) {
            model.JButton_embellish_4(jButton_a2);
        }
        else if (obj == jButton_a3) {
            model.JButton_embellish_4(jButton_a3);
        }

}

    @Override
    public void mouseEntered(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButton_normal_set) {
            if (Button != 0) {
                model.JButton_embellish_3(jButton_normal_set);
            }
        }
        else if (obj == jButton_game_re) {
            if (Button != 1) {
                model.JButton_embellish_3(jButton_game_re);
            }
        }
        else if (obj == jButton_ver) {
            if (Button != 2) {
                model.JButton_embellish_3(jButton_ver);
            }
        }
        else if (obj == jButton_cancel) {
            model.JButton_embellish_5(jButton_cancel);
        }
        else if (obj == jButton_Confirm) {
            model.JButton_embellish_8(jButton_Confirm);
        }
        else if (obj == jButton_exit) {
            model.JButton_embellish_11(jButton_exit);
        }
        else if (obj == jButton_a1) {
            model.JButton_embellish_5(jButton_a1);
        }
        else if (obj == jButton_a2) {
            model.JButton_embellish_5(jButton_a2);
        }
        else if (obj == jButton_a3) {
            model.JButton_embellish_5(jButton_a3);
        }

        this.getContentPane().repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == jButton_normal_set) {
            if (Button == 0) {
                model.JButton_embellish_2(jButton_normal_set);
            }
            else {
                model.JButton_embellish_1(jButton_normal_set);
            }
        }
        else if (obj == jButton_game_re) {
            if (Button == 1) {
                model.JButton_embellish_2(jButton_game_re);
            }
            else {
                model.JButton_embellish_1(jButton_game_re);
            }
        }
        else if (obj == jButton_ver) {
            if (Button == 2) {
                model.JButton_embellish_2(jButton_ver);
            }
            else {
                model.JButton_embellish_1(jButton_ver);
            }
        }
        else if (obj == jButton_cancel) {
            model.JButton_embellish_4(jButton_cancel);
        }
        else if (obj == jButton_Confirm) {
            model.JButton_embellish_7(jButton_Confirm);
        }
        else if (obj == jButton_exit) {
            model.JButton_embellish_10(jButton_exit);
        }
        else if (obj == jButton_a1) {
            model.JButton_embellish_4(jButton_a1);
        }
        else if (obj == jButton_a2) {
            model.JButton_embellish_4(jButton_a2);
        }
        else if (obj == jButton_a3) {
            model.JButton_embellish_4(jButton_a3);
        }

        this.getContentPane().repaint();

    }


}
