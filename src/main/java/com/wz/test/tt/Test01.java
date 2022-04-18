package com.wz.test.tt;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/7
 * Time: 19:13
 */
public class Test01 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        //循环给数组赋初始值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        //用于存放数组中最大的值
        int max = arr[0];
        //找出数据中最大的值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("扩容前：");
        //输出数组中的值
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            ;
        }
        System.out.println();
        //输出max
        System.out.println("max = " + max);
        //数组扩容
        //第一个参数是需要扩容的数组 第二个参数扩大后的容量
        //数组扩容的原理是,重新创建一个传入的容量值的数组，然后再将之前的数组值赋值进去
        arr = Arrays.copyOf(arr, arr.length + 1);
        //将最大值赋值给最后一个元素 因为扩容了 容量加一 最后一个位置为0
        arr[arr.length - 1] = max;
        //输出扩容后的数组值
        System.out.println("扩容插入最大值后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("调用System.arraycopy方法后");
        expand(arr);
        System.out.println("使用Array中的sort方法排序");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("倒过来");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void expand(int[] arr) {
        //参数解释
        //第一个参数表示拷贝的原数组 第二个参数是拷贝原数组的起始下标
        //第三个参数是拷贝的目的数组 第四个参数是 拷贝到目的数组中的起始下标  第五个参数是 拷贝的长度
        //将arr中从下标为6的元素开始拷贝 拷贝到arr中从下标为2的元素中 拷贝长度为3
        //拷贝之前  29	47	15	39	96	26	96	90	66	87	96
        //拷贝之后  29	47	96	90	66	26	96	90	66	87	96
        System.arraycopy(arr, 6, arr, 2, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
