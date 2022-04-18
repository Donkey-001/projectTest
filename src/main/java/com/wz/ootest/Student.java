package com.wz.ootest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/13
 * Time: 17:27
 */
public class Student extends Person{

    public String stuId;

    public Student(String name, Integer age, String address, String stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }

}
