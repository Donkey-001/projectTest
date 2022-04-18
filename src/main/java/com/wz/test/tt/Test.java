package com.wz.test.tt;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Donkey
 * Date: 2022/4/6
 * Time: 15:34
 */
public class Test {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Administrator\\Desktop\\03.xlsx";
        EasyExcel.write(fileName, TestEasyExcel.class).sheet("学生列表").doWrite(getData());
    }

    public static List<TestEasyExcel> getData(){
        List<TestEasyExcel> list = new ArrayList<>();
        TestEasyExcel test = new TestEasyExcel();
        test.setName("学生姓名1");
        test.setBName("学生姓名2");
        test.setCnAme("学生姓名3");
        test.setDnaMe("学生姓名4");
        test.setEnamE("学生姓名5");
        list.add(test);
        return list;
    }

}
