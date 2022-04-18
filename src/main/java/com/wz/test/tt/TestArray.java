package com.wz.test.tt;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/11
 * Time: 9:10
 */
public class TestArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {9, 8, 7, 6, 5, 4};
        //这个方法是将a数组(第一个参数)从下标0开始(第二个参数)赋值到b数组中(第三个参数)，从b的下表为0(第四个参数)开始覆盖,覆盖长度为6(第五个参数)
        System.arraycopy(a, 0, b, 0, 6);
        for (int i : b) {
            //System.out.print(i);
            for (int i1 : a) {
                System.out.print(i + "-->" + i1+"     ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
