import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * 一些通过Java swing快捷搭建窗口的方法
 * @author GMCY
 * @version  1.0
 */
public class Model {
    /**
     * 鼠标按住组件来移动主窗体
     *
     * @param MainJFrame 主窗体
     * @param frame      组件
     * @param origin     主窗体坐标
     */
    public void JFrame_press(AppJDialog MainJFrame, JLabel frame, Point origin) {
        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                origin.x = e.getX();
                origin.y = e.getY();
            }
        });

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point p = MainJFrame.getLocation();
                MainJFrame.setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
            }
        });
    }

    public void JFrame_press(AppJFrame MainJFrame, JLabel frame, Point origin) {
        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                origin.x = e.getX();
                origin.y = e.getY();
            }
        });

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point p = MainJFrame.getLocation();
                MainJFrame.setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
            }
        });
    }

    /**
     * 按钮修饰 1
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_1(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(134, 139, 150, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(245, 244, 242, 255));
    }


    /**
     * 按钮修饰 2
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_2(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(57, 59, 64, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(253, 253, 253, 255));
    }


    /**
     * 按钮修饰 3
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_3(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(57, 59, 64, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(236, 235, 234, 255));
    }

    /**
     * 按钮修饰 4
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_4(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(219, 187, 103, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(true);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(253, 253, 253, 255));

        jButton.setBorder(BorderFactory.createLineBorder(new Color(184, 184, 184, 255)));
    }

    /**
     * 按钮修饰 5
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_5(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(229, 213, 167, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(true);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(250, 247, 238, 255));

        jButton.setBorder(BorderFactory.createLineBorder(new Color(184, 184, 184, 255)));
    }

    /**
     * 按钮修饰 6
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_6(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(229, 213, 167, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(true);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(235, 232, 224, 255));

        jButton.setBorder(BorderFactory.createLineBorder(new Color(184, 184, 184, 255)));
    }


    /**
     * 按钮修饰 7
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_7(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(229, 213, 167, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(57, 59, 64, 255));
    }


    /**
     * 按钮修饰 8
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_8(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(229, 213, 167, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(77, 79, 83, 255));
    }

    /**
     * 按钮修饰 9
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_9(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(229, 213, 167, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(51, 53, 57, 255));
    }

    /**
     * 按钮修饰 10
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_10(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(57, 59, 64, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 36));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(253, 253, 253, 255));
    }

    /**
     * 按钮修饰 11
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_11(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(229, 213, 167, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 36));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(253, 253, 253, 255));
    }


    /**
     * JLabel修饰 1
     *
     * @param jLabel 要修饰的按钮
     */
    public void JLabel_embellish_1(JLabel jLabel) {
        // 设置文本颜色
        jLabel.setForeground(new Color(215, 247, 246, 255));
        // 设置文本的类型，大小
        jLabel.setFont(new Font("幼圆", Font.BOLD, 14));
        // 设置背景不透明
        jLabel.setOpaque(true);
        // 设置按钮背景色
        jLabel.setBackground(new Color(20, 20, 20, 255));
    }

    /**
     * JLabel修饰 2
     *
     * @param jLabel 要修饰的按钮
     */
    public void JLabel_embellish_2(JLabel jLabel) {
        // 设置文本颜色
        jLabel.setForeground(new Color(60, 60, 60, 255));
        // 设置文本的类型，大小
        jLabel.setFont(new Font("幼圆", Font.BOLD, 16));
        // 设置背景不透明
        jLabel.setOpaque(true);
        // 设置按钮背景色
        jLabel.setBackground(new Color(20, 20, 20, 255));
    }

    /**
     * JLabel修饰 2
     *
     * @param jLabel 要修饰的按钮
     */
    public void JLabel_embellish_3(JLabel jLabel) {
        // 设置背景不透明
        jLabel.setOpaque(true);
        // 设置按钮背景色
        jLabel.setBackground(new Color(20, 20, 20, 255));
    }

    /**
     * 按钮修饰 a1
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_a1(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(184, 184, 184, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("黑体", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(20, 20, 20, 255));
    }

    /**
     * 按钮修饰 a2
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_a2(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(184, 184, 184, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("黑体", Font.BOLD, 20));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(53, 53, 53, 255));
    }

    /**
     * 按钮修饰 a3
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_a3(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(112, 74, 27, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 30));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(253, 197, 8, 255));
    }

    /**
     * 按钮修饰 a4
     *
     * @param jButton 要修饰的按钮
     */
    public void JButton_embellish_a4(JButton jButton) {
        // 设置文本
        // jButton.setText("");
        // 设置文本居于按钮位置
        jButton.setMargin(new Insets(0, 0, 0, 0));
        // 设置文本颜色
        jButton.setForeground(new Color(112, 74, 27, 255));
        // 设置文本的类型，大小
        jButton.setFont(new Font("幼圆", Font.BOLD, 30));
        // 设置按钮的位置、大小
        // jButton.setBounds(0, 0, 0, 0);

        // 设置文本无边框
        jButton.setFocusPainted(false);
        // 设置按钮无边框
        jButton.setBorderPainted(false);
        // 设置内容域为无
        jButton.setContentAreaFilled(false);
        // 设置背景不透明
        jButton.setOpaque(true);
        // 设置按钮背景色
        jButton.setBackground(new Color(240, 182, 5, 255));
    }


    /**
     * JLabel修饰 a1
     *
     * @param jLabel 要修饰的按钮
     */
    public void JLabel_embellish_a1(JLabel jLabel) {
        // 设置文本颜色
        jLabel.setForeground(new Color(57, 59, 64, 255));
        // 设置文本的类型，大小
        jLabel.setFont(new Font("幼圆", Font.BOLD, 20));
        // 设置背景不透明
        jLabel.setOpaque(true);
        // 设置按钮背景色
        jLabel.setBackground(new Color(253, 253, 253, 255));
    }

    public void JCheckBox_embellish_1(JCheckBox jCheckBox) {
        jCheckBox.setForeground(new Color(134, 139, 150, 255));
        jCheckBox.setFont(new Font("幼圆", Font.PLAIN, 18));
        jCheckBox.setFocusPainted(false);
        jCheckBox.setBorderPainted(false);
        jCheckBox.setContentAreaFilled(false);
        jCheckBox.setOpaque(true);
        jCheckBox.setBackground(new Color(253, 253, 253, 255));



    }

    public void JRadioButton_embellish_1(JRadioButton jRadioButton) {
        jRadioButton.setForeground(new Color(134, 139, 150, 255));
        jRadioButton.setFont(new Font("幼圆", Font.PLAIN, 18));
        jRadioButton.setFocusPainted(false);
        jRadioButton.setBorderPainted(false);
        jRadioButton.setContentAreaFilled(false);
        jRadioButton.setOpaque(true);
        jRadioButton.setBackground(new Color(253, 253, 253, 255));

    }


    public void JLabel_embellish_path(JLabel jLabel) {
        // 设置文本颜色
        jLabel.setForeground(new Color(134, 139, 150, 255));
        // 设置文本的类型，大小
        jLabel.setFont(new Font("幼圆", Font.BOLD, 18));
        // 设置背景不透明
        jLabel.setOpaque(true);
        // 设置按钮背景色
        jLabel.setBackground(new Color(245, 244, 242, 255));
    }

    public void JLabel_embellish_b1(JLabel jLabel) {
        // 设置文本颜色
        jLabel.setForeground(new Color(174, 176, 178, 255));
        // 设置文本的类型，大小
        jLabel.setFont(new Font("幼圆", Font.BOLD, 15));
        // 设置背景不透明
        jLabel.setOpaque(true);
        // 设置按钮背景色
        jLabel.setBackground(new Color(253, 253, 253, 255));
    }

    public void JLabel_embellish_b2(JLabel jLabel) {
        // 设置文本颜色
        jLabel.setForeground(new Color(219, 187, 103, 255));
        // 设置文本的类型，大小
        jLabel.setFont(new Font("幼圆", Font.BOLD, 15));
        // 设置背景不透明
        jLabel.setOpaque(true);
        // 设置按钮背景色
        jLabel.setBackground(new Color(253, 253, 253, 255));
    }

}