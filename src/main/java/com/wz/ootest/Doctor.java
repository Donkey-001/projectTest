package com.wz.ootest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/13
 * Time: 17:29
 */
public class Doctor extends Person {

    public Integer level;

    public Doctor(String name, Integer age, String address, Integer level) {
        super(name, age, address);
        this.level = level;
    }
}
