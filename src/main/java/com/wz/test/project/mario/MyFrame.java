package com.wz.test.project.mario;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/11
 * Time: 11:06
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
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
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
