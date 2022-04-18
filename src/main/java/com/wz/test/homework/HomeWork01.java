package com.wz.test.homework;

import java.util.Random;
import java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 *
 * @author: Donkey
 * Date: 2022/4/7
 * Time: 10:50
 */
public class HomeWork01 {
    public static void main(String[] args) {
        //总题数
        int count = 10;
        //用于记录总分的变量
        int score = 0;
        //获取用户输入
        Scanner scanner = new Scanner(System.in);
        //随机数对象
        Random random = new Random();
        //循环生成10道两位数计算题
        for (int i = 0; i < count; i++) {
            //生成两个随机数   [0,100)范围内的
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            //将算式输出
            System.out.print(num1 + "+" + num2 + "=");
            //判断用户输入的值是否等于两个随机数相加的结果
            if (scanner.nextInt() == num1 + num2) {
                System.out.println("答对了");
                //总分+10
                score += 10;
            } else {
                System.out.println("答错了");
            }
        }
        //输出总分
        System.out.println("你的总分为" + score);
    }
}
