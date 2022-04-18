package com.wz.test.testmario.frame;

import com.wz.test.testmario.bgmusic.Music;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/11
 * Time: 15:11
 */
public class MyFrame extends JFrame implements KeyListener {

    public MyFrame(){
        //游戏窗口大小
        this.setSize(800, 600);
        //让窗口在屏幕中居中显示
        this.setLocationRelativeTo(null);
        //窗口是否可见
        this.setVisible(true);
        //设置 点击窗口上面的关闭叉叉 按键 关闭窗口结束程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小不可变
        this.setResizable(false);
        //用户操作会使用键盘 此时本类需要实现键盘监听接口
        this.addKeyListener(this);
        //设置窗口名称
        this.setTitle("超级玛丽");
        //设置背景图片
        ImageIcon img = new ImageIcon("src/main/java/com/wz/test/testmario/images/bg.jpg");
        JPanel panel = new JPanel();
        //将背景图片放入标签中
        JLabel label = new JLabel(img);
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        //设置背景图片位置
        label.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        Container pane = this.getContentPane();
        pane.setLayout(new BorderLayout());
        //创建按钮
        JButton but=new JButton("anniu");
        //将按钮添加入窗口的内容面板
        pane.add(but,"North");
        //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。
        ((JPanel)pane).setOpaque(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
