package com.wz.stringtest;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/14
 * Time: 20:47
 */
public class StringTest01 {

    public static void main(String[] args) {
        String s1="abc";
        char[] c2 = {'a','b','c'};
        StringBuilder builder = new StringBuilder();
        builder.append(s1);
        builder.append("123");
        System.out.println(builder);
        c2 = Arrays.copyOf(c2, 5);
        System.out.println(c2.length);

    }



}
