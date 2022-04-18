package com.wz.ootest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/13
 * Time: 17:29
 */
public class Teacher extends Person {

    public double salary;

    public Teacher(String name, Integer age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }
}
